package chapter_07

import scala.collection.mutable

object Scala15_Collection_Par {
  def main(args: Array[String]): Unit = {

    // TODO 集合
    // par 方法可以將普通集合轉換成並行集合
    // 並行集合
    val result1 = (1 to 5).map{x => Thread.currentThread.getName}
//    val result2 = (1 to 5).toVector.partition().map{ x => Thread.currentThread.getName}

    println(result1)
//    println(result2)
  }
}