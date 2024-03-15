plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "PRO_2324_u4u5u6_libre"
include("src:main:Test")
findProject(":src:main:Test")?.name = "Test"
