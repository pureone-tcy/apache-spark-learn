package com.github.pureone

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Main2 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Simple Application")
    val hoge = new SparkContext(conf)
//    val rdd = sc.range(1, 100000, 1, 10)

    val sc: RDD[String] = hoge.textFile("")
    sc.map(line => line.split(" ").size).reduce((a, b) => if (a > b) a else b)
    sc.map(line => line.split(" ").size).collect()

    println("----Start----")

    println("hello" -> "world")

    rdd.map(i => i*2)
      .foreach(i => println(i))
  }
}
