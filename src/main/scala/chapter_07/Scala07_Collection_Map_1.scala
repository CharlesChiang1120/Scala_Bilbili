package chapter_07

import scala.collection.convert.ImplicitConversions.`map AsJavaMap`
import scala.collection.mutable

object Scala07_Collection_Map_1 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Map(映射, 關聯)
    // 構建可變的 Map 集合
    val map = mutable.Map("a" -> 1, "a" -> 2, "a" -> 3)

    // TODO 增刪改查
    map.put("b", 4)
    map.update("a", 4)

    map.update("b", 5)
    map.update("c", 6)

    map.remove("a")
//    map.clear()

    map.mkString(",")
    map.foreach(println)

    val iterator: Iterator[String] = map.keysIterator
    val iterator1: Iterator[Int] = map.valuesIterator

    iterator1.foreach(println)
    iterator.foreach(println)

    println(map)

  }
}
