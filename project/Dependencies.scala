import sbt._

object Dependencies {

  def dependencies: Seq[ModuleID] = {
    typesafe ++ spark ++ scalaTest
  }

  lazy val typesafe = Seq(
    "com.typesafe" % "config" % "1.3.2"
  )

  lazy val spark = Seq(
    // 以下のライブラリは、Spark実行環境に、spark-coreが存在するため、sbt assembly時には以下のライブラリはJarに含めない
    "org.apache.spark" %% "spark-core" % "2.4.2" % "provided",
    "org.apache.spark" %% "spark-sql" % "2.4.2" % "provided"
  )

  lazy val scalaTest = Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )

}
