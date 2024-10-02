package chapter_11

object Scala03_Generic_Scala {
  def main(args: Array[String]): Unit = {

    // TODO 泛型
    //      Scala 中的泛型和 Java 的泛型大同小異
    // Scala 中的泛型也存在上限和下限的概念，但是不是採用關鍵字，而是採用顏文字
    //

  }

  class Message[T] {
    var content : T = _

  }
  // 生產者的目的是為了生產對象，所以需要保證對象具有通用性，所以需要將類型向上查找
  // 下限

  // 消費者的目的是為了消費數據，所以需要保證獲取到的數據，功能不丟失，需要將類型向下查找
  // 上限
  class Parent {

  }

  class Producer[T] {
    def produce( message: Message[_ >: T]): Unit ={

    }
  }

  class Consumer[T] {
    def consume(message: Message[_ <: T]): Unit ={
      null
    }
  }

  class User extends Parent {

  }

  class Child extends User {

  }
}
