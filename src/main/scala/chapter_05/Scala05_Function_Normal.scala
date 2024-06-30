package chapter_05

object Scala05_Function_Normal {
  def main(args:Array[String]): Unit ={
    // TODO 函數式編程語言 - 普通版
    // 參數的個數
    // 函數的參數沒有限制個數，但是個數越多，傳值越麻煩，所以並不推薦使用
    def fun1(
            name1: String,
            name2: String,
            name3: String,
            name4: String,
            name5: String
            ): Unit = {
    }

    // TODO 參數個數的簡化: 可變参数，類似 Java 中參數的...
    // 在某些場景中，函数的参数可能不需要傳遞，也可能需要傳遞，設置可能需要傳遞多個，不確定
    // 可變參數因為不確定，所以底層實現時，會採用不同的數組集合來實現
    def fun2(name: String*):Unit={
      println(name)
    }
    fun2() // List()
    fun2("ABC") // ArraySeq(ABC)
    fun2("ABC", "DEF") // ArraySeq(ABC, DEF)

    // TODO 可變參數的位置: 參數列表的最後一項
    // 一個參數列表表中不可能有多個可變參數
    // 也不可以用型態來區分，就算把 password 改成數字型態，也無法區分
    // ex.(name: String*, password: Int)
    // 因為如果把 password 改成 object 的型態，這樣也無法區分 name 跟 password
    // ex.(name: String*, password: Object)
    def fun3(password: String, name: String*):Unit={
    }
    fun3("123456", "ABC", "DEF")
  }
}
