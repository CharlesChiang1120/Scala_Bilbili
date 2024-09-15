package chapter_07

object Scala11_Collection_Method_8_groupBy {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 功能方法(函數)

    // groupBy 方法可以將數據集中的每一條數據按照指定的規則進行分組
    val list = List(1, 2, 3, 4)
    // TODO 將數據集中奇數和偶數進行分組
    // groupBy方法需要傳遞一個參數，這個參數的類型為函數類型: Int => K
    // 這裡的 Int 表示數據集中的每一條數據
    // 這裡的 K 表示數據分組的標記，執行操作後，相同的標記會放置在一起
    // 奇數, (1, 3)
    // 偶數, (2, 4)
    // groupBy 方法的執行結果會返回 Map 集合
    // Map 集合中的key 表示分組的標記。Value 表示相同標記的數據集合。但是標記沒有固定的寫法

//    val groupMap: Map[String, List[Int]] = list.groupBy(
//      num => {
//        if (num % 2 == 0) {
//          "even"
//        } else {
//          "odd"
//        }
//      }
//    )

    val groupMap = list.groupBy(
      num => {
//        if (num % 2 == 0) {
//          true
//        } else {
//          false
//        }

//        num % 2 == 0
        num % 2
      }
    )

    val groupMap1 = list.groupBy(_ % 2)
    println(groupMap1)
  }
}
