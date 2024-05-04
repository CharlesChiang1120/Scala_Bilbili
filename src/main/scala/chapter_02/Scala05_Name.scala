package chapter_02

object Scala05_Name {
  def main(args: Array[String]): Unit = {

    // TODO 標示符
    // 一般情況下，所謂的標示符就是取名字
    // 類名，物件名，屬性名，參數名，方法名
    // Java 中的標示符有規則的
    // 1. 數字，字母，下划線，美元符號
    // 2. 數字不能開頭
    // 3. 長度沒有限制
    // 4. 不能是關鍵字和保留字
    // 5. 區分大小寫
    // 6. 可以轉換 unicode 的編碼文字都可以當成標示符
    //    能寫中文？能寫日文？能寫韓文？ -> 可以

    // Scala 中的標示符基本規則和 Java 一致
    val name = "zhangsan"
    val name1 = "zhangsan"
    val name_e1 = "zhangsan"
    val name$e1 = "zhangsan"
    // val 1name$e1 = "zhangsan"
    // 如果非要使用關鍵字和標示符重名，加反引號
    // val `private = "zhangsan"
    // 或區分成大小寫
    val Private = "zhangsan"


  }
}
