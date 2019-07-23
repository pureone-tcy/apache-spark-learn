package com.github.pureone

import org.apache.spark.{SparkConf, SparkContext}

object Main2 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Simple Application")
    val sc = new SparkContext(conf)
    val rdd = sc.range(1, 100000, 1, 10)
    println("----Start----")

    println("hello" -> "world")

    rdd.map(i => i*2)
      .foreach(i => println(i))
  }
}
