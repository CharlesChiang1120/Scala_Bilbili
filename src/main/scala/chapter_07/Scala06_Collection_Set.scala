package chapter_07

object Scala06_Collection_Set {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Set(集)
    // Set 集合描述了 無序，數據不可重複的集合
    // TODO 構建
    // Set 是一個 trait，不能直接構建物件，而且默認為不可變集合
    // 一般情況下，集合都使採用伴生物件 apply 方法
    val set1 = Set(1, 2, 3, 4, 5, 6, 7, 8)
    val set2 = Set(1, 1, 1, 1, 1)
    val set3 = Set(1, 2, 3, 4)

    // 不可變集合的基本數據操作都是採用特殊符號
    val set4 = set3 + 5

    println(set1)
    println(set2)
    println(set3)
    println(set4)
  }
}
