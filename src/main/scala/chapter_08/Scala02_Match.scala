package chapter_08

object Scala02_Match {
  def main(args: Array[String]): Unit = {

    // TODO 模式匹配

    // Java 的 switch 的穿透現象僅僅是個現象，不是錯誤
    // 恰恰這個現象可能會導致代碼的歧義，所以 Scala 中不存在


    // 1. 如果代碼邏輯只有一行，那麼可以省略大括號，但是需要明確執行完畢，自動跳出
    // 2. Java 的 switch 語法，case 關鍵字和 default 關鍵字存在執行的先後順序
    //    Scala 中沒有 default 關鍵字，所以如果將下划線分支放置在最前面，那麼會優先執行
    // 3. Scala 中的模式匹配的主要作用就是按照指定的規則對數據進行匹配
    //    如果數據沒有匹配任何的規則，就會發生錯誤: scala.MatchError
    val age = 30

    age match {
      case 10 => println("age = 10")
      case 20 => println("age = 20")
      case _ => println("其他")
    }
  }
}
