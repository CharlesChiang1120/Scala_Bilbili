package chapter_06

object Scala11_Object_Abstract_2 {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 抽象屬性
      // 如果類的屬性只有聲明，沒有初始化，就稱之為抽象屬性，因為不完整
      // 屬性是類的一部分，部分不完整，那麼整體也就不完整，所以類應該為抽象類
      // 如果想要構建類，需要通過子類進行構建，並且將不完整的屬性補充完整

      // TODO 抽象屬性的本質
      // 1. 編譯器在編譯時，抽象屬性並不會編譯為屬性，而是會編譯為屬性對應的 set, get 兩個抽象方法
      // 2. 子類在編譯時，其實就是實現了屬性的 set, get 方法
      // 3. 本質上，屬性的抽象還是方法的抽象
      // 4. 完整的屬性在 Scala 中有重寫的概念，因為本質上還是方法的重寫
      //    可變變量(var) 是不能被重寫的
      val user = new  Child()
      println(user.age)

    }

  abstract class User {
    var name: String
    val age: Int = 30
  }
  class Child extends User {
    var name: String = "zhangsan"
    override val age: Int = 40
  }

}


