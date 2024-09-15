package chapter_07

object Scala09_Collection {
  def main(args: Array[String]): Unit = {

    // TODO 集合
    // TODO List => Array, Set
//    val list = List(1, 2, 1, 2)
    val list = List(
      ("a", 1)
    )
    val map: Map[String, Int] = list.toMap
//    val array: Array[Int] = list.toArray
//    val set: Set[Int] = list.toSet
//
//    println(list)
//    println(array)
//    println(set)

    // TODO Set => Array, List, Seq
//    val set = Set(1, 2, 3, 4)
//    val array: Array[Int] = set.toArray
//    val list: List[Int] = set.toList

    // TODO Map => Array, List, Seq, Set
//    val map = Map(
//      ("a", 1), ("b", 2), ("c", 3)
//    )
//    val array:Array[(String, Int)] = map.toArray
//    val List:List[(String, Int)] = map.toList
//    var set: Set[(String, Int)] = map.toSet

  }
}
