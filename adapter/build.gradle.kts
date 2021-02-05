plugins {
    kotlin("jvm")
}

val jUnitVersion: String by rootProject.extra

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:${jUnitVersion}")
    testImplementation(kotlin("test-junit"))
    implementation(kotlin("stdlib-jdk8"))
}

tasks.test {
    useJUnitPlatform()
}