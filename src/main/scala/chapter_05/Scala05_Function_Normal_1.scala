package chapter_05

object Scala05_Function_Normal_1 {
  def main(args:Array[String]): Unit ={

    // TODO 函數是編成語言 - 普通版
    // 希望參數有默認值: 如果不傳遞，那參數自動使用默認值

    // Scala實現不了這個操作: 函數的參數默認使用val聲明
      // def test(name: String, password: String): Unit = {
      //    if (password == null) {
      //        password = "000000"}
      //      }

    // 下面代碼存在兩個問題
    // 1. 參數值為null，並不是沒有傳值，只是傳遞了一個特殊值而已
    // 2. 在一個函數中，有相同含義的多個變量，容易出現分歧  (newpassword/ password)
      //    def test(name: String, password: String): Unit = {
      //      var newpassword = password
      //      if (password == null) {
      //        newpassword = "000000"
      //      }
      //      println(s"註冊用戶: ${name}, 密碼: ${newpassword}")
      //    }
      //    test("Tom",null)

    // TODO scala語法中可以給參數設定默認值，調用時，參數就可不需傳遞
    // 在參數聲明時，同時進行初始化
    // 參數默認值如果不傳遞，那麼會自動使用，如果傳遞，會覆蓋默認值
    def test(name: String, password: String = "000000" ): Unit = {
      println(s"註冊用戶: ${name}, 密碼: ${password}")
    }
    test("Wangwu","123456")
    test("lili","000000")

  }
}
