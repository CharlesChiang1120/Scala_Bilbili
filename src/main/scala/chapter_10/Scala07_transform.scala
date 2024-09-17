package chapter_10

import chapter_10.Scala07_transform.User

object Scala07_transform extends OtherTrait {
  def main(args: Array[String]): Unit = {
    // TODO 隱式轉換 - 作用域

    // 1. 當前類的內部
    //    隱式轉換不能應用於最外層的物件
    // 2. 隱式轉換規則必須和當前類有關係，才方便查找
    //    父類，父類的伴生對象
    //    特質，特質的伴生對象
    // 3. 包對象
    // 4. 直接導入
    val user = new User()
    user.insertUser()
    user.updateUser()
  }
//  implicit class UserExt(user : User) {
//    def updateUser(): Unit = {
//      println("Update user...")
//    }
//  }
  class User {
    def insertUser(): Unit = {
      println("insert user...")
    }
  }
}

class OtherClass {
  implicit class UserExt(user: User) {
    def updateUser(): Unit = {
      println("Update user...")
    }
  }
}

object OtherClass {
  implicit class UserExtInObject(user: User) {
    def updateUser(): Unit = {
      println("Update user...")
    }
  }
}

trait OtherTrait {
  implicit class UserExt(user: User) {
    def updateUser(): Unit = {
      println("Update user...")
    }
  }
}

//object OtherTrait {
//  implicit class UserExt(user: User) {
//    def updateUser(): Unit = {
//      println("Update user...")
//    }
//  }
//}

//implicit class UserExt(user: User) {
//  def updateUser(): Unit = {
//    println("Update user...")
//  }
//}

