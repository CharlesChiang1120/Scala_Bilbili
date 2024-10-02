package chapter_12

object Scala02_Reg {
  def main(args: Array[String]): Unit = {
    // TODO 正規表達式

    // 1. 定義規則
    //    電話號碼的校驗規則
    //    1) 全是數字字符串: 從頭到尾全都是數字
    //    2) 長度為11
    val regex = "^\\d{11}$".r
    // 2. 定義數據
    val str = "12345678901"
    // 3. 用規則校驗數據
    // 將字符串使用規則進行匹配，如果字符串有多個內容匹配個規則，取第一個
    val maybeString: Option[String] = regex.findFirstIn(str)
    if ( maybeString.isEmpty) {
      println("字符串不符合匹配規則")
    } else {
      println("字符串符合匹配規則: " + maybeString.get)
    }
  }
}
