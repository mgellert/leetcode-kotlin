plugins {
    kotlin("jvm") version "1.5.10"
}

group = "org.mgellert"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.2")
}
