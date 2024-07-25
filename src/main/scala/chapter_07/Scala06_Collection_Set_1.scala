package chapter_07

import scala.collection.mutable

object Scala06_Collection_Set_1 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Set(集)
    // 可變的 Set 集合，需要根據包名進行區分

    val set = mutable.Set(1, 2, 3, 4, 5, 6, 7, 8)
    val set1 = mutable.Set(1, 1, 1, 1, 1, 1)
    val set2 = mutable.Set(1, 2, 3, 4)

    // TODO 增刪改查
    // Set 集合沒有 append,insert 方法的，因為沒有順序的概念
    set2.add(5)

    // 修改數據: Set 集合沒有位置概念，所以無法對指定的位置進行修改
    //          所以這裡的修改，僅僅是數據的狀態修改
//    set2.update(5, false)
//    set2.update(6, true)
//    set2(6) = true

    // 刪除數據
    set2.remove(2)

//    println(set)
//    println(set1)
    println(set2)
  }
}
