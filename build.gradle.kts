

plugins {
    id("dev.nx.gradle.project-graph") version("+")
}

allprojects {
  apply {
      plugin("dev.nx.gradle.project-graph")
  }
}