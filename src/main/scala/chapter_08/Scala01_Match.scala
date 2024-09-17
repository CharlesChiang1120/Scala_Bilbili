package chapter_08

object Scala01_Match {
  def main(args: Array[String]): Unit = {

    // TODO 模式匹配
    // 這裡的匹配歧視就是匹配數據的規則
    // 這裡的模式其實就是特定寫法的規則 setXXXX
    // Java 中的語法: switch 在 Scala 中不存在，因為可以使用 if 語法代替
    // 但是 switch 的判斷數據的思路非常好，所以參考 switch 語法，Scala 增加了對數據進行了數據校驗的語法: 模式匹配
    val age = 20

    // Scala 中採用 match 關鍵字進行規則匹配
    // 每一個規則使用 case 進行聲明，如果規則匹配成功，那麼執行 case 後續的邏輯代碼
    // 代碼執行完畢，匹配結束，不會有穿透現象，Scala 語言中沒有 break 關鍵字
    // 如果多個規則匹配不成功，可以使用下划線表示任意值，類似於 default
    age match {
      case 10 => {
        println("age = 10")
      }
      case 20 => {
        println("age = 20")
      }
      case _ =>{
        println("其他")
      }
    }
  }
}
