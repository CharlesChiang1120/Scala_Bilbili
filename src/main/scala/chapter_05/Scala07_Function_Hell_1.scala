package chapter_05

object Scala07_Function_Hell_1 {
  def main(args: Array[String]): Unit = {

    // TODO 函數是編成語言 - 地獄版
    // 函數其實就是物件
    // 1. 物件應該有類型
    // 2. 物件應該可以賦值給其他人使用
    def test(): Unit = {

    }

    def test1(age: Int): String = {
      age.toString
    }

    def test2(
               age1: Int,
               age2: Int,
               age3: Int,
               age4: Int,
               age5: Int,
               age6: Int,
               age7: Int,
               age8: Int,
               age9: Int,
               age10: Int,
               age11: Int,
               age12: Int,
               age13: Int,
               age14: Int,
               age15: Int,
               age16: Int,
               age17: Int,
               age18: Int,
               age19: Int,
               age20: Int,
               age21: Int,
               age22: Int,
               age23: Int,
               age24: Int,
               age25: Int
             ): Unit = {
                println("test...")
             }


    // 將函數物件 test 賦值給f
    // 此時 f 可以通過編譯器自動推斷類型，函數物件的類型稱為函數類型
    // Function0[Unit]:
    //      這裡類型中的0表示函數參數列表中參數的個數
    //      中括號中的 Unit 表示函數沒有返回值
    // val f: Function0[Unit] = test _
    //     Function1[Int, String]
    //     這裡類型中的1表示函數參數列表中參數的個數
    //     中括號中的 Int 表示函數參數的類型
    //     中括號中的 String 表示函數返回值的類型
//    val f: Function1[Int, String] = test1 _

    // TODO [函數物件]的參數最多只能有22個
    //      [函數]的參數個數可以有無限多個
//    test2(1,2,3,4,5,6,7,8,9,10,
//      11,12,13,14,15,16,17,18,19,20,
//      21,22,23,24,25)

    // error message: functions may not have more than 22 parameters; method test2 cannot be eta-expanded because it takes 25 arguments
//    val ff = test2 _

    // TODO 為了使用方便，函數類型可以使用另外一種聲明方式
    // 這裡的函數類型為: Int(參數列表的參數類型) => String(返回值類型)
    val f = test1 _

    def test3(name: String, age:Int): Unit = {

    }
    // (String, Int) => Unit
    val f3 = test3 _

  }
}
