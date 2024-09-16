package chapter_07

import scala.io.{BufferedSource, Source}

object Scala13_Collection_Method_WordCount {
  def main(args: Array[String]): Unit = {

    // TODO 使用功能函數實現 WordCount

    val list = List(
      ("Hello World Scala Spark", 4),
      ("Hello World Scala", 3),
      ("Hello World", 2),
      ("Hello", 1),
    )

    // 將現有的數據轉換成熟悉的數據格式
    // tuple => line
    // A => B
    // Hello World Scala Spark Hello World Scala Spark Hello World Scala Spark Hello World Scala Spark
    // Hello World Scala Hello World Scala Hello World Scala
    // Hello World Hello World
    // Hello
    list.map(
      kv =>
        // 字符串有乘法的，表示字符串重複次數
        // + " " 不然會 Hello WorldHello World
        (kv._1 + " ") * kv._2
    ).flatMap(_.split(" "))
      .map((_, 1))
      .groupBy(_._1)
      .mapValues(_.size)
      .toList
      .sortBy(_._2)(Ordering.Int.reverse)
      .take(3)
      .foreach(println)
  }
}