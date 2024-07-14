package chapter_06

object Scala14_Object_Trait_2 {
  def main(args: Array[String]): Unit = {

    // TODO 物件導向編程 - 特徵的執行順序
    // 1. 將 trait 理解為抽象類，所以 trait的初始化順序應該優於當前的類
    //    Trait > current Class
    val user = new User()
    // 2. 如果類同時有父類和特質，那麼父類的初始化優先
    //    Parent Class > Trait > current Class
    // 3. 如果類同時有多個特質
    //    從左到右依次執行初始化
    //    Left Trait > Right Trait
    // 4. 如果父類和子類同時有 Trait
    //    Parent Trait > Parent Class > Current Trait > Current Class
    // 5. 在同一個構建過程中，初始化只會執行一次


  }
  trait MyTrait {
    println("11111")
  }
  trait MyTrait1{
    println("22222")
  }
  class Parent extends MyTrait1 {
    println("33333")
    }
  class User extends Parent with MyTrait with MyTrait1 {
    println("44444")
  }
  // 2
  // 3
  // 1
  // 2 // 在同一個構建過程中，初始化只會執行一次
  // 4
}


