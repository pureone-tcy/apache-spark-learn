import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.0.1"
ThisBuild / organization     := "com.github.pureone"
ThisBuild / organizationName := "pureone"

lazy val root = (project in file("."))
  .settings(
    name := "spark-sample-app",
    mainClass in (Compile, run) := Some("com.github.pureone.Main2"),
    libraryDependencies ++= dependencies
  )
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
