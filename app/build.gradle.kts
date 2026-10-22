
plugins {
    id("com.android.application") version "8.6.1"
    id("org.jetbrains.kotlin.android") version "2.0.21"
}

android {
    namespace = "com.example.infinixlivestream"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.infinixlivestream"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("io.livekit:livekit-android:2.29.0")
}
