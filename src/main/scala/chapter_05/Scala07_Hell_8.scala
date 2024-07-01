package chapter_05

object Scala07_Hell_7 {
  def main(args: Array[String]): Unit = {

    // TODO 函數是編成語言 - 地獄版

//    def outer() = {
//      def inner(): Unit = {
//        println("inner.....")
//      }
//      inner _
//    }

    // val f = outer()
    // f()
    // javascript: 函數式編程語言
    // test()()()()()()
//    outer()()


    def outer(x: Int) = {
      def mid(f: (Int, Int) => Int) = {
        def inner(y : Int): Int = {
          f(x, y)
        }
        inner _
      }
      mid _
    }

//    val mid = outer(10)
//    val inner = mid(_+_)
//    val result = inner(20)
//    println(result)
    println(outer(10)(_ + _)(20))

  }
}
