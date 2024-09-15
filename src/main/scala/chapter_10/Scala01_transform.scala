package chapter_10

object Scala01_transform {
  def main(args: Array[String]): Unit = {

    // TODO 隱式轉換
    // 所謂的隱式轉換，其實就是類型轉換

    // 1. 兩個數據類型之間如果想要轉換，那麼必須類型之間有關係: 父子類，接口，實現類的關係
    //     Byte 和 Int 類型之間沒有關係，所以不應該能轉換
//    val b: Byte = 10
//    val i: Int = b
//    println(i)

    // 2. Scala 中沒有字符串，使用的時候用的就是 Java 的字符串
    //    Java 中的字符串是一個類，沒有小括號訪問的方式

    val s = "hello" // Hello
    val ss = s(0).toUpper + s.substring(1)
    println(ss)
  }

}
