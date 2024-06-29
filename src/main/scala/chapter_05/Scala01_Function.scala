package chapter_05

object Scala01_Function {
  def main(args: Array[String]): Unit = {
    // TODO 函數式編程語言
    // 1. Scala 中的函數並不是數學中的函數
    //    這裡的函數其實表示的就是功能的封裝, Java 中功能的封裝一般稱之為方法
    // 2. Java 中方法其實在 Scala 中就是函數，但是聲明在 Class 中的函數稱之為方法
    //    函數只在當前作用域有效，但是方法需要受到 Class 的約束
    // 3. 因為函數其實就是功能的封裝，也就意味著，功能的名稱不能重複，也就沒有重寫，重載的概念
    //    因為方法屬於 Class，那麼就可能存在方法的重載，重寫
//    val s = "zhangsan" // Zhangsan
//    val newString = s.substring(0, 1).toUpperCase() + s.substring(1)
//    println(newString)
//
//    val s1 = "list"
    // TODO 函數的聲明和使用
    // 聲明 => def 函數名 (參數列表) : 返回值類型 = { 函數體 }
    // 使用 => 函數名 (參數)
    def test(): Unit = {
      println("test....")
    }

    test()

  }
}
