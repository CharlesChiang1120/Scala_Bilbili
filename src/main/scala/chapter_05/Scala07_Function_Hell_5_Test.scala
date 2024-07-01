package chapter_05

object Scala07_Function_Hell_5_Test {
  def main(args: Array[String]): Unit = {

    // TODO 函數是編成語言 - 地獄版

    def calc( x: Int, f: (Int, Int) => Int, y: Int): Int = {
      f(x, y)
    }

    val result = calc(5, _*_, 3)
    println(result)

  }
}
