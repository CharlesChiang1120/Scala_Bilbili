package chapter_05

object Scala07_Function_Hell_8 {
  def main(args: Array[String]): Unit = {

    // TODO 函數是編成語言 - 地獄版

    // TODO 如果一個函數使用了外部的變量，但是改變了這個變量的生命週期
    // 將這個變量包含到當前函數的作用域內，形成閉合的效果(環境)，這個環境稱之為閉包環境
    // TODO 簡稱[閉包]

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
