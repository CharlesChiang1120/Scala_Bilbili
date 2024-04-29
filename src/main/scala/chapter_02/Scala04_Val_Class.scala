package chapter_02

object Scala04_Val_Class {
  def main(args: Array[String]): Unit = {

    // TODO 變量
    val email: String = "zhangsan123@111.com"

    // Scala 語言的目的是為了簡化代碼的開發，讓開發程序更容易
    // Hive => SQL => MR
    // TODO Scala 語言中存在一個開發的原則：至簡原則
    // 至簡原則 : 寫代碼時，能簡單則簡單，能簡潔則簡潔，能省則省
    //          這裡的能省則省，不是說不寫，而是由編譯器幫你補充完整
    // Java 和 Scala 是一個強類型的語言，所以編譯時一定要確定變量的類型，那麼變量的取值也就確定了
    // 如果變量的值確定了，那我變量的類型也就確定了。所以寫程序時類型可以省略，由編譯器補充完整
    // TODO 多態不適用這個場合
    var name = "lisi"
    println(name)
  }
}
