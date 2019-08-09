import Dependencies._

ThisBuild / scalaVersion     := "2.11.12"
ThisBuild / version          := "0.0.1"
ThisBuild / organization     := "com.github.pureone"
ThisBuild / organizationName := "pureone"

lazy val root = (project in file("."))
  .settings(
    name := "aws-emr-spark-application",
    mainClass in (Compile, run) := Some("com.github.pureone.Bootstrap"),
    libraryDependencies ++= dependencies
  )
mainClass in assembly := Some("com.github.pureone.Bootstrap")