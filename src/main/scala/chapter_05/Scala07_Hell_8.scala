package chapter_05

object Scala07_Hell_8 {
  def main(args: Array[String]): Unit = {

    // TODO 函數是編成語言 - 地獄版

    def outer(x: Int) = {
        def inner(y : Int): Int = {
          x + y
        }
        inner _
    }

    val inner = outer(10)
    val result = inner(20)
    println(result)
  }
}
