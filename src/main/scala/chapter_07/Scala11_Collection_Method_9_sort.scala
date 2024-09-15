package chapter_07

object Scala11_Collection_Method_9_sort {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 功能方法(函數)
    // 排序

    val list = List(1, 3, 2, 4, 11, 22)

    // sortBy 方法表示將數據集中的每一條數據按照指定的規則進行排序
    // sortBy 方法可以傳遞一個參數，參數類型為函數類型: Int => B
    // 這裡的 Int 就是數據集中的每一條數據
    // 這裡的 B 其實就是排序的標記
    // sortBy 按照標記，對數據進行排序
    // sortBy 默認情況下，是升序排列
    val newList = list.sortBy(num => num.toString)

    println(newList)
    println(newList.reverse)
    // TODO 默認情況下，sortBy 是升序排列，如果想要降序，需要傳遞第二個參數列表
    // sortBy 方法存在函數柯里化，可以傳遞多個參數列表
    val newList1 = list.sortBy(num => num.toString)(Ordering.String.reverse)
    println(newList1)
  }
}
