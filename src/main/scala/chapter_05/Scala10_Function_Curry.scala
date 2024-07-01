
package chapter_05

object Scala10_Function_Curry {
  def main(args: Array[String]): Unit = {

    // TODO 函數式編程語言 - 函數柯里化 (Curry)
    def test(a: Int, b: Int): Unit = {
      for (i <- 1 to a) {
        println(i)
      }
      for (i <- 1 to b) {
        println(i)
      }
    }

    val a = 10 // 10 min
    val b = 20 // 60 min

    // 函數的參數之間可能沒關係，那麼如果再傳值的時候，同時傳遞，其實就有耦合性，而且增加調用的難度
    // 所謂的函數柯里化，就是為了將函數簡單化，將無關的參數進行分離，可以設定多個參數列表
    // test(a, b)
//    def test1(a: Int)(b: Int): Unit = {
//      for (i <- 1 to a) {
//        println(i)
//      }
//      for (i <- 1 to b) {
//        println(i)
//      }
//    }
//
//    val intToUnit: Int => Unit = test1(10)
//    test1(10)(20)

      def outer() = {
        def inner(): Unit = {
          println("inner...")
        }
        inner _
      }

    val inner: () => Unit  = outer()
    inner()
    outer()()

  }
}
