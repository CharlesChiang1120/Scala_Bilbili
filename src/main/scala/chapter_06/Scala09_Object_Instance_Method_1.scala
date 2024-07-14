package chapter_06

object Scala09_Object_Instance_Method_1 {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 實例化 - 物件的構造方法
      // Java 中的構造方法可以重載
      // Scala 中的構造方法如何重載的？
      // TODO Scala 中的構造方法分兩大類
      // 1. 主構造方法: 完成類的初始化
      // 2. 輔助構造方法: 在類的初始化後，完成類的輔助功能，屬性賦值
      //                輔助構造方法必須直接或間接地調用主構造方法
      //                輔助構造方法有重載的概念，但是主構造方法沒有
      //                輔助構造方法採用 this 關鍵字聲明
      //                多個輔助構造方法在調用時，需要提前聲明

      // 11111 22222 44444 33333
      val user = new User("zhangsan",30)



    }
   class User() {
     println("11111")
     def this(name: String)= {
       this()
       println("22222")
     }
     def this(name: String, age: Int) = {
       this(name)
       println("33333")
     }
     println("444444")
   }

}


