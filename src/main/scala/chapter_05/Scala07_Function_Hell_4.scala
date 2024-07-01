package chapter_05

object Scala07_Function_Hell_4 {
  def main(args: Array[String]): Unit = {

    // TODO 函數是編成語言 - 地獄版
    def sum(x: Int, y: Int): Int = {
         x + y
    }

    def diff(x: Int, y: Int): Int = {
      x - y
    }

    def test(f: (Int, Int) => Int): Unit = {
      val result = f (10, 20)
      println(result)
    }

//    val i: Int = sum(10, 20)
//    println(i)
    // 將函數物件作為參數使用，就類似於將邏輯進行傳遞，意味著邏輯可以不用寫死
    // 將函數名稱直接作為參數傳遞給另外一個函數，此時，不需要使用下滑線
    // 使用下滑線的目的是不讓函數執行，而是將它作為物件使用，那麼如果能夠明確知道函數不執行，那麼下滑線可以省略
    // TODO 函數的名稱真的那麼重要嗎?
    // 如果將函數對象作為參數使用，那麼參數名稱很重要，因為調用時使用的就是參數名稱
    // 傳遞到函數名稱本身不重要
    test(sum)
    test(diff)

  }
}
