package chapter_07

object Scala01_Collection {

  def main(args: Array[String]): Unit = {

    // TODO 集合 - Java
    // Java 集合主要分為三大類
    // 1. List: 存儲有序，數據可重複
    //    ArrayList & LinkedList
    // 2. Set: 存儲無序，數據不可重複
    //    HashSet & TreeSet
    // 3. Map: 儲存 KV 鍵值對，Key 是不能重複的，Value 是可以重複的，存儲無序的
    //    HashMap & Hashtable & TreeMap
    // Java 是一個物件導向的語言，所以學習集合的時候，更側重數據之間的關係，以及數據結構之間的關係
    // Scala 是一個函數式導向的語言，所以學習集合的時候，更側重集合本身的功能
    // Scala 集合主要也分為三大類:
    // 1. Seq: 存儲有序，數據可重複
    // 2. Set: 存儲無序，數據不可重複
    // 3. Map: 存儲無序，儲存 KV 鍵值對，Key 是不能重複的，Value 是可以重複的
    // ***********************************************************
    // TODO String & StringBuilder
    // String 不可變字符串，因為類沒有提供改變其內容的方法，如果有，是創建新的字符串
    // StringBuilder 可變字符串，很多方法就是改變其自身的內容
    // ***********************************************************
    // Scala 中的集合也分兩大類
    // 不可變集合 ＆ 可變集合
    // 原始數據: 處理數據時，一般要從數據源獲取數據，但是數據源的數據一般不能被改變的
    //         如果必須要改變，也是創建新的數據
  }
}
