import java.util.Properties


tasks.register("updateVersion") {
    val newVersion: String by project

    doLast {
        val propertiesFile = file("gradle.properties")
        if (propertiesFile.exists()) {
            val properties = Properties()
            propertiesFile.inputStream().use { properties.load(it) }

            if (!newVersion.matches("v[\\d+].[\\d+].[\\d+]".toRegex())) {
                error("invalid version. must be vX.Y.Z")
            }

            properties.setProperty("globalVersion", newVersion)

            propertiesFile.outputStream().use {
                properties.store(it, "Updated version")
            }
            println("Updated version to $newVersion in gradle.properties")
        } else {
            println("gradle.properties file not found.")
        }
    }
}