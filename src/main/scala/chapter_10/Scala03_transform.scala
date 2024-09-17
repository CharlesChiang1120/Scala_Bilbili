package chapter_10

object Scala03_transform {
  def main(args: Array[String]): Unit = {

    // TODO 隱式轉換
    // 當程序編譯出現錯誤時，可以使用編譯器幫助我們實現功能的轉換
    // 為了讓編譯器可以查找到指定的轉換的規則，需要在函數前增加關鍵字

    // 如果再作用域中存在相同的轉換規則，那麼轉換不起作用
    implicit  def transform1( d : Double): Int = {
      d.toInt
    }

//    implicit def transform2( d: Double): Int = {
//      d.toInt
//    }
    val i: Int = 10.5
    println(i)

  }
}
