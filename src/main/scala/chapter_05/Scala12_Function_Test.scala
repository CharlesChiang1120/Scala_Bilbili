
package chapter_05

object Scala12_Function_Test {
  def main(args: Array[String]): Unit = {

    // TODO 將簡化版本的函數式編程代碼恢復成完整代碼
//    test(10, 20, _+_) // 30
//    test(10, 20, () => {_ + _})
//    test(10, 20, (x, y) => {x + y})
//    test(10, 20, (x: Int, y: Int) => {x + y})
    def fun(x: Int, y: Int): Int = {
      x + y
    }
    def test(x : Int, y: Int, f: (Int, Int) => Int): Int  ={
      f(x, y)
    }
    println(test(10, 20 , fun))

//    test1(_.substring(0, 1))
    def fun1(name: String): String = {
      name.substring(0, 1)
    }
    def test1 (f: String => String): String = {
      f("zhangsan")
    }
    println(test1(fun1))

//    test2(_ * 2)
    def func2(x: Int): Int = {
        x*2
    }
    def test2(f : Int => Int): Int = {
      f(10)
    }
    println(test2(func2))

    // TODO Scala 中字符串也有乘法的能力(重複後拼接)
    val name = "zhangsan"
    val newName = name * 2
    println(newName)

    // 使用一個 for loop 來實現九層妖塔

    // TODO 控制抽象可以實現自定義語法
    // 自定義 while loop
//    while( 條件表達式 ) {
//      循環體
//    }

    def mywhile(cond: => Boolean)(op: => Unit): Unit = {
      if (cond) {
        op
        mywhile(cond)(op)
      }
    }
    val age = 30
    mywhile(age == 30) {
      println("age = 30")
    }
  }
}
