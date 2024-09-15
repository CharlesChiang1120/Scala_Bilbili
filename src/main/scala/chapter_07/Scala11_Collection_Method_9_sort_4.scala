package chapter_07

object Scala11_Collection_Method_9_sort_4 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 功能方法(函數)
    // 排序
    val user1 = new User()
    val user2 = new User()
    val user3 = new User()
    val user4= new User()

    user1.age = 20
    user2.age = 40
    user3.age = 30
    user4.age = 30

    user1.money = 1000
    user2.money = 2000
    user3.money = 2500
    user4.money = 1500

    val list = List(user1, user2, user3, user4)

    // TODO 如果 Scala 中的排序的規則如下:
    // 先按照第一個數據排序，如果數據相同，再按照第二個數據排序，如果數據相同，再按照第三個數據排序，依此類推
    // 可以採用特殊的方式排序: Tuple 排序
    // 默認情況下，sortBy 排序為升序排列，如果想要降序排泄，那麼需要傳遞第二個參數列表
    val newList = list.sortBy(
      user => {
        (user.age, user.money)
      }
    )(Ordering.Tuple2(Ordering.Int, Ordering.Int.reverse))

    println(newList)
  }
  class User {
    var age: Int = _
    var money: Int = _

    override def toString: String =  {
      s"User[${age}, ${money}]"
    }
  }
}
