package chapter_08

object Scala03_Match {
  def main(args: Array[String]): Unit = {

    // TODO 模式匹配

    var a: Int = 10
    var b: Int = 20
    var operator: Char = 'd'
    var result = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }
    println(result)
  }
}
