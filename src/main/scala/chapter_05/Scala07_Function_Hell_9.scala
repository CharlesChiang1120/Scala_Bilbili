
package chapter_05

object Scala07_Function_Hell_9 {
  def main(args: Array[String]): Unit = {

    // TODO 函數式編程語言 - 地獄版

    def test(f: String => Unit): Unit = {
      f("zhangsan")
    }

    def fun(name: String): Unit = {
      println("Name : " + name)
    }

//    test(fun)
    // 參數按照順序只使用一次，可以使用下滑線代替，但是不能嵌套使用
//    test(println("Name : " + _))
    // println(_)
    test(_.substring(0, 1))


    test(name => println("Name : " + name))


  }
}
