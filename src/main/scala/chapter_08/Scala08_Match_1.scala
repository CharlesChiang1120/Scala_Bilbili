package chapter_08

object Scala08_Match_1 {
  def main(args: Array[String]): Unit = {

    // TODO 模式匹配 - 匹配對象 - 樣例類
    // 物件匹配比較麻煩，需要增加一些特定的方法才可以實現
    // Scala 語言提供了一個簡單的方式來實現這個匹配的過程
    // 在 class 前面增加一個關鍵字: case
    // 並且需要傳遞參數，用於匹配屬性，這樣的類稱之為[樣例類]


    // 1. 這樣類的構造參數會自動作為類的屬性，默認不能改變，使用 val 聲明, 如果想要改，要使用var
    // 2. 樣例類就是一個普通類，只不過可以應用在模式匹配中用於匹配物件
    // 3. 樣例類聲明很簡單，但是編譯後會自動產生大量的方法，都是由編譯器完成
    // 4. 樣例類自動實現可序列化接口，重寫方法: equals, copy, hashCode
    // 5. 樣例類同時聲明了伴生物件，存在 apply, unapply 方法
    val user = thirdPart()
    user match {
      case User("zhangsan", 30) => {
        println("our user (zhangsan, 30)")
      }
      case _ => {
        println("not our user")
      }
    }
  }

  case class User(name:String, age:Int)

  def thirdPart(): User = {
    User("zhangsan", 30)
  }

}