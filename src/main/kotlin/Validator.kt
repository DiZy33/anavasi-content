import io.github.dizy33.anavasi.data.catalog.CatalogCodec
import java.io.File

fun main(args: Array<String>) {
    require(args.size == 1) { "Usage: validator catalog.json" }
    val file = File(args.single())
    require(file.length() in 1..4_194_304) { "Catalog outside runtime size limit" }
    val catalog = CatalogCodec.decode(file.readText(Charsets.UTF_8))
    println("Valid catalog format=${catalog.formatVersion} release=${catalog.releaseVersion}, materials=${catalog.materials.size}")
}
