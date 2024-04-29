package chapter_02

object Scala02_Var {
  def main(args: Array[String]): Unit = {
    // TODO 變量

    // Java => 變量類型 變量名稱 = 變量值
    //         String  name   = "zhangsan"
    // TODO 聲明變量
    // Scala 聲明變量需要採用特殊的方式
    //       1. 採用 var/val 關鍵字
    //       2. 變量名稱應該放置在變量類型之前
    //       3. 變量名稱和變量類型之間採用：分隔
    //       4. Scala 中變量必須顯示地初始化

    var name: String = "zhangsan"

    // TODO 訪問變量
    println(name)
  }

}
