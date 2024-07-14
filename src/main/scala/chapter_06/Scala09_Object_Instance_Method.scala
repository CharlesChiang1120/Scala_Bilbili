package chapter_06

object Scala09_Object_Instance_Method {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 實例化 - 物件的構造方法
      // 1. Java 中類的構造方法默認由 JVM 提供的: 無參，公共的
//      val user = new User()

      // 2. Scala 中類的構造方法默認由 JVM 提供，無參，公共的，小括號可以省略
//      val user1 = new User

      // 3. 如果開發人員給類提供了構造方法(任意)，JVM 不會提供默認的構造方法
      // 4. new 構建物件時，應該執行構造方法
      // 5. Java 中構造方法和類的名稱是一致的，但是 Scala 中構造方法和類的名稱沒有關係
//      user1.User()
      // 6. Scala 是完全面向函數式編程語言，所以萬物皆函數，聲明類就等同於聲明函數
      //    聲明類的同時所聲明的函數其實就是構造函數，當 new 的時候，函數就會執行
      // 7. Scala 的構造函數主要功能就是類的實例化(類主體內容的執行)
      // 8. 構造方法可以傳遞參數
      val user = new User("zhangsan")


    }
   class User(name: String) {
     // 類的主體 & 構造函數體
     println("user instance...")
//     def User(): Unit = {
//       println("user instance...")
//     }

   }

}


