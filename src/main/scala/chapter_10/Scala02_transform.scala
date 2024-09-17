package chapter_10

object Scala02_transform {
  def main(args: Array[String]): Unit = {

    // TODO 隱式轉換 - 二次編譯
    implicit  def transform(d : Double): Int = {
      d.toInt
    }

    // TODO 程序碰見了問題，如果是類型轉換上的問題，可以通過編成手段轉換類型解決
    //      但是解決的過程不能違背 OCP 開發原則
    //      編譯器可以理解為代碼生成器
    //      編譯器在編譯的時候，如果出現了錯誤，此時可以自動查找相應的轉換操作。如果查找到，會自動進行轉換，進行二次編譯
    //      如果想要讓編譯器可以找到指定的轉換規則，那麼需要將方法使用特殊關鍵字聲明
    val age: Int = thirdPartGetAge()

    println(s"年齡為$age")

  }
  def thirdPartGetAge(): Double = {
    10.5
  }
}
