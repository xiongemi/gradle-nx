allprojects {
  apply {
      plugin("project-report")
  }
}

plugins {
    id("io.nx.gradle.plugin.Nodes") version("0.1.0")
}