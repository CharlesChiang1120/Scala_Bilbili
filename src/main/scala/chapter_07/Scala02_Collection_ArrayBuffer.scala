package chapter_07

import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_ArrayBuffer {

  def main(args: Array[String]): Unit = {

    // TODO 集合 - 可變數組
    val array = new ArrayBuffer[Int]()
//    val arr1 = Array(5, 6, 7, 8)

    // 增加
    array.append(1, 2, 3, 4)
//    array.appendAll((arr1))
//    array.insert(0, 5)

    // 修改
//    array.update(3, 6)
//    val newArr = array.updated(3, 7) // 會創建新的集合

    // 刪除
//    array.remove(0)
//    array.remove(0, 2)

    // 查詢
    array.mkString(",")
    array.foreach(println)
    array.apply(0)
    array(0)

    // Scala 中自定義的集合類型打印後可以直接出現數據
    println(array)
//    println(newArr)

  }
}
