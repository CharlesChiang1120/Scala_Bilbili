package chapter_07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala05_Collection_Seq_Buffer_1 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Seq(序列) - List
    val list = List(1, 2, 3, 4)
    val buffer = ListBuffer(1, 2, 3, 4)

    val buffer1: mutable.Buffer[Int] = list.toBuffer
    val list1: List[Int] = buffer.toList
  }
}
