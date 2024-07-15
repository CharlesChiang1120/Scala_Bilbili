package chapter_07

object Scala02_Collection_Array {

  def main(args: Array[String]): Unit = {

    // TODO 集合 - 數組
    // Java 中數組不算是集合
    // Java 中的集合都是有自己的類型。ArrayList<String>
    /*
      String[] strs = new String[4];
     */
    // Scala 是一個完全物件導向的語言，所以萬物皆物件
    // 數組也是物件，也有自己的類型: Array
    // Scala 中 Array 的本質就是 Java 的數組[]
    // Scala 中的中括號表示泛型

    // TODO 數組的基本操作
    // 創建
    val array = new Array[String](3)
    // 增刪改查
    // Array 沒有添加和刪除的能力，只能通過索引的方式修改數據
    // Array 訪問時的索引操作採用小括號，而不是中括號
    array(0) = "zhangsan"
    array(1) = "lisi"
    array(2) = "wangwu"

    // 查詢數組中的數據，可以通過索引的方式
//    println(array(0))
    // 可以直接將數組中的數據生成字符串
//    println(array.mkString(", "))
    // 可以採用基本的 for loop 的方式
//    for (str <- array) {
//      println(str)
//    }
    // 採用物件導向的方式實現循環操作:
    // foreach 方法的作用就是將集合中的每一條數據進行處理
    // 這裡的處理邏輯不是固定的，由開發人員自行決定，Scala 集合幫開發人員將數據傳遞到邏輯中
    // foreach 方法的參數有一個，這個參數的類型是函數類型 String => Unit
    def foreachFunction(str: String): Unit = {
        println("********* " + str)
    }
    // 將函數物件作為參數使用時，參數名稱很重要，但是函數名稱不是很重要，所以一般情況下，可以省略
    // array.foreach(foreachFunction)
//    array.foreach(
//        (str: String) => {
//        println("********* " + str)
//      }
//    )
//
//    array.foreach(
//      (str: String) => println("********* " + str)
//    )
//
//    array.foreach(
//      str => println("********* " + str)
//    )

    array.foreach(println(_))
    // array.foreach(println)


  }
}
