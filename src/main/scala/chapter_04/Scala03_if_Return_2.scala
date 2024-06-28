package chapter_04

object Scala03_if_Return_1 {
  def main(args: Array[String]): Unit = {

    // TODO 分支流程
    val age = 30
    val result : Any = if (age == 30) {
      1
    } else {
      "zhangsan"
    }
    // Any 類型的數據無法進行數據增加
    // println(result + 1)

  }

}
