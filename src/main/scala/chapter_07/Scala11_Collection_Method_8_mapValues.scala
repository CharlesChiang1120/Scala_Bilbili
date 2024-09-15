package chapter_07

object Scala11_Collection_Method_8_mapValues {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 功能方法(函數)
    val dataMap = Map(("a", 1), ("b", 2), ("c", 3))

    // (a, 2)(b, 4)(c ,6)
    // map 方法可以將數據集中的每一條數據轉換成新的數據，放置在新的集合中
    // A => B
    // A => map => B
//    val newList = dataMap.map(
//      kv => {
////        val k = kv._1
////        val v = kv._2
////
////        (k, v * 2)
//        (kv._1, kv._2 * 2)
//      }
//    )
    // 當 KV 類型的數據在轉換時，如果 K 不變，只是對 V 進行轉換操作，可以採用新的功能函數 mapValues
    // mapValues 方法需要傳遞一個參數，參數的類型為函數類型: Int => W
    // 這裡的 W 就是對 V 處理後的結果
    val newList = dataMap.mapValues(_ * 2)
    println(newList)

    // From chatgpt
    // mapValues 是惰性計算的
    // mapValues 會返回一個懶計算的映射，即只有在實際使用結果時才會進行計算。
    // 如果你在沒有進一步操作的情況下查看 mapValues 的結果，
    // 可能會看到 <not computed> 或者結果未顯示。
    val originalMap = Map("a" -> 1, "b" -> 2, "c" -> 3)
    // 使用 mapValues 並強制計算
    val newMap = originalMap.mapValues(_ * 2).toMap
    println(newMap) // 輸出: Map(a -> 2, b -> 4, c -> 6)
  }
}
