package chapter_07

object Scala14_Collection_Method {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 功能函數 - 計算
    // 集合不可能將所有的計算全部封裝，所以有些計算需要我們自己指定，然後由集合幫助我們執行
    // 將計算邏輯作為參數，傳遞給集合，由集合完成計算
    // TODO 計算過程中，必須是兩兩計算
    //      兩兩計算完畢後，繼續執行兩兩計算，迭代操作
    //      所有的數據參與計算之後，會得到總的結果
    val list = List(1, 2, 3, 4, 5)
    // reduce 方法可以實現自定義的聚合計算
    // reduce 方法需要傳遞一個參數，參數類型為函數類型: (A1, A1) => A1
    // 這裡的 A1 表示兩兩計算時，數據類型保持一致，且計算結果的類型也一致
    // reduce 方法的返回值類型也是 A1
//    val result = list.reduce(
//      (x: Int, y: Int) => {
//        println(x + "+" + y)
//        x + y
//      }
//    )
    val result = list.reduce(_ - _)

    // reduce 的底層操作就是 reduceLeft
    val result1: Int = list.reduceLeft(_ - _)

    // reduceRight 的底層實現
    // reversed.reduceLeft[B]((x, y) => op(y, x))
    // reversed => 5, 4, 3, 2, 1
    // 1 - (2- (3 - (4 - 5)))
    val result2: Int = list.reduceRight(_ - _)

    println(result) // -13
    println(result1) // -13
    println(result2) // 3

    // TODO 如何區分 reduceLeft, reduceRight
    // 簡單的方式加括號
    // TODO reduceLeft 從左邊加括號
    // (((1 2) 3) 4)

    // TODO reduceRight 從右邊加括號
    // (1 ( 2 ( 3 4)))
  }
}