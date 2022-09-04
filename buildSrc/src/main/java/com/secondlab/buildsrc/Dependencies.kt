package com.secondlab.buildsrc

object Versions {
    //Core
    const val kotlin = "1.8.0"

    //Ui
    const val appCompat = "1.5.0"
    const val material = "1.6.1"
    const val constraintLayout = "2.1.4"

    //Test
    const val jUnit = "4.13.2"
    const val androidxJUnit = "1.1.3"
    const val espresso = "3.4.0"
}

object Dependencies {
    const val kotlin = "androidx.core:core-ktx:${Versions.kotlin}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val androidxJUnit = "androidx.test.ext:junit:${Versions.androidxJUnit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}