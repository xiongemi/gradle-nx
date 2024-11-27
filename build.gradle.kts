allprojects {
  apply {
      plugin("project-report")
  }
}

plugins {
    id("dev.nx.gradle.native") version("+")
}