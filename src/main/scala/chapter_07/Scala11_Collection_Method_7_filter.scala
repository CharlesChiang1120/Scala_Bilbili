package chapter_07

object Scala11_Collection_Method_7_filter {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 功能方法(函數)
    val list = List(1, 2, 3, 4)
    // TODO 按照指定的條件將數據集中的數據進行篩選過濾，條件成立(true)，數據保留，否則(false)，數據丟棄
    //      這個功能函數稱之為 filter

    // filter 方法需要傳遞一個參數，這個參數的類型為函數類型: Int => Boolean
    // 這裡的 Int 表示數據集中的每一條數據
    // 這裡的 Boolean 表示條件執行後的返回結果，為布林類型
    // val newList = list.filter(num => false)

    // TODO 保留數據集中的奇數
    val newList = list.filter(_ %2 != 0)
    println(newList)

  }
}