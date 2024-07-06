package chapter_06

import scala.beans.BeanProperty

object Scala05_Object_Field_1 {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 屬性

      val user = new User()
      user.name = "lisi"
      println(user.name)
//      user.age = 40

//      user.setName()
//      user.getName()
    }
    // 使用 val 聲明類的屬性，在編譯時，會給屬性增加 final 關鍵字
    // 類的屬性在編譯時，都是 private 權限
    // 類的屬性在編譯時，會同時生成屬性公共的 set, get 方法，但是名字中不是以 set, get 開頭
    // 當訪問屬性時，等同於調用物件的屬性的 get 方法
    // 當給屬性賦值時，等同於調用物件的屬性的 set 方法
    // Java 中 Bean 物件有 Bean 開發規範
    //     屬性私有化，提供公共的 set, get 方法，方法以 set, get 開頭
    // Scala 中物件屬性不遵循 Bean 開發規範，這樣，和其他技術框架集成的時候，會出現很多問題
    // 所以為了能夠和其他框架相集成， Scala 提供了一個註解，解決 Bean 規範的問題
    // 屬性的權限修飾符，如果採用 private ，那麼編譯時 set, get 方法也是 private
    // 增加 @BeanProperty 注視的屬性不能聲明 private 權限
    class User {
        @BeanProperty var name: String = _
        private var age: Int = 30
        val email = "zhangsan@zhangsan"
    }
}


