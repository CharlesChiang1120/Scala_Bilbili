package chapter_05

object Scala07_Hell {
  def main(args: Array[String]): Unit = {

    // TODO 函數是編成語言 - 地獄版
    /*
      Scala 語言是完全物件導向的語言，所以萬物皆物件
      Scala 語言是完全面向函數式編程語言，所以萬物皆函數

      函數也是物件，物件也是函數
     */

    // TODO 函數也是物件
    /*
      Java:
      class User {
        private String name;
      }
      User user = new User();

      Scala: 聲明一個函數，等同於聲明一個函數物件
      def test() {

       }
     */
    def test(): Unit = {

    }
    // 如果一個函數聲明時，參數列表中沒有參數，那麼調用時可以省略小括號
    println(test) // 打印 test 方法的執行結果 // ()

    // 如果不想讓函數執行，只是想訪問這個函數本身，可以採用特殊符號進行轉換
    println(test _) // chapter_05.Scala07_Hell$$$Lambda$18/0x00...

    }
}
