package chapter_06

object Scala11_Object_Abstract_1 {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 抽象
      // 一個類中如果有抽象方法，那麼這個類是抽象類
      // 如果一個類是抽象類，那麼這個類不一定有抽象方法
      // 如果父類的方法為抽象方法，那麼子類的方法如果重寫時，只需要補充完整即可，無需其他操作
      // 如果父類的方法為完整方法，那麼子類的方法如果重寫時，需要增加特殊的關鍵字，明確方法的重寫
      val user = new ChildUser()
      user.test()

  }
  abstract class User {
    // TODO 不完整的方法(只有聲明，沒有實現)，稱之為抽象方法
    def test(): Unit ={
      println("user test...")
    }
  }
  class ChildUser extends User{
    override def test(): Unit = {
      println("child user test...")
    }
  }

}


