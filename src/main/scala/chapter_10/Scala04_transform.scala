package chapter_10

object Scala04_transform {
  def main(args: Array[String]): Unit = {

    // TODO 隱式轉換
    // 如果一個函數使用 implicit 關鍵字，那麼編譯器在編譯時就會查找這個函數的功能，自動應用
    // 這樣的函數稱之為: 隱式函數
    implicit  def transform1( d : Double): Int = {
      d.toInt
    }

    val i: Int = 10.5
    println(i)

  }
}
