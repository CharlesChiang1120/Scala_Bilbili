package chapter_09

import java.io.FileInputStream

object Scala02_Exception {
  def main(args: Array[String]): Unit = {

    // TODO 異常
    // Scala 中的異常處理類似於模式匹配中的類型匹配
    // 捕捉異常時，無需考慮異常的範圍，但是如果異常方法大先捕捉，其他的異常就捕捉不到，沒有意義
//    try {
//      val i = 0
//      val j = 10 /i
//    } catch {
//      case e : ArithmeticException => {
//        println("ArithmeticException: " + e.getMessage)
//      }
//      case e: Exception => {
//        println("Exception: " + e.getMessage)
//      }
//    } finally {
//
//    }
    @throws[Exception]
    def test() = {
      throw new Exception()
    }
  }
}
