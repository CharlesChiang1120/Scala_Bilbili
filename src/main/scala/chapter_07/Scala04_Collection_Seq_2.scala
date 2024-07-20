package chapter_07

object Scala04_Collection_Seq_2 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Seq(序列) - List
    val list1 = List(1, 2, 3, 4)
    val list2 = List(1, 2, 3, 4)
    // 使用一個不同的方式建構集合
    // :: 這個運算符表示向集合中添加數據，但是因為冒號結尾，所以計算規則從後向前
    // 如果直接使用 List()，表示空集合，向空集合中添加數據比較常見的方式就是下面這種
    // 為了操作方便，所以可以採用特殊對象來代替空集合: Nil
    val list3 = 1::2::3::4::List()
    val list4 = 1::2::3::4::Nil
    List().::(4).::(3).::(2).::(1)
    // 1, 2, 3, 4

    val list5 = 9::list2::list1
    val list6 = 9::list2:::list1

    println(list3)
    println(list4)
    println(list5.length)
    // List(9, List(1, 2, 3, 4), 1, 2, 3, 4)
    println(list5)
    println(list6.length)

  }
}
