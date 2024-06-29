package chapter_04

object Scala04_for_2 {
  def main(args: Array[String]): Unit = {

    // TODO 循環控制

    // TODO 循環返回值
//    val result = for ( i <- 1 to 3) {
//      i
//    }
    // 1
    // 3
    // 1, 2, 3
    // println(result) // ()


    // TODO 如果想要將集合中的數據進行處理後返回，可以採用特殊的關鍵字 : yield
    val result = for ( i <- 1 to 3) yield {
      i * 2
    }
    println(result)
    // TODO Java 中線程物件有 yield 方法，在 Scala 中如何調用
    Thread.`yield`()
  }
}
