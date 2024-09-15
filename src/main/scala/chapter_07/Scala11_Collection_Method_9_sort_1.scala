package chapter_07

object Scala11_Collection_Method_9_sort_1 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 功能方法(函數)
    // 排序
    val user1 = new User()
    val user2 = new User()
    val user3 = new User()

    user1.age = 20
    user2.age = 40
    user3.age = 30

    val list = List(user1, user2, user3)
    val newList = list.sortBy(user=>user.age)(Ordering.Int.reverse)

    println(newList)
  }
  class User {
    var age: Int = _

    override def toString: String =  {
      s"User[${age}]"
    }
  }
}
