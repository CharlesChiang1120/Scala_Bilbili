package chapter_07

import scala.collection.mutable.ListBuffer

object Scala11_Collection_Method_4 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 會產生新的集合
    val list1 = List(1, 2, 3, 4)

    // List(2, 4, 6, 8)
    // List(3, 6, 9, 12)
    // 想要實現一個不確定的功能，但是這個功能的主要目的是將數據集中的每一條數據進行處理後
    // 返回新的集合，但是這個處理的邏輯是不確定
    // Scala 集合提供了可以進行自動轉換的操作，具體的轉換邏輯由開發人員提供
    // List => logic => List

//    def test(num: Int): Int = {
//      num * 3
//    }
//    println(transform(list1, test))
    // println(transform(list1, _ * 3))

    // TODO map方法就是用於將數據集中的每一條數據進行轉換處理，獲取轉換後的新的數據集
    //      List => map(logic) => List
    //      將這樣的函數稱之為功能函數，實現特定的功能，但是功能的邏輯不確定
    println(list1.map(_ * 3))

  }
  def transform(list: List[Int], f:(Int => Int)): List[Int] = {
    val newList = ListBuffer[Int]()

    list.foreach(
      num => {
        val result: Int = f(num)
        newList.append(result)
      }
    )
    newList.toList
  }
}
