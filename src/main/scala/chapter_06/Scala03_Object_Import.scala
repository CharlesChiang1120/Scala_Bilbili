package chapter_06

import java.util


object Scala03_Object_Import {
    def main(args: Array[String]): Unit = {
      // TODO 物件導向編程
      // TODO Java:
      // 導入: import
      // 用法: import.java.util.List
      //      import.java.util.*
      //      import static java.util.XXXXX.YYYYY
      // 用途: 1. 導類
      //      2. 靜態導入
      // 分析: DateUtil
      // TODO Scala 語言將 Java 的語法進行擴展
      // 1.import 是可以導包
//      import chapter_05.testPackageChapter05
//      chapter_05.testPackageChapter05()

      // 2. import 關鍵字可以在任何地方使用
      // import 如果當前位置使用，那麼其他位置就不起作用
//      import java.util.Date
//      val date = new Date()

      // 3. Scala 導入一個包中所有的類，採用下滑線代替 Java 中的星號
//      import java.util._
//      new ArrayList()

      // 4. 可以將一個包中的多個類在同一行中導入
//      import java.util.{List, ArrayList, Map, HashMap}

      // 5. 屏蔽類
      //    如果不同的包中有相同名稱類，可以通過屏蔽方式進行編譯
//      import java.util._
//      import java.sql.{Date=>_, _}
//      new Date()

      // 6. 給類起別名
//      import  java.util.{HashMap=>JavaHashMap}
//      val map = new JavaHashMap()

      // 7. Scala 中 import 的規則
      // 以當前包為基準，導入指定子包中的類，如果找不到，再從頂級包中一次查找，需要採用特殊的燒操作
      println(new _root_.java.util.HashMap()) // {}

      // 8. 有些內容是無需導入的
      //    Java 中 java.lang 包中類無需導入
      //    Scala 中 java.lang 包也無需導入
      //    Scala 中 scala 包也無需導入
      //    Scala 中 Predef 物件的方法也無需導入，類似於靜態導入
      println("123")


    }

//  def test(): Unit = {
//    val date = new Date
//  }
  }

package java {
  package util {
    class HashMap
  }
}
