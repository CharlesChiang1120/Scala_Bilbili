package chapter_07

object Scala04_Collection_Seq_1 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Seq(序列) - List
    // seq 所表示的有序的概念，說的是數據的插入順序，不是大小順序
    // val list: List[Int] = List(1, 4, 3, 2)
    // seq 所表示的數據可重複的概念
    // val list: List[Int] = List(1, 1, 1, 1)

    // TODO 基本數據操作
    // Seq, List 集合默認使用時就是不可變的，所以常用的數據操作方法其實都是特殊符號
    // 默認情況下，不可變的集合的數據操作，會產生新的集合
    val list1 = List(1, 2, 3, 4)
    val list2 = List(5, 6, 7, 8)

    // list1.:+(5)
    // list1.+:(6)
    // list1.++:(list2)

    val list3 = list1 :+ 5
    val list4 = 5 +: list1

    val list5 = list1.updated(0, 6)

    println(list1)
    println(list2)
    // false
    println(list3 eq list1)
    println(list3)
    // false
    println(list4 eq list1)
    println(list4)
    // false
    println(list5 eq list1)
    println(list5)


    println(list1(0))
    println(list1.mkString(", "))
    list1.foreach(println)
  }
}
