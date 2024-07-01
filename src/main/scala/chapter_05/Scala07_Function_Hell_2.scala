package chapter_05

object Scala07_Function_Hell_2 {
  def main(args: Array[String]): Unit = {

    // TODO 函數是編成語言 - 地獄版
    // 函數其實就是物件
    // 1. 物件應該有類型
    // 2. 物件應該可以賦值給其他人使用
    def test(): Unit = {
        println("test...")
    }
    // 將函數物件賦值給一個變量，那麼這個變量其實就是函數
    // 既然這個變量就是函數，所以這個變量是可以傳參後執行的
    val f = test _

    f()



  }
}
