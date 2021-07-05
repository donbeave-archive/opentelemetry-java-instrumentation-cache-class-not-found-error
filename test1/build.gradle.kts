plugins {
    application
}

repositories {
    //mavenLocal()
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    implementation("io.opentelemetry.instrumentation:opentelemetry-instrumentation-api:1.4.0-alpha-SNAPSHOT") {
        isChanging = true
    }
}

application {
    mainClass.set("test.Test1")
}
