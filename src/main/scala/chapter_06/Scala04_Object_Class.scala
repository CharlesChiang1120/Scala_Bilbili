package chapter_06

// 伴生類
class Scala04_Object_Class {

}

// 伴生物件
object Scala04_Object_Class {
    def main(args: Array[String]): Unit = {
      // TODO 物件導向編程

      // TODO 類
      // Java :
      //   public class User {
      //   }
      //   1. 一個源碼文件中，類可以聲明多個，但是公共類只能有一個，而且和源碼文件名稱相同
      //   2. 抽取物件的相同的內容(模板)
      //   3. 使用 Class 聲明類

      // Scala 和 Java 的 Class 語法大同小異
      //   1. Scala 源碼中所有聲明的類都可以是公共的
      //   2. 使用 Object 關鍵字也可以聲明類，但是他同時也會產生另外一個物件的類
      //      主要目的是為了模擬靜態語法
      // TODO 物件名稱(類名).方法
      // 使用 object 關鍵字可以編譯成兩個類文件，這兩個類文件之間有關係
      // 一般情況下，將 Java 中的成員方法和屬性聲明在 object 聲明類中
      // 一般情況下，將 Java 中的靜態方法和屬性聲明在 object 聲明另外一個類($)中
      // TODO 將 object 聲明的類稱之為伴生類，將 object 聲明的物件稱之為伴生物件
      // 伴生類和伴生物件可以同時出現在一個源碼文件中
      // IDEA 工具會動態識別伴生類和伴生物件(圖標)
    }
}


