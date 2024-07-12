
package chapter_05
import chapter_06.Scala06_Object_Access.User

object Scala13_Function_Access {
  def main(args: Array[String]): Unit = {
    val user = new User()
      // println(user.name) // X
      // println(user.age) // X
      // println(user.email) // X
      println(user.address)
  }
}
