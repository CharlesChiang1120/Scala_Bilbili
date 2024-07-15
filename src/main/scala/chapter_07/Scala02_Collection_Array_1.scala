package chapter_07

object Scala02_Collection_Array_1 {

  def main(args: Array[String]): Unit = {

    // TODO 集合 - 數組
    // 構建數組
    // String[] strs = new String[]{"1", "2", "3"}
    // 集合在構建時，希望同時增加數據，而不是構建後再增加
    // 此時可以採用集合對象的特殊方法
//    val array: Array[Int] = Array.apply(1, 2, 3, 4)
    // apply 方法可以被 Scala 編譯器自動識別的，可以省略
//    val array1: Array[Int] = Array(1, 2, 3, 4)

//    println(array.mkString(", "))
//    println(array1.mkString(", "))

    // TODO Array 其實是不可變數組
    val array = Array(1, 2, 3, 4)

    // 添加數據，會產生新的數組
//    val array1: Array[Int] = array.+:(5)
//    val array2: Array[Int] = array.:+(6)

//    println(array eq array1)
//    println(array eq array2)

//    println(array1.mkString(", "))
//    println(array2.mkString(", "))

    // 一般情況下，調用集合物件的特殊方法時，都會採用運算符的方式來使用
    // 如果運算符採用冒號結尾，那麼運算規則為從右向左計算
    val array1 = 5 +: array // 5, 1, 2, 3, 4
    val array2 = array :+ 6 // 1, 2, 3, 4, 6

    println(array1.mkString(", "))
    println(array2.mkString(", "))

//    array.foreach(println)

    val array3 = array1 ++: array2 // 5, 1, 2, 3, 4, 1, 2, 3, 4, 6
    println(array3.mkString(", "))

  }
}
