package chapter_08

object Scala07_Match {
  def main(args: Array[String]): Unit = {

    // TODO 使用功能函數實現 WordCount
    val list: List[Any] = List(1, 2, 3, "4", 5, 6, 7)

    // TODO 將集合中的數據全部增加1
    // 2, 3, 4, 41, 6, 7, 8
    val newList = list.map{
       case i : Int => i + 1
       case s : String => s + 1
    }
    println(newList)
  }
}