package chapter_07

object Scala07_Collection_Map {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Map(映射, 關聯)
    // Map 集合中儲存的是 K-V 鍵值對數據
    // 這個數據是無序的，爾且 K 是不能重複的，V 是可以重複
    // 可以通過 Map 中的 Key 關聯到 Value
    // Map 是一個 trait，一般情況下，採用伴生物件的 apply 方法來進行構建，默認為不可變的 Map 集合

    // TODO 構建
    // Scala 中 KV 鍵值對可以採用特殊的方式構建
    val kv = "a" -> 1
    val map1 = Map(kv, "b" -> 2, "c" -> 3, "d" -> 4, "e" -> 5, "f" -> 6)
    val map2 = Map("a" -> 1, "a" -> 2, "a" -> 3)




    // TODO 增刪改查
    // 不可變的 Map 集合的數據基本操作還是特殊符號
//    map2.updated()


    println(map1)
    println(map2)


  }
}
