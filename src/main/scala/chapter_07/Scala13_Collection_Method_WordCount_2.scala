package chapter_07

object Scala13_Collection_Method_WordCount_2 {
  def main(args: Array[String]): Unit = {

    // TODO 使用功能函數實現 WordCount

    val list = List(
      ("Hello", 1), ("Hello", 2), ("Hello", 3), ("Hello", 4)
    )

    // ("Hello", 10)
    // 集合可以進行簡單計算
    //    val list1 = List(1, 2, 3, 4)
    //    println(list1.sum) // 10
    //    println(list1.max) // 4
    //    println(list1.min) // 1
    //    println(list1.product) // 24

    val sum = list.map(
      kv => kv._2
    )

    println(sum)


    // (Hello, 1), (Hello, 2), (Hello, 3), (Hello, 4)
    // (Hello, 10)
  }
}