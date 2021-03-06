/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 */

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.4.10"
    id("com.github.johnrengelman.shadow") version "6.0.0"
    id("antlr")

    // Apply the application plugin to add support for building a CLI application.
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use RxKotlin
    implementation("io.reactivex.rxjava3:rxkotlin:3.0.0")

    // Use Logger
    implementation("ch.qos.logback:logback-classic:1.2.3")

    // Use JDT
    implementation("org.eclipse.jdt:org.eclipse.jdt.core:3.22.0")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    // Use ANTLR
    antlr("org.antlr:antlr4:4.9")
}

application {
    // Define the main class for the application.
    mainClassName = "jp.ac.osaka_u.sdl.nil.NILMainKt"
}

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "jp.ac.osaka_u.sdl.nil.NILMainKt"
    }
}
