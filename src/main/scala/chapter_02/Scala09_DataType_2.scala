package chapter_02

object Scala09_DataType_2 {
  def main(args: Array[String]): Unit = {

    // TODO
    val s : String = null

    // Byte 和 Int 兩個類型之間沒有任何關係，所以不應該能夠轉換
    // Scala 底層對類型進行了轉換，所以代碼上看不出來，稱之為隱式（自動）轉換
    val b : Byte = 10
    val i : Int = b
    println(i)
  }
}
