package chapter_04

object Scala03_if_Return_2 {
  def main(args: Array[String]): Unit = {

    // TODO 分支流程
    // Scala 中分支流程判斷沒有 三元運算符，可以採用 if 來代替
    // Scala 中也沒有 switch 語法
    // 如果表達式中的邏輯代碼只有一行，可以省略大括號
    // xxxx ? a : b

    val age = 30
//    val result = if (age == 30) {
//      "30"
//    } else {
//      "other"
//    }
    val result = if (age ==  30) "30" else "other"
    println(result)
  }

}
