import com.google.protobuf.gradle.*

plugins {
//    kotlin("jvm") version "1.9.10"
    id("io.mica.sdk.kotlin-grpc-library")
    id("com.google.protobuf") version "0.9.2"
}

dependencies{
   implementation("com.auth0:java-jwt:4.2.2")
}

protobuf {
    protoc{
        artifact = "com.google.protobuf:protoc:3.21.8"
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