package chapter_07

object Scala14_Collection_Method_1 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - 功能函數 - 計算
    // reduce 方法用於將數據集中的數據進行兩兩聚合，獲取最終的結果
    // 但是在某些情況下，需要將數據集和外部的數據進行聚合，這個時候，reduce 無法使用
    // 如果還想要聚合，可以採用一個特殊的方法: fold (折疊)

    // fold 方法的聚合原則還是兩兩聚合
    val list = List(1, 2, 3, 4)

    // fold 方法存在函數柯里化，有兩個參數列表
    // 第一個參數列表中傳遞一個參數: 計算初始值
    // 第二個參數列表中傳遞一個參數，參數的類型為函數類型，表示計算邏輯: (A1, A1) => A1
    // 這裡的 A1 表示兩兩計算的數據的類型，表示計算結果的類型要保持一致
    val i: Int = list.fold(5)(_ - _)

    // fold 底層調用的方法就是foldLeft
    // foldLeft 就是將初始值放置在集合的左邊，開始從左邊加括號
    // (((5 1) 2) 3) 4)
    val j: Int = list.foldLeft(5)(_ - _)


    // TODO foldRight 的底層實現
    // reversed.foldLeft[ㄈ]((x, y) => op(y, x))
    // 1, 2, 3, 4
    // 5  4, 3, 2, 1
    // (1 (2 (3 (4 5)))
    // foldRight 就是將初始值放置在集合的右邊，開始從右邊加括號
    val k = list.foldRight(5)(_ - _)

//    println(i) // -5
//    println(j) // -5
//    println(k) // 3

    // TODO 掃描的功能
    // 可以將 fold, foldLeft, foldRight 的執行過程記錄下來
    println(list.scan(5)(_ - _))
    println(list.scanLeft(5)(_ - _))
    println(list.scanRight(5)(_ - _))

  }
}