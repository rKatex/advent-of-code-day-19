plugins {
    kotlin("jvm") version "2.0.21"
    application
}

group = "com.rkatex"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("MainKt")
}
