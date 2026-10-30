package io.github.dizy33.anavasi.data.catalog

import java.net.URI
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId
import java.time.DateTimeException
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

object CatalogCodec {
    private val json = Json { encodeDefaults = true }
    fun decode(raw: String): Catalog {
        val catalog = json.decodeFromString<Catalog>(raw)
        validate(catalog)
        return catalog
    }
    fun encode(catalog: Catalog): String {
        validate(catalog)
        return json.encodeToString(catalog)
    }

    fun validate(c: Catalog) {
        require(c.formatVersion == 1) { "Unsupported catalog format" }
        require(c.releaseVersion > 0) { "Invalid release version" }
        val verified = date(c.verifiedOn)
        val allIds = c.regions.map { it.id } + c.olympiads.map { it.id } +
            c.events.map { it.id } + c.news.map { it.id } + c.materials.map { it.id } + c.guidance.map { it.id }
        require(allIds.all { it.matches(Regex("[a-z0-9]+(?:-[a-z0-9]+)*")) }) { "Invalid ID" }
        require(allIds.toSet().size == allIds.size) { "Duplicate ID" }
        require(c.olympiads.isNotEmpty()) { "No Olympiads" }
        val regions = c.regions.map { it.id }.toSet()
        val olympiads = c.olympiads.associateBy { it.id }
        fun evidence(e: Evidence) {
            https(e.sourceUrl)
            require(!date(e.verifiedOn).isAfter(verified)) { "Evidence newer than catalog verification" }
        }
        fun territories(ids: List<String>) {
            require(ids.distinct().size == ids.size && regions.containsAll(ids)) { "Unknown or repeated territory" }
        }
        fun scope(oid: String, grades: List<Int>, ids: List<String>, stage: String) {
            val o = requireNotNull(olympiads[oid]) { "Unknown Olympiad" }
            validGrades(grades)
            require(o.grades.containsAll(grades)) { "Grade outside Olympiad eligibility" }
            territories(ids)
            require(stage in setOf("school", "municipal", "regional", "selection", "final")) { "Invalid stage" }
        }
        c.regions.forEach { require(it.title.isNotBlank()) }
        require(c.coverage.map { it.regionId }.distinct().size == c.coverage.size)
        c.coverage.forEach {
            require(it.regionId in regions && it.status in setOf("verified", "partial", "unavailable"))
            require(it.message.isNotBlank()); evidence(it.evidence)
        }
        c.olympiads.forEach { require(it.title.isNotBlank()); validGrades(it.grades); evidence(it.evidence) }
        c.materials.forEach {
            scope(it.olympiadId, it.grades, it.regionIds, it.stage); evidence(it.evidence)
            require(it.title.isNotBlank() && it.round.isNotBlank())
            require(it.academicYear.matches(Regex("20[0-9]{2}/[0-9]{2}")))
            val year = it.academicYear.take(4).toInt()
            require(it.academicYear.takeLast(2).toInt() == (year + 1) % 100)
            val kinds = setOf("tasks", "answers", "criteria", "illustrations", "combined")
            require(it.kind in kinds)
            require(it.documentKinds.all { k -> k in kinds - "combined" })
            require(it.documentKinds.distinct().size == it.documentKinds.size)
            if (it.documentKinds.isNotEmpty()) {
                require(if (it.kind == "combined") it.documentKinds.size >= 2 else it.documentKinds == listOf(it.kind))
            }
            require(it.availability in setOf("pdf", "unpublished", "unavailable", "non_pdf"))
            if (it.availability == "pdf") { https(requireNotNull(it.fileUrl)); }
            else { require(it.fileUrl == null && !it.reason.isNullOrBlank()) { "Missing gap reason or misleading file URL" } }
        }
        c.events.forEach {
            scope(it.olympiadId, it.grades, it.regionIds, it.stage); evidence(it.evidence)
            require(it.title.isNotBlank())
            require(it.kind in setOf("conduct", "registration_open", "registration_deadline", "scheduled"))
            require(it.timing in setOf("confirmed", "window", "unknown"))
            if (it.timing == "unknown") require(it.startDate == null && it.endDate == null && it.localTime == null)
            else {
                val start = date(requireNotNull(it.startDate))
                val end = it.endDate?.let(::date) ?: start
                require(!end.isBefore(start)) { "Reversed event range" }
                if (it.kind.startsWith("registration_")) require(start == end) { "Registration is a boundary, not an interval" }
            }
            require((it.localTime == null) == (it.timeZone == null)) { "Timed event needs a known time zone" }
            try {
                it.localTime?.let { time -> LocalTime.parse(time) }
                it.timeZone?.let { zone -> ZoneId.of(zone) }
            } catch (e: DateTimeException) { throw IllegalArgumentException("Invalid event time or zone", e) }
            if (it.timing != "confirmed") require(it.localTime == null) { "Unconfirmed time" }
        }
        c.news.forEach {
            require(it.olympiadId in olympiads && it.title.isNotBlank() && it.summary.isNotBlank())
            territories(it.regionIds); evidence(it.evidence)
            require(!date(it.publishedOn).isAfter(date(it.evidence.verifiedOn)))
        }
        c.guidance.forEach {
            require(it.title.isNotBlank() && it.body.isNotBlank() && it.evidence.isNotEmpty())
            it.evidence.forEach(::evidence)
        }
    }

    private fun validGrades(grades: List<Int>) {
        require(grades.isNotEmpty() && grades.all { it in 1..11 } && grades.distinct().size == grades.size) { "Invalid grades" }
    }
    private fun date(value: String): LocalDate {
        require(value.matches(Regex("[0-9]{4}-[0-9]{2}-[0-9]{2}")))
        return try { LocalDate.parse(value) } catch (e: Exception) { throw IllegalArgumentException("Invalid date: $value", e) }
    }
    internal fun https(value: String) {
        val uri = try { URI(value) } catch (e: Exception) { throw IllegalArgumentException("Invalid URL", e) }
        require(uri.scheme == "https" && !uri.host.isNullOrBlank() && uri.rawUserInfo == null && uri.fragment == null) { "HTTPS URL required" }
    }
}
