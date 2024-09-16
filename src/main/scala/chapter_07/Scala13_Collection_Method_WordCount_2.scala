package chapter_07

object Scala13_Collection_Method_WordCount_1 {
  def main(args: Array[String]): Unit = {

    // TODO 使用功能函數實現 WordCount

    val list = List(
      ("Hello World Scala Spark", 4),
      ("Hello World Scala", 3),
      ("Hello World", 2),
      ("Hello", 1),
    )
    // 扁平化
    // ("Hello World Scala", 3) => (Hello, 3), (World, 3), (Scala, 3)
    // ("Hello World", 2) => (Hello, 2), (World, 2)
    list.flatMap(
      kv => {
        val line = kv._1
        val cnt = kv._2
        val words = line.split(" ")
        words.map(
          word => (word, cnt)
        )
      }
    ).groupBy(
      kv => kv._1
    ).foreach(println)

    // (Hello, 1), (Hello, 2), (Hello, 3), (Hello, 4)
    // (Hello, 10)
  }
}