import org.gradle.kotlin.dsl.provideDelegate

object Libs {
    private const val composeVersion = "1.3.3"
    private const val roomVersion = "2.5.0"

    object AndroidX {
        val androidxCore by lazy { "androidx.core:core-ktx:1.7.0" }
        val androidXLifeCycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1" }
        val navigation by lazy { "androidx.navigation:navigation-compose:2.5.3" }

        object Compose {
            val ui by lazy { "androidx.compose.ui:ui:$composeVersion" }
            val toolingpreview by lazy { "androidx.compose.ui:ui-tooling-preview:$composeVersion" }
            val activityCompose by lazy { "androidx.activity:activity-compose:1.3.1" }
            val materialTree by lazy { "androidx.compose.material3:material3:1.0.0-alpha11" }
            val uiTooling by lazy { "androidx.compose.ui:ui-tooling:$composeVersion" }
            val uiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest:$composeVersion" }
            val liveData by lazy {"androidx.compose.runtime:runtime-livedata:1.3.2"}
        }

        object Test {
            val junit by lazy { "androidx.test.ext:junit:1.1.5" }
            val espresso by lazy { "androidx.test.espresso:espresso-core:3.5.1" }
            val composeTestJunit by lazy { "androidx.compose.ui:ui-test-junit4:$composeVersion" }
        }

        object Room {
            val roomRuntime by lazy {"androidx.room:room-runtime:$roomVersion"}
            val roomCompiler by lazy {"androidx.room:room-compiler:$roomVersion"}
            val roomKtx by lazy {"androidx.room:room-ktx:$roomVersion"}
        }
    }

    object SquareUp {
        val retrofit by lazy {"com.squareup.retrofit2:retrofit:2.9.0"}
        val okhttpBOM by lazy {"com.squareup.okhttp3:okhttp-bom:4.10.0"}
        val okhttp by lazy {"com.squareup.okhttp3:okhttp"}
        val logging by lazy {"com.squareup.okhttp3:logging-interceptor"}
    }

    object Google {
        val gson by lazy {"com.google.code.gson:gson:2.10.1"}
        val gsonConverter by lazy {"com.squareup.retrofit2:converter-gson:2.9.0"}
        val dagger by lazy {"com.google.dagger:hilt-android:2.44"}
        val daggerCompiler by lazy {"com.google.dagger:hilt-android-compiler:2.44"}
    }

    object Coil {
        val coil by lazy { "io.coil-kt:coil-compose:1.4.0" }
    }

    object Kotlinx {
        val coroutine by lazy {"org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9"}
    }

    object Maps {
        val openStreetMaps by lazy { "org.osmdroid:osmdroid-android:6.1.14" }
        val mapsCompose by lazy { "com.google.maps.android:maps-compose:2.10.0" }
        val playServiceMaps by lazy { "com.google.android.gms:play-services-maps:18.1.0" }
        val bonusPackOsm by lazy { "com.github.MKergall:osmbonuspack:6.9.0" }
    }

    object Junit {
        val junit by lazy { "junit:junit:4.13.2" }
    }
}