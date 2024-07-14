package chapter_06

object Scala12_Object_object {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - object
      // object 關鍵字聲明的是類，也同時是一個伴生物件
      // apply 方法可以用於構建對象，但是不僅僅用於構建物件
      // apply 方法可以被編譯器動態識別，所以可以省略
      val user1 = new User() // TODO 此處代碼執行的是類的構造方法，完成物件的初始化操作
      println("***************")
      val user2 = User // TODO 直接訪問類名，其實訪問的不是類，而是類的伴生物件
      println("***************")
      val user3 = User.apply() // TODO apply方法主要應用於構建物件
      println("***************")
      val user4 = User() // TODO apply方法用於應用場景比較多，所以編譯器可以動態識別，所以調用時可以省略


  }

  class User {
    println("user")
  }
  object User {
    def apply(): User = {
      println("user apply....")
      new User()
    }
  }
}


