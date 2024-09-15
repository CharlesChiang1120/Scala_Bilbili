package chapter_07

object Scala08_Collection_Tuple_2 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Tuple
    // 如果元組中的元素數量為2，那麼稱之為對偶元組，也稱之為鍵值對物件
    val t1 = ("a", 1)
    val t2 = ("b", 2)

//    val tuple: (String, Int) = "a" -> 1

//    1->2->3->4
//    (((1, 2), 3), 4)

    // TODO Map 集合的操作有了變化
    val map = Map(
      ("a", 1), ("b", 2), ("c", 3)
    )

    for (kv <- map) {
      println(kv._1 + "=" + kv._2)
    }
//    println(map)
  }
}
