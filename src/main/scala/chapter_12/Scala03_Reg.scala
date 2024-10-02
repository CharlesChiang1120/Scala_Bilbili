package chapter_12

object Scala03_Reg {
  def main(args: Array[String]): Unit = {
    // TODO 正規表達式

    // 3 + 8
    val regex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))[0-9]{8}$".r
    val str = "18845678901"

    val maybeString: Option[String] = regex.findFirstIn(str)
    if ( maybeString.isEmpty) {
      println("字符串不符合匹配規則")
    } else {
      println("字符串符合匹配規則: " + maybeString.get)
    }
  }
}
