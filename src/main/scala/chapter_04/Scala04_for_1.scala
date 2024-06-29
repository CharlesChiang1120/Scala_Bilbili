package chapter_04

object Scala04_for {
  def main(args: Array[String]): Unit = {

    // TODO 循環控制
    // 如果表達式條件成立，那麼會執行循環體操作，然後再判斷條件，依此類推
    // 循環表達式 {
    //     循環體
    // }
    // 循環控制主要為 for, while
    /*
       Java :
       for (int i = 0; i < array.length; i++){
               sout(i)
       }

       for (Object obj : Array) {
               sout(obj)
       }

    */
    /*
       TODO scala :
       Scala :
       for (obj : Object : Array) {
            println(obj)
       }
    */
    val array = 1 to 5 // 從 1 到 5 (包含), 1, 2, 3, 4, 5
    val array1 = 1 until 5 // 從 1 到 5 (不包含), 1, 2, 3, 4
    val array2 = Range(1, 5)
    for ( i : Int <- array2 ){
        println(i)
    }

    for ( i <- array2) {
      println(i)
    }
  }

}
