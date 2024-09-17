package chapter_08

object Scala04_Match_1 {
  def main(args: Array[String]): Unit = {

    // TODO 模式匹配 - 規則匹配
    // TODO 匹配數組
    for (arr <- Array(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(1, 1, 0, 1),
      Array("Hello", 90))) {
      val result = arr match {
        case Array(0) => "0" // 匹配 Array(0) 這個數組
        case Array(x, y) => x + "," + y // 匹配有兩個元素的數組，然後將元素值賦給對應的 x, y
        case Array(0, _*) => "以0開頭的數組" // 匹配以0開頭和數組
        case _ => "something else"
      }
      println("result = " + result)

    }

    // TODO 匹配列表
    for (list <- Array(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 0, 0),
      List(88))) {
      val result = list match {
        case List(0) => "0" // 匹配 list(0) 這個數組
        case List(x, y) => x + "," + y // 匹配有兩個元素的List
        case List(0, _*) => "0 ..."
        case _ => "something else"
      }
      println("result = " + result)

    }

//    val list: List[Int] = List(1, 2, 5, 6, 7) // 1-2-List(5, 6, 7)
//    val list: List[Int] = List(1, 2) // 1-2-List() // 1::2::Nil

    val list: List[Int] = List(1)
    list match {
      case first :: second :: rest => println(first + "-" + second + "-" + rest)
      case _ => println("something else")
    }

    // TODO 匹配元組
    for (tuple <- Array(
          (0, 1),
          (1, 0),
          (1, 1),
          (1, 0, 2))){
      val result = tuple match {
        case (0, _) => "0 ..." // 是第一個元素是0的元組
        case (y, 0) => "" + y + "0" // 匹配後一個元素是0的對偶元組
        case (a, b) => "" + a + " " + b
        case _ => "something else" //默認
      }
      println(result)
    }

  }
}
