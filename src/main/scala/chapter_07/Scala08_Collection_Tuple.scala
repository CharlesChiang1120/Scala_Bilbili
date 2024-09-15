package chapter_07

object Scala08_Collection_Tuple {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Map(映射, 關聯)
    // 集合其實就是數據的容器，可以容納數據
    // 如果像要讓無關的數據當作一個整體來使用
    // 1. 如果數據之間有關係，一般生成 Bean 物件，對應屬性
    // 2. 如果數據類型，含義相同，一般使用集合: Set, Seq[Any], Array[Any]
    // 3. Scala 語言採用特殊的方式將無關的數據(元素)作為一個整體，組合再一起，稱之為[元組]
    //    元組在 Scala 中是一個特殊的集合，採用小括號聲明，將數據包含到小括號中即可
    //    元組也是集合，所以也有類型: TupleN(Classtype....)
    //    Tuple 是元素的組合，但是有個數的限制:22個
    //    Tuple 集合限制的數據的個數，但是沒有限制數據的類型，也就意味著將集合物件放置在 Tuple 中
    val t: Tuple3[Int, String, Int] = (1, "zhangsan", 30)

  }
}
