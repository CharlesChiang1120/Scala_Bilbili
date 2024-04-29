package chapter_02

object Scala03_Val {
  def main(args: Array[String]): Unit = {

    // TODO 變量
    // TODO 聲明變量
    var name: String = "zhangsan"
    val email: String = "zhangsan123@111.com"

    // var 關鍵字修飾的變量，值可以被改變的，稱之為可變變量
    name = "lisi"
    // val 關鍵字修飾的變量，值不可以被改變的，
    // var 和 val 關鍵字聲明的變量，在編譯後沒有本質上的區別，但會在編譯時進行約束
    // email = "lisi@111.com"

    // TODO 訪問變量
    println(name)
    println(email)
  }
}
