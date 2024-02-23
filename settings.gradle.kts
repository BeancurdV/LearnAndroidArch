pluginManagement {
    repositories {
//        maven {
//            uri('https://maven.aliyun.com/nexus/content/public')
//        }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
//        maven {
//            uri('https://maven.aliyun.com/nexus/content/public')
//        }
        google()
        mavenCentral()
    }
}

rootProject.name = "LearnAndroidArch"
include(":app")
include(":vip")
include(":mall")
include(":loan")
include(":common")
include(":spi")
