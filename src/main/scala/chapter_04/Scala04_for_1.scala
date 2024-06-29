package chapter_04

object Scala04_for_1 {
  def main(args: Array[String]): Unit = {

    // TODO 循環控制
    val array = 1 to 5
    val array1 = 1 to 5 by 2
    val array2 = Range(1, 5, 2)

    // TODO 循環守衛 : 循環表達式中添加邏輯判斷
    for ( i <- array if i != 3) {
      println(i)
    }

    // TODO 循環步長，表示循環的增長幅度，默認幅度為1
    for (i <- array1) {
      println(i)
    }

    for (i <- array2) {
      println(i)
    }

    // TODO 循環嵌套
//    for (i <- 1 to 3) {
//      for (j <- 1 to 3)
//        println("i = " + i + ", j = " + j)
//    }
    for ( i <- Range(1, 5); j <- Range(1, 4)) {
      println("i = " + i + ", j = " + j)
    }

    // TODO 引入變量
//    for ( i <- 1 to 3) {
//        val j = i - 1
//        println(j)
//    }
    for (i <- 1 to 3; j = i - 1) {
      println(j)
    }
  }
}
