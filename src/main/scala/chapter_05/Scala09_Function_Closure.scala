
package chapter_05

object Scala09_Function_Closure {
  def main(args: Array[String]): Unit = {

    // TODO 函數式編程語言 - 閉包

    // 閉包的實現，不同的 Scala 版本不一致
    // Scala 在2.12版本前，閉包使用的是匿名函數類實踐
    // Scala 在2.12版本後，閉包使用的是改變函數聲明完成的
    // Java: private def inner$1(b: Int, a$1: Int): Int =  { return a$1 + b}
//    def outer(a: Int) = {
//      def inner(b: Int)  = {
//        a + b
//      }
//      inner _
//    }
//
//    val inner = outer(10)
//    inner(20)

//    val name = "zhangsan"
//
//    def test(): Unit = {
//      println(name)
//    }
//    // 沒有閉包
//    test()
//
//    val f = test _
//    f()
    // TODO 總結: 閉包的場景
    // 1. 內部函數使用了外部的數據，改變數據的生命週期
    // 2. 將函數作為物件使用，改變函數的生命週期
    // 3. 所有的匿名函數都有閉包
    // 4. 內部函數返回到外部使用也會有閉包

  }
}
