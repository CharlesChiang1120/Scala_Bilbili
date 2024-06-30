package chapter_05

object Scala03_Function {
  def main(args: Array[String]): Unit = {
    // TODO 函數式編程語言
    // 函數的本質就是 Java 中的方法
    // Scala 源碼中，方法就是函數，編譯後的字節碼中，函數就是方法
    // 函數編譯成方法時，增加了修飾符: private static final
    // private: 別的地方想用用不了
    // static: 跟 Class 有關，可以透過 Class 訪問
    // final: 不能被重寫
    // 函數編譯成方法時，函數名會自動發生變化，為了避免和方法名衝突
    def test(): Unit = {
      println("test...")
    }

    // final
//    def test(i: Int): Unit = {
//      println("test...")
//    }
    test()
  }

  def test(): Unit = {
    println("test method...")
  }
}
