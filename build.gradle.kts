// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Build.androidApplication) version Build.androidApplicationVersion apply false
    id(Build.kotlinAndriod) version Kotlin.version apply false
    id(Build.androidLibrary) version Build.androidApplicationVersion apply false
    id(Build.kotlinGradlePlugin) version Kotlin.version apply false
    id(Build.devtoolsKsp) version Build.devtoolsKspVersion apply false



}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}