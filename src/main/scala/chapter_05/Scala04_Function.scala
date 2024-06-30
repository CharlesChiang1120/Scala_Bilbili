package chapter_05

object Scala04_Function {
  def main(args: Array[String]): Unit = {

    // TODO 函數式編程語言
    // 函數的應用，說得簡單點就是聲明和使用
    // 函數其實就是功能的封裝，就意味著功能已經按照特定的規則封裝好了，所以重點在如何調用

//    def headerUpper(s: String): String = {
//      return s.substring(0, 1).toUpperCase() + s.substring(1)
//    }
//
//    val newString: String = headerUpper("lisi")
//    println(newString)

    // TODO 函數式編程側重點是: 函數名，輸入參數，返回結果
    // TODO 函數聲明
    // 1. 無參，無返回值
    def fun1(): Unit = {
      println("fun1...")
    }

    // 調用函數的時候，需要指名函數的名稱以及傳遞的參數
    // 如果參數列表中沒有聲明任何的參數，那個調用時參數列表的小括號可以省略
    // fun1()
    // fun1

    // 2. 無參，有返回值
    def fun2(): String = {
      return "Zhangsan"
    }
    // 函數如果存在返回值，那麼一般會接收返回值
    // val result2 = fun2()
    // println(result2)

    // 3. 有參，無返回值
    def fun3(name: String): Unit = {
      println("Name : " + name)
    }

    // fun3("zhangsan")
    // 如果函數的參數只有一個時，也不能省略小括號，方法可以省略作為運算符使用
    // fun3 "zhangsan"

    // 4. 有參，有返回值
    def fun4(name: String) : String = {
      return "Name : " + name
    }

    // val name = fun4("lisi")
    // println(name)

    // 5. 多參，無返回值
    def fun5(name: String, age: Int): Unit = {
      println("Name : " + name + "Age : " + age)
    }

    // 函數調用時，傳參的值應該和參數一一匹配
    // 類型要匹配，個數要匹配，順序要匹配
    // fun5("zhangsan", 20)

    // 6. 多參，有返回值
    def fun6(name: String, age: Int): String = {
      return s"Name : ${name},  Age : ${age}"
    }

    val result6 = fun6("lisi", 20)
    println(result6)


    }
}
