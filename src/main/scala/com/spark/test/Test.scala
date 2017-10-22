package com.spark.test

import org.apache.spark.{SparkConf, SparkContext}

object Test {
  def main(args: Array[String]) {
    println("Hello World!")
    val sparkConf = new SparkConf().setMaster("local").setAppName("test")
    val sparkContext = new SparkContext(sparkConf)
    println()
  }
}
