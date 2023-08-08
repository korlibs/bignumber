plugins {
    kotlin("multiplatform") version "1.9.0"
}

group = "com.soywiz"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        jvmToolchain(8)
        testRuns.named("test") {
            executionTask.configure {
                useJUnitPlatform()
            }
        }
    }
    js {
        nodejs()
        browser()
    }

    macosX64()
    macosArm64()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    watchosArm32()
    watchosArm64()
    watchosSimulatorArm64()
    watchosX64()
    tvosArm64()
    tvosSimulatorArm64()
    tvosX64()
    mingwX64()
    linuxX64()


    sourceSets {

        val commonMain by getting

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val nativeMain by creating { dependsOn(commonMain) }

        val macosX64Main by getting { dependsOn(nativeMain) }
        val macosArm64Main by getting { dependsOn(nativeMain) }

        val iosX64Main by getting { dependsOn(nativeMain) }
        val iosArm64Main by getting { dependsOn(nativeMain) }
        val iosSimulatorArm64Main by getting { dependsOn(nativeMain) }
        val watchosArm32Main by getting { dependsOn(nativeMain) }
        val watchosArm64Main by getting { dependsOn(nativeMain) }
        val watchosSimulatorArm64Main by getting { dependsOn(nativeMain) }
        val watchosX64Main by getting { dependsOn(nativeMain) }
        val tvosArm64Main by getting { dependsOn(nativeMain) }
        val tvosX64Main by getting { dependsOn(nativeMain) }
        val tvosSimulatorArm64Main by getting { dependsOn(nativeMain) }
        val mingwX64Main by getting { dependsOn(nativeMain) }
        val linuxX64Main by getting { dependsOn(nativeMain) }

    }
}
