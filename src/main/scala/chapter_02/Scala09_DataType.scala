package chapter_02
object Scala09_DataType {
  def main(args: Array[String]): Unit = {

    // TODO Java 的數據類型分兩大類
    // 1. 基本數據類型(不是物件導向)
    // 2. 引用數據類型(物件導向)
    // TODO Scala 是完全物件導向的語言，所以沒有基本數據類型的概念
    // 所有的基本數據類型，在 Scala 中都有專門的類型
    // byte
    val b : Byte = 10
    // short
    val s : Short = 10
    // int
    val age : Int = 10
    // Long
    val age1 : Long = 10
    // Float
    val age2 : Float = 10
    // Double
    val age3 : Double = 10
    // Char
    val age4 : Char = 10
    val age5 : Boolean = true

    // TODO Scala 中的數據類型也分兩大類
    // 1.任意的值類型
    // 對應 Java 的基本數據類型的 Scala 類型都是值類型
    // Unit 表示方法沒有返回值，只有一個物件，就是小括號
    // StringOps : 和字符串相關的類型
    def test(): Unit = {}
    println(test())

    // 2.任意的引用類型
    // 所有的 Java 類型，Scala 集合，Scala 類型都是引用類型
    // 引用類型的取值為空時，會賦值為 null，但是 null 本身也應該有類型 Null，也表示物件
    val name : Null = null

    // 3. Nothing
    // 一般應用於異常處理
    def test1(): Nothing = {
      throw new Exception()
    }

  }
}
