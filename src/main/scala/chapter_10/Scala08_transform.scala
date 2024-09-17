package chapter_10

import chapter_10.Scala07_transform.User

object Scala08_transform extends OtherTrait {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4)
    // 降序
    // sortBy 有兩個參數列表
    // 第二個參數列表表示的隱式參數，調用時無需增加小括號，會自動查找排序規則
    // 如果不想使用引式參數，那麼需要增加括號

    // 如果程序發生錯誤，提示(...)，表示隱式變量沒有找到
    println(list.sortBy(num=>num))
    println(list.sortBy(num => num)(Ordering.Int.reverse))

  }
}
