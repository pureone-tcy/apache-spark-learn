import sbt._

object Dependencies {

  def dependencies: Seq[ModuleID] = {
    typesafe ++ spark ++ scalaTest
  }

  lazy val typesafe = Seq(
    "com.typesafe" % "config" % "1.3.2"
  )

  lazy val spark = Seq(
    "org.apache.spark" %% "spark-core" % "2.4.2",
    "org.apache.spark" %% "spark-sql" % "2.4.2"
  )

  lazy val scalaTest = Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )

}
