plugins {
    id("dev.nx.gradle.native") version("+")
}

allprojects {
  apply {
      plugin("project-report")
      plugin("dev.nx.gradle.native")
  }
}

tasks.register("projectReportAll") {
        // All project reports of subprojects
        allprojects.forEach {
            dependsOn(it.tasks.getAt("projectReport"))
        }
    
        // All projectReportAll of included builds
        gradle.includedBuilds.forEach {
            dependsOn(it.task(":projectReportAll"))
        }
    }