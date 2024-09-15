package chapter_07

object Scala11_Collection_Method_3 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 會產生新的集合
    val list1 = List(1, 2, 3, 4, 5, 6)
    val list2 = List(3, 4, 5, 6)

    val set1 = Set(1, 2, 3, 4, 5, 6)
    val set2 = Set(3, 4, 5, 6, 7, 8)

    // 數據集的交集
    println(list1.intersect(list2)) // List(3, 4)
    println(set1.intersect(set2)) // Set(3, 4)

    // 數據集的並集
    println(list1.union(list2)) // List(1, 2, 3, 4, 3, 4, 5, 6)
    println(set1.union(set2)) // HashSet(5, 1, 6, 2, 3, 4)

    // 數據集的差集
    println(list1.diff(list2)) // List(1, 2)
    println(set1.diff(set2)) // Set(1, 2)

    // 拉鍊:將兩個數據集拉在一起
    // 基本原則是將兩個數據集中相同的位置的數據拉在一起，形成對偶元組
    // 如果兩個數據及的數據長度不相同，那麼會以最少的那個數據及為基礎進行拉鍊
    println(list1.zip(list2))
    println(set1.zip(set2))
  }
}
