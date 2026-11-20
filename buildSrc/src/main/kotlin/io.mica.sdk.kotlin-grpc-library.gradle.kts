// Dependencies of the generated protobuf and gRPC code (Java and Kotlin). The versions are the minimum the
// generator output needs; see scripts/update-from-proto.sh and keep them in step when the output requires more.

plugins {
    id("io.mica.sdk.kotlin-common-conventions")
}

val protobufVersion = "4.36.2"   // generated code declares "Protobuf Java Version: 4.36.2"
val grpcVersion = "1.79.0"
val grpcKotlinVersion = "1.4.3"   // 1.5.0 requires Java 17; 1.4.x keeps Java 11 clients working
val coroutinesVersion = "1.10.2"

dependencies {
    api("com.google.protobuf:protobuf-java:$protobufVersion")
    api("com.google.protobuf:protobuf-kotlin:$protobufVersion")
    api("io.grpc:grpc-stub:$grpcVersion")
    api("io.grpc:grpc-protobuf:$grpcVersion")
    api("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    // Annotations referenced by the generated Java stubs
    compileOnly("org.apache.tomcat:annotations-api:6.0.53")
    // The protos import validate.proto, so the generated Java references its descriptors. Later versions of this
    // stub no longer ship io.envoyproxy.pgv.validate.ValidateProto, which the generated code needs.
    api("build.buf.protoc-gen-validate:pgv-java-stub:0.6.13")
}
