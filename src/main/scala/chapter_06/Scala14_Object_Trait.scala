package chapter_06

object Scala14_Object_Trait {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 特質
      // Scala 中特質語法其實就是 interface，但是理解的時候不要僅僅局限於 interface
      // 將特質(trait)理解為 interface 和 abstract class 的結合體更好一些
      // trait 可繼承類
      val user = new User()
  }

  trait Run {
    println("trait")
  }
  class User extends Exception with Run {
    println("user")
  }
  class Person {

  }
}


