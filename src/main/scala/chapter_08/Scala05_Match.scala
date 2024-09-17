package chapter_08

object Scala05_Match {
  def main(args: Array[String]): Unit = {

    // TODO 模式匹配
    // 模式匹配可以簡化
    val t = (1, "zhangsan", 30)
    // val (id, name, age) = (1, "zhangsan", 30)

//    println(t._1)
//    println(t._2)
//    println(t._3)

//    println(id)
//    println(name)
//    println(age)

//    val map = Map (
//      ("a", 1), ("b", 2), ("c", 3)
//    )

//    for (kv <- map) {
//      if (kv._2 == 2){
//        println(kv._1 + "=" + kv._2)
//      }
//    }

//    for ( (k, 2) <- map) {
//        println(k + "=" + 2)
//      }

    val dataMap = Map(
      (("河北", "鞋"), 2),
      (("河北", "衣服"), 3),
      (("河南", "衣服"), 4),
      (("河南", "電腦"), 4)
    )

    // TODO 轉換數據的結構再進行分組
    // (("河北", "鞋"), 2) => ("河北", ("鞋", 2))
    // (("河北", "衣服"), 3) => ("河北", ("衣服", 3))

//    dataMap.toList.map(
//      t => {
//        (t._1._1, (t._1._2, t._2))
//      }
//    ).foreach(println)

    // TODO 小括號在匿名函數中表示參數列表，所以無法直接作為模式匹配的元組規則
    //      map 的參數列表中只有一個參數，那麼會發生錯誤
    //      如果想要使用模式匹配來匹配元組，需要使用關鍵字明確告訴編譯器
    //      需要將小括號變成大括號
    dataMap.toList.map {
      case ((prv, item), cnt) => {
        (prv, (item, cnt))
      }
    }.foreach(println)
  }
}
