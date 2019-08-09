package com.github.pureone

import org.apache.spark.{SparkConf, SparkContext}

object Bootstrap {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Sample")
    val sc = new SparkContext(conf)
    val rdd = sc.range(1, 100000, 1, 10)

    println("...START")
    rdd
      .map(_ * 2)
      .map(_ / 2)
      .map(_ + 2)
      .map(_ - 2)
      .foreach { i =>
        Thread.sleep(1000)
        println(i)
      }
    sc.stop()
    println("END...")
  }
}
