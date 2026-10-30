package io.github.dizy33.anavasi.data.catalog

import kotlinx.serialization.Serializable

@Serializable data class Evidence(val sourceUrl: String, val verifiedOn: String)
@Serializable data class Region(val id: String, val title: String)
@Serializable data class Coverage(val regionId: String, val status: String, val message: String, val evidence: Evidence)
@Serializable data class Olympiad(val id: String, val title: String, val grades: List<Int>, val evidence: Evidence)

@Serializable data class Catalog(
    val formatVersion: Int,
    val releaseVersion: Int,
    val verifiedOn: String,
    val regions: List<Region>,
    val coverage: List<Coverage>,
    val olympiads: List<Olympiad>,
    val events: List<CatalogEvent>,
    val news: List<CatalogNews>,
    val materials: List<Material>,
    val guidance: List<Guidance>,
)

@Serializable data class CatalogEvent(
    val id: String, val olympiadId: String, val title: String, val stage: String,
    val grades: List<Int>, val regionIds: List<String>,
    val kind: String, // conduct, registration_open, registration_deadline, scheduled
    val timing: String, // confirmed, window, unknown. Only confirmed dates receive calendar marks.
    val evidence: Evidence,
    val startDate: String? = null, val endDate: String? = null,
    val localTime: String? = null, val timeZone: String? = null,
    val scopeNote: String? = null,
)

@Serializable data class CatalogNews(
    val id: String, val olympiadId: String, val title: String, val summary: String,
    val publishedOn: String, val regionIds: List<String>, val evidence: Evidence,
)

@Serializable data class Material(
    val id: String, val olympiadId: String, val title: String, val academicYear: String,
    val stage: String, val round: String, val grades: List<Int>, val regionIds: List<String>,
    val kind: String, // tasks, answers, criteria, illustrations, combined
    val availability: String, // pdf, unpublished, unavailable, non_pdf
    val evidence: Evidence, val fileUrl: String? = null, val reason: String? = null,
    val documentKinds: List<String> = emptyList(),
)

@Serializable data class Guidance(val id: String, val title: String, val body: String, val evidence: List<Evidence>)

/** Empty territories mean common content. Unknown selected regions still retain common items. */
fun Material.appliesTo(regionId: String?): Boolean = regionIds.isEmpty() || regionId in regionIds
fun CatalogEvent.appliesTo(regionId: String?): Boolean = regionIds.isEmpty() || regionId in regionIds
fun CatalogNews.appliesTo(regionId: String?): Boolean = regionIds.isEmpty() || regionId in regionIds
