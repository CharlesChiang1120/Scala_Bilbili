package chapter_07

import scala.collection.mutable.ListBuffer

object Scala05_Collection_Seq_Buffer {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Seq(序列) - List
    // Scala 中所有的集合有可變和不可變的兩個版本
    // 1. Seq, List => 不可變的
    // 2. ListBuffer => 可變
    val buffer1 = ListBuffer(1, 2, 3, 4)
    val buffer2 = ListBuffer(5, 6, 7, 8)

//    buffer1.append(9)
//    buffer1.appendAll(buffer2)
//    buffer1.insert(0, 0)
//
//    buffer1.update(0, 99)
//    val buffer3: ListBuffer[Int] = buffer1.updated(9, 88)
//
//    buffer1.remove(0)
//    buffer1.remove(0, 2)

    println(buffer1)
//    println(buffer3)

  }
}
