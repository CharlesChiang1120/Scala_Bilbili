package chapter_06

import scala.beans.BeanProperty

object Scala06_Object_Access {
    def main(args: Array[String]): Unit = {

        // TODO 物件導向編程 - 訪問權限
        //    Scala 中的訪問權限和 Java 類似，也有四種不同的權限
        // 1. private: 私有，同類
        // 2. private[包名]: 包私有，同類，同包(子包)
        // 3. protected: 受保護的，同類，同包，子類
        // 4. (default): 公共的，任何地方都可以使用
    }
    class User {
        private var name: String = "zhangsan"
        private[chapter_06] var age: String = "zhangsan"
        protected var email: String = "zhangsan"
        var address: String = "zhangsan"

        def test(): Unit = {
            println(this.name)
            println(this.age)
            println(this.email)
            println(this.address)
        }
    }
    class Emp {
        val user = new User()
        def test(): Unit = {
            // println(user.name) // X
            println(user.age)
            // println(user.email) // X
            println(user.address)

        }
    }

    class Student extends User{
        def test1(): Unit = {
            val user = new User()
            // println(user.name) // X
            // println(user.age)
            println(user.email) // 子類
            println(user.address)
        }
    }
}

package subchapter06{
    class SubClasee {

        import chapter_06.Scala06_Object_Access.User
        def test(): Unit = {
            val user = new User()
            // println(user.name) // X
            println(user.age)
            // println(user.email) // X
            println(user.address)
        }
    }
}


