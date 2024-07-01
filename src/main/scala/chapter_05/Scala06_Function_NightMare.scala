package chapter_05

object Scala06_Function_NightMare {
  def main(args: Array[String]): Unit = {

    // TODO 函數式編程語言 - 噩夢版
    // TODO Scala 語言的作者馬丁，為了開發人員可以更加便捷地開發程序，所以可以簡化很多代碼
    //      如果編譯器可以動態識別的語法，那開發人員是可以不需要編碼的，可以省略
    //      這體現了[至簡原則]: 能省則省

    def test(): String = {
      return "zhangsan"
    }
    //    println(test())

    // TODO 1. 如果函數體中的邏輯代碼需要返回，可以省略 return 關鍵字
    //         Scala語言中，所有的表達式是可以直接將滿足條件的最後一行的代碼邏輯的結果作為返回值

    //    def test1(): String = {
    //       "zhangsan"
    //    }
    //    println(test1)

    // TODO 2. 如果函數的邏輯代碼只有一行，可以將大括號省略
    //    def test2(): String = "zhangsan"
    //    println(test2())

    // TODO 3. 如果能夠通過返回值推斷出返回類型，那麼返回值類型可以省略
    // def test3() = "zhangsan"
    // println(test3())

    // TODO 4. 如果函數的參數列表中沒有聲明參數，那麼小括號可以省略
    // 如果省略參數列表的小括號，那麼調用時也不能添加
    // 因為省略很多的語法內容，所以變量聲明和函數聲明很像，所以必須採用關鍵字區分
    //     def test4 = "zhangsan"
    //     println(test4()) // error
    //     println(test4)

    // TODO 5. 等號可以省略，但是一般是和 Unit 同時省略
    //  如果邏輯代碼中 return 返回，但是函數聲明為 Unit，此時 return 不起作用
    // 如果想要省略 Unit，那麼會發生錯誤，如果想省略 Unit，又不想發生錯誤，可以將等號同時省略
    def test5() {
      return "zhangsan"
    }
    // println(test5())

    // TODO 6. 如果函數名稱不重要的時候，def 和函數名也可以省略，稱之為匿名函數
    // 1. def 和函數名要省略
    // 2. 返回值類型也需要省略，由邏輯代碼自動推斷
    // 3. 等號需要增加大於號表示關聯
    () => {
      return "zhangsan"
    }
  }
}
