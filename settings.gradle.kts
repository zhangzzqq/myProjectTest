pluginManagement {
    repositories {
        google {

            maven{url=uri("https://maven.aliyun.com/repository/public/")}
            maven{url=uri("https://maven.aliyun.com/repositories/google")}
            maven{url=uri("https://maven.aliyun.com/repositories/jcenter")}
            maven{url=uri("https://maven.aliyun.com/repositories/central")}


            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {

        maven{url=uri("https://maven.aliyun.com/repository/public/")}
        maven{url=uri("https://maven.aliyun.com/repositories/google")}
        maven{url=uri("https://maven.aliyun.com/repositories/jcenter")}
        maven{url=uri("https://maven.aliyun.com/repositories/central")}


        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
 