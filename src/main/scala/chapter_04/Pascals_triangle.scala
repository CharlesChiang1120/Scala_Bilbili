package chapter_04

object Pascals_triangle {
  def main(args: Array[String]): Unit = {
    pascalsTriangle(20)
  }
  def pascalsTriangle(level:  Int) : Unit = {
    for (i <- Range(1, level, 2); j = (level - i)/2) {
      println(" "*j + "*"*i)
    }
  }
}
