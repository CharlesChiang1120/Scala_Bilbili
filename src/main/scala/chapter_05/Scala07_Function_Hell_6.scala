package chapter_05

object Scala07_Function_Hell_6 {
  def main(args: Array[String]): Unit = {

    // TODO 函數是編成語言 - 地獄版
    // 1. 將函數物件作為變量賦值使用
    // 2. 將函數物件作為參數使用
    /*
     TODO Java:
     public User test() {
          User user = new User()
          return user;
     }

     User u = test();
     u.xxxx
     u.yyyy
     */

    // TODO Scala 也可以將函數物件作為結果返回
    // 函數的返回值類型一般情況下不聲明的，使用自動推斷
    def outer() = {
      def inner(): Unit = {
        println("inner.....")
      }
      inner _
    }
    // 此時，f就是一個函數物件，有函數爛型: () => Unit
    val f = outer()
    // 執行函數物件
    f()

  }
}
