plugins {
    id("io.mica.sdk.kotlin-grpc-library")
}

dependencies {
    // Shared messages and the MicaChannels helper are part of the acceptor API
    api(project(":common"))
}
