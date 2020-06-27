buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        google()
        maven { url = uri("https://dl.bintray.com/korlibs/korlibs/") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-dev") }
    }

    dependencies {
        classpath("com.soywiz.korlibs:easy-kotlin-mpp-gradle-plugin:0.9.1-M2-mt") // Kotlin 1.4-M2-mt: https://github.com/korlibs/easy-kotlin-mpp-gradle-plugin
    }
}

val buildExtraGradleFile = File(rootDir, "build.extra.gradle.kts")
if (buildExtraGradleFile.exists()) {
    apply(from = buildExtraGradleFile)
}
