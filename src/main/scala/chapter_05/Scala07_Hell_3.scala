package chapter_05

object Scala07_Hell_3 {
  def main(args: Array[String]): Unit = {

    // TODO 函數是編成語言 - 地獄版
    /*
      TODO Java:

      public void test(User u) {
          user.xxxx();
      }
      User user = new User()
      test(user)

     */
    // TODO 將函數物件作為參數使用
    def fun(): Unit = {
      println("test...")
    }

    def test(f: ()=>Unit): Unit  = {
      f()
    }

    val f = fun _
    // 不加下滑線，可以這樣寫
    // 明確告訴f1是函數物件
    val f1: ()=>Unit = fun
    test(f)
    test(f1)

  }
}
