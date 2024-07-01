package chapter_05

object Scala05_Function_Normal_2 {
  def main(args: Array[String]): Unit = {

    // TODO 函數式編程語言 - 普通版

    def test1(password: String = "000000", name: String): Unit = {
      println(s"註冊用戶: ${name}, 密碼: ${password}")
    }

    // 如果想要改變參數的傳值順序，那麼可以採用帶名參數
    test1(name = "Zhangsan")
  }
}
