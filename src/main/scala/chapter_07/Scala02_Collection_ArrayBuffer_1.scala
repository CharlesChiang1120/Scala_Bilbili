package chapter_07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_ArrayBuffer_1 {

  def main(args: Array[String]): Unit = {

    // TODO 集合 - 可變數組
    // Scala 中絕大數的集合物件都是通過 applu 方法構建出來
    val array = ArrayBuffer(1, 2, 3, 4)
    val array1 = Array(1, 2, 3, 4)

    // 將不可變數組變成可變數組
    val buffer: mutable.Buffer[Int] = array1.toBuffer

    // 將可變數組變成不可變數組
    val array2: Array[Int] = array.toArray
  }
}
