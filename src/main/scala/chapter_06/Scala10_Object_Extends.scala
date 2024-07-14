package chapter_06

object Scala10_Object_Extends {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 繼承
      // Scala 的繼承和 Java 是一致的:
      // 1. 存在父子類
      // 2. 主要目的是為了復用功能和屬性
      // 3. Scala 中類的繼承和 Java 的繼承是一樣的，也是單繼承，不能多繼承，因為會產生歧義
      //    這種由於多繼承所產生的歧義，稱之為[鑽石問題]
      // 4. 構造物件時，父類物件優於子類物件構建
//      val s = new Student(20)
//      val t = new Teacher()

      // 5. 如果父類的構造方法存在參數，那麼需要顯示地調用父類的構造方法並傳參數
      // 6. 構造方法存在訪問權限，可以設定為私有的，需要在參數列表(主構造函數)的前面增加 private 關鍵字
      //    如果構造方法私有化，那如何構建物件
      //    1. 輔助構造方法可以使用
      //    2. 採用伴生物件可以訪問伴生類中私有內容
      val p = Person.apply(20)
      val p1 = Person(20)

    }

  class Person private(age: Int) {
    var name: String = _
    println("person")
  }

  object Person{
    def apply(age: Int): Person = new Person(age)
  }
//  class Student(age: Int) extends Person(age) {
//    println("student")
//  }
//  class Teacher extends Person(30) {
//    println("teacher")
//  }
}


