package chapter_06

object Scala08_Object_Instance {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 實例化 - 物件
      // 1. 可以通過 new 構建物件
//      val user = new User()

      // 2. 可以通過反射構建物件
      // 3. clone
      // 4. 反序列化
      // Scala 中可以使用 object 關鍵字構建單例物件
      // println(Scala08_Object_Instance)
      // 6. Scala 中有一個方法可以構建物件，實際上採用的就是 new，但是編譯器可以動態識別
      // apply 方法可以省略，後面的集合物件基本上就是採用這種方式構建
      val user = User.apply()
      val user1 = User()
      println(user)
      println(user1)
    }
   class User {

   }
   object User {
    def apply(): User = new User()

   }

}


