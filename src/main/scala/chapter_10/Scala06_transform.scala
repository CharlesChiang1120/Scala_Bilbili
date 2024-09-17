package chapter_10

object Scala06_transform {
  def main(args: Array[String]): Unit = {

//    implicit def transform( user : User ): UserExt = {
//      new UserExt
//    }
    // Class ＋ 構造Method(Function)
    // 如果類前面增加 implicit 關鍵字，表示當前類應用於隱式轉換，稱之隱式類

    // TODO 隱式轉換
    val user = new User()
    user.insertUser()
    user.updateUser()
  }
  implicit class UserExt(user : User) {
    def updateUser(): Unit = {
      println("Update user...")
    }
  }
  class User {
    def insertUser(): Unit = {
      println("insert user...")
    }
  }
}
