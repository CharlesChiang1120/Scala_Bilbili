package chapter_11

object Scala04_Generic_Scala {
  def main(args: Array[String]): Unit = {

//    // TODO 泛型的應用
//    val list: List[Int] = List(1, 2, 3, 4)

    // (A1, A1)) => A1
    // (Int, Int) => Int
    // A1(AnyVal, Any) >: Int
//    list.reduce()
    val list: List[User] = List(new User(), new User(), new User())

    // A1 => Parent
//    val parent: Parent = list.reduce[Parent](
//      (p1, _) => {
//        p1
//      }
//    )
//    println(parent)

//    list.reduce[Child](
//      (c1, c2) => {
//        c1
//      }
//    )

  }
  class Parent{

  }
  class User extends Parent {

  }
  class Child extends User {

  }
}
