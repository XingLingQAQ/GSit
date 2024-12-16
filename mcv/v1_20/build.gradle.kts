plugins {
    id("io.papermc.paperweight.userdev")
}

dependencies {
    api(project(":core"))
    paperweight.paperDevBundle("1.20.1-R0.1-SNAPSHOT")
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(17)
}

tasks.assemble {
    dependsOn(tasks.reobfJar)
}