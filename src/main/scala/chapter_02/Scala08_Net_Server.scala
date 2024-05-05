package chapter_02

import java.io.PrintWriter
import scala.io.{BufferedSource, Source}

object Scala07_IO {
  def main(args: Array[String]): Unit = {

    // TODO IO
    // TODO Input
    // 從控制台獲取輸入的數字
    // val age : Int = scala.io.StdIn.readInt()
    // println(age)

    // 從文件中獲取數據
    // Scala 獲取文件的數據，需要採用特殊的物件
    val source: BufferedSource = Source.fromFile("/Users/charleschiang/Desktop/Udemy/JAVA/Scala-Bilibili/data/word.txt")
    val iter: Iterator[String] = source.getLines()
    while (iter.hasNext){
      println(iter.next())
    }
    source.close()

    // TODO output
    // Scala 中採用 Java 中的輸出操作
    val out = new PrintWriter("/Users/charleschiang/Desktop/Udemy/JAVA/Scala-Bilibili/data/test.txt")
    out.println("test")
    out.println("scala")
    out.flush()
    out.close()
  }
}
