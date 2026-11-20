plugins {
    kotlin("jvm")
    application
}

repositories { mavenCentral() }

dependencies {
    implementation(project(":common"))
    implementation(project(":issuer"))
}

kotlin { jvmToolchain(17) }

application {
    mainClass.set("io.mica.sdk.examples.PingKt")
}
