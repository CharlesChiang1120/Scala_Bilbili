package chapter_07

object Scala04_Collection_Seq {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Seq(序列)
    // Scala 集合中的 Seq 表示就是有序，數據可重複的數據集合
    // TODO 構建
    // 1. seq 集合需要指定泛型
    // type JavaHashMap = java.util.HashMap[String, String]
    // Seq 是一個 trait，所以無法直接構建物件，一般採用伴生物件的 apply 方法
    // Seq 是一個 trait，無法直接構建物件，所以底層採用的是 List 集合
    // val seq = new Seq[Int]()

    val seq: Seq[Int] = Seq.apply(1, 2, 3, 4)
    val seq1: Seq[Int] = Seq(1, 2, 3, 4)
    val list = List.apply(1, 2, 3, 4)
    val list1 = List(1, 2, 3, 4)

    // TODO 增刪改查
    println(seq)
    println(seq1)
    println(list)
    println(list1)



  }
}
