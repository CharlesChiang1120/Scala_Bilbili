package chapter_08

object Scala08_Match {
  def main(args: Array[String]): Unit = {

    // TODO 模式匹配 - 匹配對象
    // 這裡的匹配不是匹配物件的內存地址，而是匹配物件的所有屬性是否完全相同
    // 普通的物件無法在模式匹配中使用，因為物件的匹配其實就是屬性的匹配
    // 那麼就需要透過物件獲取其屬性，這裡需要使用一個方法: unapply
    // obj => unapplu => field

    // obj => field
    val user = thirdPart()
    user match {
      case User("zhangsan", 30) => {
        println("our user (zhangsan, 30)")
      }
      case _ => {
        println("not our user")
      }
    }


  }

  class User {
    var age: Int = _
    var name: String = _
  }

  object User {
    def apply(name: String, age: Int): User = {
      val user = new User()
      user.age = age
      user.name = name
      user
    }
    def unapply(user: User): Option[(String, Int)] = {
      Option((user.name, user.age))
    }
  }

  def thirdPart(): User = {
    User("zhangsan", 30)
  }

}