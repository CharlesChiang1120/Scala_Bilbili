package chapter_07

object Scala11_Collection_Method_9_sort_2 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 通用的方法 - 功能方法(函數)
    // 排序
  val dataMap: Map[String, Int] = Map(
      ("a", 1), ("b", 2), ("c", 3)
    )

    // map 方法將數據集中的每一條數據進行轉換處理，返回新集合
    // 執行 map 方法錢，集合的數據類型是可以明確知道
    // Map 集合中的每一條數據就是 KV 鍵值對，KV 鍵值對就是元組(對偶)
    dataMap.map(
      kv => {
        (kv._1, kv._2 * 2)
      }
    )
    val user1 = new User()
    val user2 = new User()
    val user3 = new User()

    user1.age = 20
    user2.age = 40
    user3.age = 30

    val list: List[User] = List(user1, user2, user3)

    // sortBy 方法對數據集中的每一條數據加標記，然後進行排序
    // val newList = list.sortBy(user => user.age)(Ordering.Int.reverse)
    val newList = list.sortBy(
      (user: User) => user.age)(Ordering.Int.reverse)
  }
  class User {
    var age: Int = _

    override def toString: String =  {
      s"User[${age}]"
    }
  }
}
