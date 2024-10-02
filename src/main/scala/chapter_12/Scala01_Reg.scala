package chapter_12

object Scala01_Reg {
  def main(args: Array[String]): Unit = {
    // TODO 正規表達式
    // 正規表達式類似於模式匹配
    // 模式匹配可以匹配任意的數據：數據是否匹配規則
    // 正規表達式匹配字符串：字符串的內容是否匹配規則(正規表達式)

    // TODO 正規表達式的使用
    // 1. 定義規則
    // 判斷字符串中是否包含某一個字符(串)
    val regex = "a".r
    // 2. 定義數據
    val str = "zhangsan"
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
