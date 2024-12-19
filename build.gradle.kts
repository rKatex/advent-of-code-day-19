plugins {
    kotlin("jvm") version "2.0.21"
}

group = "com.rkatex"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-client-core:2.3.0")
    implementation("io.ktor:ktor-client-cio:2.3.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}