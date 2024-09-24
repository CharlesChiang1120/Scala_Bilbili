package chapter_11

object Scala02_Generic_Scala {
  def main(args: Array[String]): Unit = {
    // TODO 泛型
    //  Scala 中的泛型與 Java 的泛型大同小異
    //  1. Java 中的泛型使用尖括號<>，Scala 中採用的是中括號[]
    //  2. Scala 中的泛型也是不可變的
    //  3. 泛型沒有多態的概念
    //     為了開發方便，整合概念，Scala 對泛型進行了語法補充
    //     泛型 + 多態
    //     3.1 如果類型不變，但是泛型存在多態(父子關係)，那麼(類型+泛型)也存在多態(父子關係)
    //         如果實現這樣的功能，那麼泛型就發生變化，這種變化稱之為[協變]
    //         協變的基本語法，就是在泛型的前面加特殊符號: +
    //     3.2 如果類型不變，但是泛型存在多態(父子關係)，那麼(類型+泛型)也存在子父關係
    //         如果實現這樣的功能，那麼泛型就發生變化，這種變化稱之為[逆變]
    //         逆變的基本語法，就是在泛型的前面加特殊符號: -
    val message1: Message[User] = new Message[User]()
    val message2: Message[User] = new Message[Parent]()
//    val message3: Message[User] = new Message[Child]()

  }

  class Message[-T] {

  }

  class Parent {

  }

  class User extends Parent{

  }

  class Child extends User {

  }
}
