
package chapter_05

object Scala11_Function {
  def main(args: Array[String]): Unit = {

    // TODO 函數式編程語言 - 遞歸
    // 階乘: 5! = 5 * 4! = 5 * 4 * 3! = 5 * 4 * 3 * 2! = 5 * 4 * 3 * 2 * 1
    // TODO 帝圭的基本原則: 函數自己調用自己
    // StackOverflowError: 棧溢出
    // Java 在執行方法調用時，會將方法進行壓棧處理，方法執行完畢後，會有彈棧處理
    // 如果方法沒有執行完，又調用了其他的方法，那麼方法棧空間就會下壓
    // 如果越壓越多，那麼棧空間不夠了，所以會發生溢出操作
    // TODO 遞歸函數應該有跳出遞歸的邏輯
    // TODO 遞歸函數傳遞參數時需要有規律
//    def test(): Unit = {
//      test()
//      println("test.....")
//    }

    // TODO 階乘
    def test(num: Int): Int = {
      if (num <= 1) {
        1
      } else {
        num * test(num - 1)
      }
    }

    println(test(5))

  }
}
