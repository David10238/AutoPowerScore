import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.2.51"
}

group = "RechargedGreen"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
    google()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile ("com.google.api-clinet:google-api-clinet:1.23.0")
    compile ("com.google.oauth-client:google-oauth-client-jetty:1.23.0")
    compile ("com.google.apis:google-api-services-sheets:v4-rev516-1.23.0")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}