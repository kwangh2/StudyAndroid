pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        //토글 받을려고 넣어놓음
        jcenter()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Starbucks"
include(":app")
 