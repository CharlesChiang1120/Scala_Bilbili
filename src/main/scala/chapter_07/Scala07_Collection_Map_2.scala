package chapter_07

import scala.collection.mutable

object Scala07_Collection_Map_2 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Map(映射, 關聯)
    // 構建可變的 Map 集合
    val map = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)

    // TODO 按照 key 獲取 v
    // 獲取的結果類型為 Option 類型，表示選項類型，這個類型只有兩個物件可以選擇:
    // Some : 有值，如果數據有值，那麼可以獲取真實結果
    // None : 無值，無需獲取結果，如果獲取，會發生錯誤: NoSuchElementException
    // 這裡之所以採用新的類型獲取結果，主要原因是為了避免空指針異常
    // Option 可以在獲取不到數據時，提供默認值，需要採用方法：getOrElse
    val maybeInt: Option[Int] = map.get("d")
//    if (maybeInt.isEmpty){
//      println("沒有獲取結果")
//    } else {
//      println("獲取的結果為:" + maybeInt.get)
//    }
//    println(maybeInt.getOrElse(0))

    // Map 集合為了操作方便，也提供了類似於 getOrElse 的方法
    val result = map.getOrElse("d", 0)
    println(result)

  }
}
