package chapter_07

object Scala02_Collection_Array_2 {

  def main(args: Array[String]): Unit = {

    // TODO 集合 - 數組
    // 多維數組 => 數組中有數組
//    var myMatrix = Array.ofDim[Int](3, 3)
//    myMatrix.foreach(list => println(list.mkString(", ")))

    // 合併數組
//    val arr1 = Array(1, 2, 3, 4)
//    val arr2 = Array(5, 6, 7, 8)
//    val arr6: Array[Int] = Array.concat(arr1, arr2)
//    arr6.foreach(println)

    // 創建指定範圍的數組
    val arr7: Array[Int] = Array.range(0, 2)
    arr7.foreach(println)
    println("*****************************")

    // 創建並填充指定數量的數組
    val arr8: Array[Int] = Array.fill[Int](5)(-1)
    arr8.foreach(println)

  }
}
