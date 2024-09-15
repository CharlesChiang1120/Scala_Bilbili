package chapter_07

object Scala09_Collection_1 {
  def main(args: Array[String]): Unit = {

    // TODO Option 的問題
    val opt = Some(10)
    val opt1 = Option(10)
    val opt2 = None
    val opt3 = Option(null)
    println(opt)
    println(opt1)
    println(opt2)
    println(opt3.getOrElse(0))

    val t = (1, "zhangsan", 30)
  }
}
