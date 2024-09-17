package chapter_09

import java.io.FileInputStream

object Scala02_Exception {
  def main(args: Array[String]): Unit = {

    // TODO 異常
    // Scala 中的異常處理類似於模式匹配中的類型匹配
    try {
      val i = 0
      val j = 10 /i
    } catch {
      case e: Exception => {
        println("Exception: " + e.getMessage)
      }
      case e : ArithmeticException => {
        println("ArithmeticException: " + e.getMessage)
      }
    }
  }
}
