// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val viewModelVersion by extra("2.5.1")
    val navigationVersion by extra("2.5.1")
    val roomVersion by extra("2.4.3")
    val hiltVersion by extra("2.43.2")
    val retrofitVersion by extra("2.9.0")
    val okHttpVersion by extra("4.10.0")
}
plugins {
    id("com.android.application") version "7.2.2" apply false
    id("com.android.library") version "7.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.10" apply false
    id("com.google.dagger.hilt.android") version "2.43.2" apply false
    id("androidx.navigation.safeargs") version "2.5.1" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}