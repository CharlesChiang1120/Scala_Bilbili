package chapter_06

object Scala05_Object_Field {
    def main(args: Array[String]): Unit = {

        // TODO 物件導向編程 - 屬性

        // 1. Scala 中給類聲明屬性等同於給類聲明變量
        //    類中的變量稱之為屬性
        // 2. 變量使用 var, val 聲明
        // 3. 變量的類型如果可以推斷出來，那麼可以省略
        // 4. 變量必須顯示的初始化
        //    Java 中屬性是可以默認初始化，所以屬性的賦值可以不用寫
        //    Scala 中屬性必須明確初始化，辦事也希望和 Java 保持一致
        //    可以採用下滑線來進行賦值，表示由系統來進行默認初始化
        //    如果使用下滑線進行賦值，那麼屬性的類型不能省略
        //    val 聲明的屬性不能使用下滑線賦值

      val user = new User()
      user.name = "lisi"
    }

    class User {
        var name: String = _
        val age: Int = 30
        val email = "zhangsan@ahzngsan"
    }
}


