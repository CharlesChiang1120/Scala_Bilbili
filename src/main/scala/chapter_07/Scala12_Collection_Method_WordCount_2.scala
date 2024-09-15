package chapter_07

import scala.io.{BufferedSource, Source}

object Scala12_Collection_Method_WordCount_2 {
  def main(args: Array[String]): Unit = {

    val source: BufferedSource = Source.fromFile("data/word.txt")
    val dataList: List[String] = source.getLines().toList
    source.close()

    val top3 = dataList
      .flatMap(
          line => {
            line.split(" ")
          }
        ).map(
            word => {
              (word, 1)
            }
        ).groupBy (
            kv => {
              kv._1
            }
        ).mapValues(
          list => {
            list.size
          }
        ).toList.sortBy(
          wc => {
            wc._2
          }
        )(Ordering.Int.reverse).take(3)

    println(top3)
  }
}