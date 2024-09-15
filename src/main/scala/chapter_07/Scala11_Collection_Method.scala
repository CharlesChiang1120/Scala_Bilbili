package chapter_07

object Scala11_Collection_Method {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法
    // mkstring
    val list = List(1, 2, 3, 4)

    println(list.length)
    println(list.size)
    println(list.isEmpty) // 判斷是否為空
    println(list.contains(2)) // 判斷是否包含
    println(list.reverse) // 反轉集合
    println(list.distinct) // 集合去重
    println(list.mkString(", ")) // 生成字符串
    list.foreach(println) // 循環遍歷






  }
}
