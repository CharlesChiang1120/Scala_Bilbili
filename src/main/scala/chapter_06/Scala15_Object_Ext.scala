package chapter_06

object Scala14_Object_Trait_3 {
  def main(args: Array[String]): Unit = {

    // TODO 物件導向編程 - 特徵的執行順序
    // 類混入特質時，也存在鑽石問題，但是 Scala 採用了一種特殊的方式來解決
    // 1. 為什麼混入特質
    //    增加約束
    //    功能的補充和疊加
    // 2. 如果混入了多個相同的功能，那麼就需要一個執行的順序，否則會出現錯誤

    // Scala 如何解決鑽石問題:
    // 將多個功能混入在一起，按照特定的執行順序進行疊加調用
    // 這裡的特定執行順序其實就是初始化順序的反向操作

    val mysql = new MySQL
    mysql.operateData()

  }
  trait Operate {
    def operateData(): Unit = {
      // TODO 操作數據
      println("進行數據處理")
    }
  }
  trait Database extends Operate {
    override def operateData(): Unit = {
      // TODO 操作數據
      print("向數據庫中")
      super[Operate].operateData()
    }
  }
  trait Log extends Operate {
    override def operateData(): Unit = {
      // TODO 操作數據
      print("向日誌文件中")
      // 這裡的 super 不是表示父特質，而是表示疊加功能後的上一級
      super.operateData()
    }
  }
  class MySQL extends Log with Database {

  }
}


