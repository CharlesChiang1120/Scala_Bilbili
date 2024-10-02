package chapter_11

object Scala05_Generic_Scala {
  def main(args: Array[String]): Unit = {

    // TODO 泛型的上下文限定 = 隱式轉換 + 泛型
    def f[A: Test](a: A): Unit = println(a)
    implicit val test: Test[SubUser] = new Test[SubUser]
    f (new SubUser())


  }
  class Test[T]{

  }
  class Parent {

  }
  class User extends Parent {

  }
  class SubUser extends User {

  }
}
