plugins {
    id("io.mica.sdk.kotlin-grpc-library")
}

dependencies {
    // Shared messages and the MicaChannels helper are part of the issuer API
    api(project(":common"))
}
