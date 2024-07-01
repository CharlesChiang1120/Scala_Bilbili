package chapter_05

object Scala07_Function_Hell_5 {
  def main(args: Array[String]): Unit = {

    // TODO 函數式編程語言 - 地獄版

    // 如果函數的名稱不重要，那麼在傳參數時，就可以省略函數名稱
    def test(f: (Int, Int) => Int): Unit = {
      val result = f(10, 20)
      println(result)
    }

    def sum(x: Int, y: Int): Int = {
      x + y
    }

    // test(sum)

    // TODO 如果函數沒有名稱和 def, 那麼是匿名函數，一般就是作為參數使用
//    test(
//      (x: Int, y: Int) => {
//        x + y}
//    )

    // TODO 匿名函數作為參數使用時，可以採用[至簡原則]
    // 1. 匿名函數的邏輯代碼只有一行，那麼大括號可以省略
//    test(
//      (x: Int, y: Int) =>
//        x + y
//    )
    // 2. 匿名函數的參數類型如果可以推斷出來，那麼參數類型可以省略
//    test(
//      (x, y) => x + y
//    )
    // 3. 匿名函數中如果參數列表的個數只有一個，那麼小括號可以省略
    def test1(f: (String)=> Unit): Unit = {
      f("zhangsan")
    }

    def fun (name:String): Unit = {
      println(name)
    }

//    test1(
//      (name:String) => {
//        println(name)
//      }
//    )
//
//    test1(
//      (name: String) => println(name)
//    )
//
//    test1(
//      name => println(_)
//    )
    test1(println(_))

    // 4. 匿名函數中如果參數按照順序只執行一次的場合，那麼可以使用下滑線代替參數，省略參數列表和箭頭
    // test(_ - _)

    // 這裡的下滑線就表示第一個參數，依此類推，數值表示任意
    // 不能實現
//      test(
//        (x, y) => y / x
//      )

  }
}
