package chapter_02
object Scala09_DataType_1 {
  def main(args: Array[String]): Unit = {

    // TODO
    val i : Int = 10
    val s : String = "abc"

    val a : AnyVal = i
    val b : AnyRef = s
    val c : Any = a
    println(a)
    println(b)

  }
}
