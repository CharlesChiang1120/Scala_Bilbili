package chapter_07

object Scala11_Collection_Method_2 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 會產生新的集合
    val list = List("a", "b", "c", "d", "e")
    val list1 = List(1, 2, 3, 4, 5, 6)

    // 切分
    println(list.splitAt(2))

    // 滑動
//    val tails: Iterator[List[Int]] = list1.tails
//    while (tails.hasNext) {
//      println(tails.next().take(2))
//    }
    // 1, 2, 3, 4, 5, 6
    // 1, 2
    //    2, 3
    //       3, 4
    //          4, 5
    //             5, 6
    // sliding 方法可以將集合中的一部分固定數量的數據作為整體進行數據處理
    // 處理完以後，作為整體的操作會向後滑動，整體的數量不會發生改變，但是起始位置會發生改變
    // 將整體的數據範圍稱之為窗口，而這個窗口會跟隨計算進行滑動，稱之為滑動窗口，簡稱滑窗
    val tails: Iterator[List[Int]] = list1.sliding(2, 2)
    while (tails.hasNext) {
      println(tails.next())
    }

  }
}
