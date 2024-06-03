package chapter_03

object Scala01_Oper {
    def main(args: Array[String]): Unit = {

      // TODO 運算符
      // 關系運算符
      // println( 10 < 20 )
      // 雙等號
      // Java 中的雙等號可以理解為比較值 (基本數據類型，就是值，引用數據類型是內存地址)
      // Scala 中的雙等號可以理解為非空 equals 操作
      // 如果想要比較內存地址，需要採用 eq 方法
      // println(11 == 11)
      val name1: String = null
      val name2 = "123"

      // println(name1 == name2)

      val name3 = new String("123")
      val name4 = new String("123")

      // println(name3 == name4)
      // println(name1.equals(name4))
      println(name3 eq name4)
    }
  }
