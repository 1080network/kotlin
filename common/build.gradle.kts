plugins {
    id("io.mica.sdk.kotlin-grpc-library")
}

val grpcVersion = "1.79.0"

dependencies {
    // Netty transport (shaded) with TLS, used by MicaChannels for mutual TLS connections
    api("io.grpc:grpc-netty-shaded:$grpcVersion")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:2.1.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.11.4")
    testImplementation("org.bouncycastle:bcpkix-jdk18on:1.80")
}
