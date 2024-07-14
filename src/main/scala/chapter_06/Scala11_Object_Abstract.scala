package chapter_06

object Scala11_Object_Abstract {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 抽象
      // 不完整的東西就可以理解為抽象的
      // 抽象方法: 不完整的方法
      // 抽象類: 不完整的類
      // 因為類中包含方法，如果方法不完整，那麼類也就不完整，那麼類就是抽象類
      // 抽象類前面應該需要增加 abstract
      // 既然類是不完整的，所以無法直接構建物件
      // 如果像要構建物件，需要由子類繼承後補充完整再構建
      val user = new ChildUser()
  }
  abstract class User {
    // TODO 不完整的方法(只有聲明，沒有實現)，稱之為抽象方法
    def test(): Unit
  }
  class ChildUser extends User{
    def test(): Unit = {
    }
  }

}


