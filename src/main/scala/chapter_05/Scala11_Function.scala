
package chapter_05

object Scala11_Function {
  def main(args: Array[String]): Unit = {

    // TODO 函數式編程語言 - 遞歸
    // 階乘: 5! = 5 * 4! = 5 * 4 * 3! = 5 * 4 * 3 * 2! = 5 * 4 * 3 * 2 * 1
    // TODO 帝圭的基本原則: 函數自己調用自己
    // TODO StackOverflowError: 棧溢出
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
    // TODO Scala 中的泛型的返回值類型不能省略
//    def test(num: Int): Int = {
//      if (num <= 1) {
//        1
//      } else {
//        num * test(num - 1)
//      }
//    }
//
//    println(test(5))

    // TODO Java 的棧內存有大小限制的
    // 方法執行時，壓棧的內存也是有大小的，那麼棧內存不可能無限壓棧
    // 如果壓棧的次數超國閥值，就會出現錯誤，即使有跳出的邏輯也會出錯
    // Scala 採用了一種特殊的語法優化遞歸操作，尾(偽)遞歸
    // Scala 採用 while 循環實現尾遞歸
    // Java 中的尾遞歸是沒有優化

    def test(): Unit = {
      println("test.....")
      test()
    }

    test()

    // JAVA decompile
//    private final void test$1 () {
//      while (true) {
//        .MODULE$.println("test.....");
//      }
//    }

    // TODO 棧內存溢出: 沒有足夠的內存分配棧空間(內存)
    // Java 中的內存，堆內存，方法區內存只有一個，但是棧內存可以是多個
    // 一個線程就是一個獨立棧內存
  }
}
