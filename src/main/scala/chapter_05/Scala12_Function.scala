
package chapter_05

object Scala12_Function {
  def main(args: Array[String]): Unit = {

    // TODO 函數式編程語言 - 惰性函數
    // 函數是否在調用時馬上執行

    def fun9(): String = {
      println("function...")
      "zhangsan"
    }

    lazy val a = fun9()
    // val a = fun9() // 10000 User
    println("---------") // 1 hour
    println(a) // 用到它的結果 再讓他執行

  }
}
