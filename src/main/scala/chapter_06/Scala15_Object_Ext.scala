package chapter_06

object Scala15_Object_Ext {
  def main(args: Array[String]): Unit = {

    // TODO 物件導向編程 - 比較兩個物件
    // 1. Scala 和 Java 中，一般情況下，比較兩個對象的內存的場景比較少
    //    比較兩個物件都是內容(屬性)的比較
    // 2. Scala 中雙等號比較其實就是非空 equals 判斷，但是這裡的 equals 判斷默認就是比較內存
    //    但是一般情況下，比較物件，都是重寫 equals 方法，完成自定義比較功能
    // 3. 重寫 equals 方法時，首先應判斷類型是否相同
    val user1 = new User()
    user1.id  = 1001
    val user2 = new User()
    user2.id  = 1001

    println(user1 == user2)

  }

  class User {
    var id: Int = _

    override def equals(other: Any): Boolean = {
      if (other.isInstanceOf[User]) {
        val otherUser = other.asInstanceOf[User]
        this.id == otherUser.id
      } else {
        false
      }
    }
  }
}


