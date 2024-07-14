package chapter_06

object Scala14_Object_Trait_1 {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 特質
      // 1. Java 中有所有的接口在 Scala 中使用，都是當成特質來用的
      // 2. 特質的用法
      // TODO 開發程序一般要遵循相應的開發規則(原則)
      // OCP 原則: OpenClose
      // 開發程序代碼時，應該對功能的擴展開放(Open)
      // 開發程序代碼時，應該對功能的修改關閉(Close)
      // trait 可以在構建對象時，將新的功能混入(添加)到物件中
      val user = new User() with Update {}
      user.insertUser()
      user.updateUser()


  }

   trait Update {
       def updateUser(): Unit = {
         println("update user")
       }
   }
  class User {
    def insertUser(): Unit = {
      println("insert user")
    }
//    def updateUser(): Unit = {
//      println("update user")
//    }
  }
}


