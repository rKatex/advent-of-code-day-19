plugins {
    kotlin("jvm") version "2.0.21"
}

group = "com.rkatex"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val assertJVersion = "3.11.1"

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:$assertJVersion")
}

tasks.test {
    useJUnitPlatform()
}