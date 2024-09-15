package chapter_07

object Scala08_Collection_Tuple_1 {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Tuple
    // Tuple 如果採用集合類型來表示，比較麻煩，可以採用簡化版本

    val t1: Tuple3[Int, String, Int] = (1, "zhangsan", 30)
    val t2: (Int, String, Int) = (1, "zhangsan", 30)

    // Tuple 元素的訪問
    // 無法使用循環操作，因為數據之間沒有關係，就不能採用相同的循環邏輯
    // 如果想要訪問其中的數據，可以採用順序號，最大的順序號等同於元素的個數
    println(t2._1)
    println(t2._2)
    println(t2._3)

    println(t2.productElement(0))

  }
}
