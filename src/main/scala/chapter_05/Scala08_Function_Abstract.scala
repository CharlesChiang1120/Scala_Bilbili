
package chapter_05

import scala.util.control.Breaks._

object Scala08_Function_Abstract {
  def main(args: Array[String]): Unit = {

    // TODO 函數式編程語言 - 控制抽象
    // 抽象: 不完整
    // 抽象類: 不完整的類
    // 抽象方法: 不完整的方法
    def test(f: () => Unit): Unit = {
      f()
    }

    // 函數類型只有返回，沒有輸入的場合，稱之為抽象，因為不完整
    // 調用的時候，不能使用小括號
    // 在傳值的時候，就需要進行控制
    def test1(f: => Unit): Unit = {
      f
    }

//    test(
//      () => {
//        println("test...")
//      }
//    )

    // TODO 完整的參數傳遞，是將函數物件作為參數進行傳遞
    // TODO 所謂的控制抽象，其實就是將代碼作為參數進行傳遞
    //      自定義語法時，可以採用控制抽象，因為代碼是可以傳遞，也就意味著邏輯是變化的
//    test1(
//        println("test1...")
//    )

    // TODO 循環中斷的代碼就體現了控制抽象
    // 如果參數跨越多行，那麼可以將小括號改成大括號
    breakable {
      for (i <- 1 to 5) {
        if (i == 3) {
            break
        }
        println("i = " + i)
      }
    }

  }
}
