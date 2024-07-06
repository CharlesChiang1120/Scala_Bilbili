object TestOnly {
  def main(args: Array[String]): Unit = {

    def fun1(): String = {
      "aaaa"
    }

    val a = fun1
    val b = fun1 _
    val c: () => Unit = fun1

    println(a)
    println(b)
    println(c)
  }

}
