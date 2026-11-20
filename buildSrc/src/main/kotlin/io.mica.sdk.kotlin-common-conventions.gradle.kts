import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Build conventions shared by every SDK module: Kotlin on the JVM, generated sources, and publishing.

plugins {
    kotlin("jvm")
    `java-library`
    `maven-publish`
}

// Maven versions don't carry the leading "v" of the proto release tag: v2.0.0-pre0 is published as 2.0.0-pre0.
group = project.findProperty("globalGroup") as String
version = (project.findProperty("globalVersion") as String).removePrefix("v")

repositories {
    mavenCentral()
}

// Generated protobuf/gRPC sources (see scripts/update-from-proto.sh) live apart from hand-written code.
sourceSets {
    main {
        java.srcDir("src/generated/java")
        kotlin.srcDir("src/generated/kotlin")
    }
}

java {
    withSourcesJar()
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions {
        freeCompilerArgs.add("-Xjsr305=strict")
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
    }
}
tasks.withType<JavaCompile> {
    options.release.set(11)
}

tasks.withType<Test> {
    useJUnitPlatform()
}

publishing {
    repositories {
        maven {
            name = "MicaPublicPackages"
            url = uri("https://maven.pkg.github.com/1080network/public")
            credentials {
                username = project.findProperty("github.user") as String? ?: System.getenv("GITHUB_USER")
                password = project.findProperty("github.token") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}
