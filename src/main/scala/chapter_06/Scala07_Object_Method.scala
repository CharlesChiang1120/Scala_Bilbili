package chapter_06

object Scala07_Object_Method {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 方法
      // 類的方法其實就是類中聲明的函數
      // 方法的生命週期是和類，物件，相關
      // 類中的函數遵循方法的約束: 函數不能重名，方
      // 法可以重載，重寫
      // 方法的訪問權限和屬性的訪問權限一致
//      new User().test()
//      User.test

      // TODO 物件構建後，可以直接使用的方法
      // 1. object類中的方法可以使用
      val user: Object = new User()
      val user1: Object = new User()
      val user2: Object = new User()
      // 2. Scala 中能用的方法
//      user1.eq(user2)
      println(user1.equals(user2))
//      user.!=(2)
//      user.ne(3)
//      println(user.isInstanceOf[User])
      val obj: User = user.asInstanceOf[User]
      println(obj)

    }

    class User {
//      def test(): Unit = {
//        println("class user test....")
//      }
    }

    object  User {
//      def test(): Unit = {
//        println("object user test....")
//      }
    }
}


