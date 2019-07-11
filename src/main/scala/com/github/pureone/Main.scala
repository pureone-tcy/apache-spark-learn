package com.github.pureone

import org.apache.spark.{SparkConf, SparkContext}

import scala.util.{Failure, Success, Try}

object Main {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    val sc = new SparkContext(conf)
    val in = ""
    val out = ""

    Try {
      sc.textFile(in)
        .flatMap(_.split(" ").map(word => (word, 1)))
        .reduceByKey(_ + _)
    } match {
      case Success(v) =>
        println("Success")
        v.saveAsTextFile(out)
      case Failure(e) =>
        println("Failure")
        println(e)
    }
  }

}