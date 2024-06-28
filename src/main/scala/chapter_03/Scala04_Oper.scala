package chapter_03
import scala.language.postfixOps

object Scala04_Oper {
    def main(args: Array[String]): Unit = {

      // TODO 運算符本質其實就是物件的方法，只不過進行了簡化
      // Scala 語言是萬物皆物件，所以運算符其實就是物件的方法 (功能)
      // 數字其實也是物件
      // 為了方便使用和理解，如果方法調用時，可以進行簡化
      // 1. 點可以省略
      // 2. 如果方法參數只有一個，可以省略小括號

      // val r = 1.+(1)
      // val r = 1 + (1)
      // val r = 1 + 1
      // println(r)

      val s1 = new String("123")
      val s2 = new String("123")

      println(s1.eq(s2))
      println(s1 eq s2)
      println(s1 equals s2)

      val i = 10
      // import scala.language.postfixOps
      println(i toString)
    }
  }
