package chapter_08

object Scala06_Match {
  def main(args: Array[String]): Unit = {

    // TODO 使用功能函數實現 WordCount

    val list = List(
      ("Hello World Scala Spark", 4),
      ("Hello World Scala", 3),
      ("Hello World", 2),
      ("Hello", 1),
    )

    list.map {
      case (str, cnt) => (str + " ") * cnt
    }.flatMap(_.split(" "))
      .map((_, 1))
      .groupBy {
        case (word, _) => {
          word
        }
      }
      .mapValues(_.size)
      .toList
      .sortBy{
        case  (_, cnt) => {
          cnt
        }
      }(Ordering.Int.reverse)
      .take(3)
      .foreach(println)
  }
}