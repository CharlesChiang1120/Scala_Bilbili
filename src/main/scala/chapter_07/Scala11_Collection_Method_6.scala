package chapter_07

import scala.collection.mutable.ListBuffer

object Scala11_Collection_Method_6 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 功能方法(函數)
//    val list = List(List(1, 2, 3), List(4, 5, 6))
//    println(list.size)

    // TODO 將集合中的整體數據拆分成個體來使用的功能，稱之為扁平化操作
    //      flatten 方法將數據集按照默認的規則進行扁平化
    // List(1, 2, 3, 4) => 1, 2, 3, 4
//    val newList: List[Int] = list.flatten
//    println(newList.size)

    val list = List(
      "Hello Scala", "Hello Hadoop"
    )
    // 這裡的 flatten 方法會將字符串作為 char 數組，所以扁平化後，就是一個一個的 char
    // 如果想要實現自定義的扁平化規則，一般採用另外一個功能函數
//    val newList =  list.flatten
//    println(newList) // List(H, e, l, l, o,  , S, c, a, l, a, H, e, l, l, o,  , H, a, d, o, o, p)

    // flatMap 可以實現自定義的扁平化規則
    // 1 => N
    // TODO flatMap 方法需要傳遞一個參數，參數的類型為函數類型: String => GenTraversableOnce
    //      這裡的 String 其實就是數據集中的每一條數據
    //      這裡的 GenTraversableOnce 其實就是集合類型的頂層通用類型，意味著任何集合都可以此處使用
    val newList = list.flatMap(_.split(" "))

    println(newList) // List(Hello, Scala, Hello, Hadoop)

  }

}
