import sbt._

object Dependencies {

  def dependencies: Seq[ModuleID] = {
    spark
  }

  lazy val typesafe = Seq(
    "com.typesafe" % "config" % "1.3.2"
  )

  lazy val spark = Seq(
    "org.apache.spark" %% "spark-core" % "2.2.3" % "provided",
    "org.apache.spark" %% "spark-sql" % "2.2.3" % "provided"
  )

  lazy val scalaTest = Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )

}
