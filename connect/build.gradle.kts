import com.google.protobuf.gradle.*

plugins {
    id("io.mica.sdk.kotlin-grpc-library")
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("com.google.protobuf") version "0.9.2"
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")

    implementation(project(":micacommon"))

    testImplementation("io.mockk:mockk:1.13.3")
    testImplementation("org.assertj:assertj-core:3.24.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.2")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.4.2")
}

protobuf {
    protoc{
        artifact = "com.google.protobuf:protoc:3.23.1"
    }
    plugins {
        id("grpc"){
            artifact = "io.grpc:protoc-gen-grpc-java:1.49.2"
        }
        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:1.3.0:jdk8@jar"
        }
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("grpc")
                id("grpckt")
            }
            it.builtins {
                id("kotlin")
            }
        }
    }
}
