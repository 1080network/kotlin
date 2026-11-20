rootProject.name = "kotlin"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

// One module per role, so a member depends only on the roles it plays. `common` holds the shared messages
// and the mutual TLS channel helper.
include("common", "issuer", "acceptor", "examples")
