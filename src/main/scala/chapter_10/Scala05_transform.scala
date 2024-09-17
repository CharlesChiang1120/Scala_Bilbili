package chapter_10

import sun.security.util.Password

object Scala05_transform {
  def main(args: Array[String]): Unit = {

    // TODO 隱式轉換
    // 註冊用戶
    // 開發的時候，明確知道數據可能會發生變化，所以可以在參數上增加關鍵字
    // 在函數的參數前增加 implicit，表示隱式參數，正常調用的情況下，不會起作用
    // 如果想要讓隱式參數起作用，那麼就意味著不能正常傳遞，需要設定隱式變量
    def reg(implicit password: String = "123123") : Unit = {
      println(s"密碼為: $password")
    }

//    reg(password = "111111")
//    reg()

    implicit val newpassword = "222222"
    reg

  }
}
