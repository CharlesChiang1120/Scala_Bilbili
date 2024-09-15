package chapter_07

object Scala11_Collection_Method_9_sort_3 {
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

    // TODO 先按照年齡排序，相同的年齡按照金額排序
//    val newList = list.sortBy(user=>user.age).sortBy(user=>user.money)
    // TODO sortBy 方法只是告訴集合排序的維度，但是具體數據的排序過程是由集合本身完成
    //      sortWith 方法來完成兩個數據的大小判斷，讓集合根據判斷結果進行排序
    // sortWith 方法需要傳遞一個參數，參數的類型為函數類型: (User, User) => Boolean
    // 這裡的 User 就是集合中婈比的兩個 User 對象
    // 這裡的 Boolean 表示預計的排序結果的判斷值: true: 預想的結果， false: 不是預想的結果
    val newList = list.sortWith(
      (user1, user2) => {
        // 年齡的升序 (小 -> 大)
        // 年齡的降序 (大 -> 小)
        if (user1.age < user2.age) {
          true
        } else if (user1.age == user2.age){
          user1.money < user2.money
        }
        else {
          false
        }
      }
    )
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
