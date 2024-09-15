package chapter_07

object Scala10_Collection_Test {
  def main(args: Array[String]): Unit = {

    // TODO 將給定的字符串，首寫字母變成大寫返回
    // zhangsan => Zhangsan
    // lisi => Lisi
    println(firstToUpper("abc"))

  }

  def firstToUpper(str: String):String = {
    val opt = Option(str)
    if (opt.isEmpty){
      opt.getOrElse("")
    } else {
      val value: String = opt.get
      if (value.trim.length == 0){
        ""
      } else if (value.trim.length == 1) {
        value.substring(0, 1).toUpperCase
      } else if (value.trim.length > 1) {
        value.substring(0, 1).toUpperCase + value.substring(1)
      } else {
         ""
      }
    }
  }
}
