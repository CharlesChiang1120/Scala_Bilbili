package chapter_04

import scala.util.control.Breaks
import scala.util.control.Breaks._

object Scala06_break {
  def main(args: Array[String]): Unit = {

    // TODO 循環控制
    // Java : break(中斷，跳出循環), continue(繼續下一次的循環)
    // Scala 中沒有 continue 和 break 關鍵字，因為不是物件導向的，也可以用其他語法代替
    // continue 採用 if else 代替
    // break 採用物件導向來代替，底層會拋出異常跳出 for loop，外層應該要捕捉異常

//    Breaks.breakable {
//      for (i <- 1 to 5) {
//        if (i == 3) {
//          Breaks.break()
//        }
//        println("i = " + i)
//      }
//    }
    // Scala 可以透過特殊的語法操作，讓代碼變得簡單一些
    // Java 靜態導入功能
    breakable{
      for ( i <- 1 to 5) {
        if ( i == 3){
          break
        }
        println("i = " + i)
      }
    }
    println("End main function.")

//    for ( i <- 1 to 5) {
//      if ( i != 3) {
//        println("i = " + i)
//      }
//    }

    // 不可以用 return，因為會把整個 main function 結束，而不是只有結束 for loop
//    for (i <- 1 to 5) {
//      if (i == 3) {
//        return
//      }
//      println("i = " + i)
//    }

  }
}
