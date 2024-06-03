package chapter_01

/*
  package : 包，等同於 Java 中的 package
  object  : 聲明物件(單例)
            Scala 語言是一個完全物件導向的語言，但是 Java 中的靜態語法不是物件導向的
            Scala 語言沒有靜態語法， Java 語言的靜態操作在 Scala 中該如何使用？
            Scala 採用新的關鍵字 object 來模擬靜態語法，可以透過物件名稱來實踐靜態操作
            如果使用 object 關鍵字聲明一個對象，那麼在編譯時同時也會編譯出對應的 class 文件
            object 關鍵字聲明的物件的類型和當前編譯後的 class 文件的類型不一樣，多一個$
            Scala01_Hello_World.class
            Scala01_Hello_World$.class

  Scala01_Hello_World : 單例物件的名稱，同時也是類名

  def : Scala 語言中聲明方法的關鍵字

  main : Scala 語言程式的入口方法

  (...) : 小括號表示參數列表，可以有參數，也可以沒有參數，如果有參數，使用逗號隔開

  args: Array[String] : 方法參數
                        Java  => Sting[] arg
                                 Java 語言是一個強類型的語言，在編譯時就需要明確類型，所以類型很重要，既然很重要，就把它放在前面
                                 但開發時，類型並不是那麼重要

                        Scala => arg: String[]
                                 Scala 語言是基於 Java 語言開發的，所以也是強類型語言
                                 作者認為參數名稱更重要，因為開發時使用參數名稱比較多，為了方便記憶和使用，所以將名稱放置在前，類型放置在後
                                 為了方便使用，將參數名稱和參數類型使用：分隔開

  Array[String] : 表示參數類型
                  Scala 是一個完全物件導向的語言，所以數組他也是一個物件，也有自己的類型 : Array
                  Scala 語言中的[]中的 String 表示泛型

  def main : Unit
             Scala 語言中方法的聲明也符合 Scala 的規則
             方法名 (參數列表) : 方法類型
             Scala 是一個完全物件導向的語言
             方法的返回值也是物件，也應該有相對應的類型
             Java 中有一個 void，表示沒有返回值
             但是沒有返回值，本身也代表一個返回，也需要有類型 : Unit

   = : 賦值
       將代碼塊邏輯賦值給方法名

   {} : 方法體

   System.out.println("Hello World") : Java 代碼
                                       Java 語言可以在 Scala 語言中使用
                                       Scala 也提供了簡化的代碼操作

    代碼沒有；結尾 : Scala 語言中認為一行代碼最好完成一段邏輯，不要多個邏輯操作在一行完成，會比較亂
                  如果一行代碼代表一段邏輯，那就不需要；來區分不同的邏輯代碼，所以；可以省略，但是在編譯時會自動添加
                  如果非要在一行代碼寫多個邏輯，那；就不可以省略
                  println("Hello Scala"); println("Hello Java")
*/

  object Scala01_Hello_World {
      def main(args: Array[String]): Unit = {
        System.out.println("Hello World")
        println("Hello Scala")
      }
    }
