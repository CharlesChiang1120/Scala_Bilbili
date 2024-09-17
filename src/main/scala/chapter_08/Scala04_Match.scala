package chapter_08

object Scala04_Match {
  def main(args: Array[String]): Unit = {

    // TODO 模式匹配 - 規則匹配
    // TODO 匹配常量
//    def describe(x: Any): String = x match {
//      case 5 => "Int five"
//      case "hello" => "String hello"
//      case true => "Boolean true"
//      case '+' => "Char +"
//    }

    // TODO 匹配類型
    // 1. 如果所有的規則都不匹配，會查找下划線的分支，但是如果想要使用下划線所代表得值
    // 一般會給下划線起個名
    // 2. 類型匹配時，不考慮泛型的。Array 除外，因為它的泛型其實不是真正的泛型
    // 真正的泛型只在編譯時有效，而 Array 的泛型在運行時也有效
    // 3. 如果 case 後直接寫類型，並不表示類型匹配，而是物件匹配
    def describe(x: Any): String = x match {
      // 直接寫 case Int => "Int" 會等同於匹配物件
      case i: Int => "Int"
      case s: String => "String hello"
      case m: List[String] => "List"
      case c: Array[Int] => "Array[Int]"
      case someThing => "something else" + someThing
    }

//    val result = describe(List(1, 2, 3))
    val result = describe(5)
    println(result)
  }
}
