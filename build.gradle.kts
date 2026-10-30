plugins {
    kotlin("jvm") version "2.2.10"
    kotlin("plugin.serialization") version "2.2.10"
    application
}
repositories { mavenCentral() }
kotlin { jvmToolchain(21) }
dependencies { implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0") }
application { mainClass.set("ValidatorKt") }
