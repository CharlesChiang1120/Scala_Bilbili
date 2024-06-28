package chapter_04

object Scala03_if_Return {
  def main(args: Array[String]): Unit = {

    // TODO 分支流程
    val age = 30
    // Scala 中表達式都有返回結果
    // 這裡的返回結果其實就是滿足條件後瘩最後一行代碼的執行結果
    // 結果的類型是: 所有分支條件返回結果的通用類型
    //             結果的取值是程序運行後才獲取的，所以可以明確結果
    //             Scala 語言是強類型語言，需要在編譯時就明確類型的
    //             String + Unit
//    val result = if (age == 30) {
//      // println("30 years old") // 返回結果就是 Unit
//      1
//      2
//      "zhangsan"
//    }
      val result = if (age == 30) {
        "zhangsan"
      } else {
        null
    }
    // Java 中 void 表示沒有返回值， Scala語言採用 Unit 類型來代替 void，只有一個物件，打印後為()
    println(result)
  }

}
