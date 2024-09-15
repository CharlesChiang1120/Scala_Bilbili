package chapter_07

import scala.collection.mutable.ListBuffer

object Scala11_Collection_Method_5_map {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 功能方法(函數)
    // map : 將數據集中的每一條數據按照指定的邏輯進行轉換，獲取新的集合
    val list = List(1, 2, 3, 4)
    val list1 = ListBuffer(1, 2, 3, 4)

    // map 方法需要傳遞一個參數，這個參數的類型為函數類型: Int => B
    //     這裡的 Int 表示數據集中的每一條數據，這裡的 B 表示處理後的結果，但是類型任意
    // 功能函數在使用時，都是採用匿名函數，而且同時簡化函數操作

    def mapFunction(num: Int): Int = {
      num * 2
    }

    //    val newList = list.map(mapFunction)
    //    val newList1 = list1.map(mapFunction)
    //    println(list)
    //    println(newList)
    //    println(list1)
    //    println(newList1)

    // TODO 當匿名函數只有一個參數，且每一個數據都要進行處理時，就可以在匿名函數中使用下滑線
    //      這裡的下滑線就表示每一條數據
    list.map(_* 2)

  }
}
