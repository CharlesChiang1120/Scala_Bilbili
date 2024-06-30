package chapter_05

object Scala02_Function {
  def main(args: Array[String]): Unit = {
    // TODO 函數式編程語言
    // 函數 ＆ 方法
    // 1. 函數可以聲明在任意的位置，方法只能聲明在 Class 中
    def test(): Unit = {
      println("test function...")
    }
    // 如果函數名稱和方法名稱相同，那麼默認情況下，會調用函數。如果沒有函數，那麼會調用方法
    // 方法和物件相關，而函數是獨立使用
    this.test()

  }
  def test(): Unit = {
    println("test method...")
  }
//  test()
}
