package chapter_06 {
  object Scala02_Object_Package {
    def main(args: Array[String]): Unit = {
      // TODO 物件導向編程
      // Java:
      // 包: package
      // 用法: 包名的規則，
      //      域名的反寫 + 項目的名稱 + 模塊的名稱 + 程序的分類(分層)名稱
      //      com.atguigu + gmall + user + util(service, beam)
      //      com.atguigu.gmall.user.util
      // 用途: 1. 分類管理
      //      2. 區分類: java.util.Date, java.sql.Date
      //      3. 包權限
      //      4. 包的路徑應該和源碼的存放路徑相同
      // 分析:
      //      1. 聲明一個 User，含義不確定，最好是見名知義，類名起的準確一下
      //         UserUtil, UserBean, UserService
      //         DateUtil, DateBEan, DateService
      //      2. 如果可以通過類名對類進行區分，那麼其實包沒有那麼重要
      //      3. 權限不好用
      //      4. 包語法在執行的過程中，只要從 classpath 環境變量中可以查找到，就應該可以
      //         所以和源碼的物理路徑沒有任何關係
      // TODO Scala 的 package 語法比 Java 的語法更豐富
      // 1. package 關鍵字可以多次聲明，體現不同包的關係
      //    Java 中的點表示從屬關係
      // 2. 可以給包設定作用域，體現上下級關係
      // 3. 將包也當作物件: package object xxxxx
      //    包物件中聲明的屬性和方法，在當前包和它的子包都可以直接訪問
      testPackageObject()
    }
  }
}


