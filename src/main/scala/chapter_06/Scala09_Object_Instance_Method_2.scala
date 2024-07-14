package chapter_06

object Scala09_Object_Instance_Method_2 {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 實例化 - 物件的構造方法
      // 構造方法為什麼要傳參數？
      // 將類的外部數據傳遞到類的內部，實現數據的賦值，給類的屬性賦值
      // Scala 為了開發方便，可以在構造參數前增加 var, val 讓參數作為類的的屬性存在
      val user = new User("zhangsan")
      user.name
    }

    class User(var name: String) {


    }
}


