plugins {
    id("io.mica.sdk.kotlin-grpc-library")
}

dependencies {
    implementation(project(":micacommon"))
    implementation(project(":partner"))
    implementation(project(":serviceprovider"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")
}