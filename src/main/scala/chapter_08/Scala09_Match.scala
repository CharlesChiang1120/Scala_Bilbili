package chapter_08

object Scala09_Match {
  def main(args: Array[String]): Unit = {

    // TODO 模式匹配 - 偏函數
    // 以偏概全
    // TODO 功能函數中，存在偏函數和全函數的概念
    //      所謂的全函數，表示功能函數會對數據集中的所以的數據進行處理
    //      所謂的偏函數，表示功能函數會對數據集中滿足條件的數據進行處理

    val list = List(1, 2, "3", 4)
    // 數字加1，字符串不要
//    val newList = list.map {
//      case i: Int => i + 1
//      case s : String =>
//    }

//    val newList = list.filter(_.isInstanceOf[Int]).map{
//            case i: Int => i + 1
//    }

    // 如果想要對滿足條件的數據進行處理，那麼就需要採用偏函數
    // 偏函數其實就是模式匹配，但是不是所有的功能都支持
    // collect 方法支持偏函數操作

    val newList = list.collect{case i: Int => i + 1}
    println(newList)
  }
}