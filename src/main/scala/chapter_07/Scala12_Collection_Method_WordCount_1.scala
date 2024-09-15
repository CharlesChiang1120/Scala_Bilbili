package chapter_07

import scala.io.{BufferedSource, Source}

object Scala12_Collection_Method_WordCount_1 {
  def main(args: Array[String]): Unit = {

    val source: BufferedSource = Source.fromFile("data/word.txt")
    val dataList: List[String] = source.getLines().toList
    source.close()

    dataList
      .flatMap(_.split(" "))
      .map((_, 1))
      .groupBy (_._1)
      .mapValues(_.size)
      .toList
      .sortBy(_._2)(Ordering.Int.reverse)
      .take(3)
      .foreach(println)

  }
}