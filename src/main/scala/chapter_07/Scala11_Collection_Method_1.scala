package chapter_07

object Scala11_Collection_Method_1 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 會產生新的集合
    val list = List(1, 2, 3, 4)
    // 從集合中獲取一部分數據

    // 獲取第一個數據
    println(list(0)) // 1
    println(list.head) // 1

    // 獲取第一個以外的數據:除了頭就是尾
    println(list.tail) // 4
    println(list.tails)

    // 獲取最後一個
    println(list.last) // 4

    // 除了最後一個以外的數據
    // List() + 4
    println(list.init)
    println(list.inits)

    // 獲取指定個數的數據
    println(list.take(3))
    println(list.takeRight(3))

    // 刪除數據
    println(list.drop(3))
    println(list.dropRight(3))

  }
}
