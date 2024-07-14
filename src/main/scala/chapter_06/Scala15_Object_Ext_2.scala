package chapter_06

object Scala15_Object_Ext_2 {
  def main(args: Array[String]): Unit = {
    println(Color.RED)
    println(Color.RED.id)
  }

  object Color extends Enumeration {
    val RED = Value(1, "red")
    val YELLOW = Value(2, "yellow")
    val BlUE = Value(3, "blue")
    }
}


