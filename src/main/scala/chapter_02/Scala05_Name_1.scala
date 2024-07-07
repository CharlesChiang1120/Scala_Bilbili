package chapter_02

object Scala05_Name_1 {
  def main(args: Array[String]): Unit = {

    // TODO 標示符
    // 因為 Scala 是一個完全面向函數式的編成語言，所以可以聲明特殊符號作為標示符
    // 使用特殊符號作為 Scala 的標示符，規則不要記，錯了就改
    // 如果非要記，常使用用在代碼中的符號不要使用：=, {}, [], (), '', ""
    val + = "zhangsan"
    val - = "zhangsan"
    val * = "zhangsan"
    val / = "zhangsan"
    val ~ = "zhangsan"
    // val @ = "zhangsan"
    val @@ = "zhangsan"
    // val # = "zhangsan"
    val ## = "zhangsan"
    val % = "zhangsan"
    val ^ = "zhangsan"
    val & = "zhangsan"
    // val () = "zhangsan"
    // val ( = "zhangsan"
    // val  = "zhangsan"
    val ? = "zhangsan"
    val > = "zhangsan"

    // TODO 如果使用特殊符號形成的文字，表示特殊的含義，我們稱之為顏文字
    val :-> = "zhangsan"

    // 本質上特殊符號在編譯後會被編譯器轉換，所以可以使用
    // 一般情況下，不推薦使用$開頭
    // $colon$minus$greater in Java
    println(:->)

    // 不能再聲明像下面這樣，因為是一樣的
    // val $colon$minus$greater = "lisi"




  }
}
