package chapter_07

import scala.io.{BufferedSource, Source}
import scala.math

object Scala12_Collection_Method_WordCount {
  def main(args: Array[String]): Unit = {

    // TODO 使用功能函數實現 WordCOunt
    //      統計一個單詞出現的次數(頻率) -> 詞頻統計
    // (Hello, 4), (World, 3), (Scala, 2), (Spark, 1)

    // TODO 思路梳理:
    //  1. 從文件中獲取數據源
    val source: BufferedSource = Source.fromFile("data/word.txt")
    // 讀取文件時，會將文件的每一行讀取出來，放置在集合中，那麼集合的泛型就是 String
    val dataList: List[String] = source.getLines().toList
    source.close()

    //  2. 判斷需要得到的結果
    //  3. 根據預想的結果，缺什麼補什麼
    //     3.1 缺少單詞，獲取單詞
    //         將每一行數據中的單詞分解(拆分)出來，採用扁平化操作
    val wordList = dataList.flatMap(
      line => {
        line.split(" ")
      }
    )

    //     3.2 缺少數量，補充數量
    // map 方法可以將數據按照指定規則轉換為其他的數據，這裡的轉換可以是類型的轉換，也可以是數值的轉換
    // A => B
    val wordToOneList = wordList.map(
      word => {
        (word,1)
      }
    )
//    println(wordToOneList)

    //  4. 統計數據前，先將數據按照規則聚合在一起
    //     將數據按照指定的規則進行分組: 相同的單詞放在一起
    // groupBy 方法會將數據集中的每一條數據加分組標記，相同標記的數據會放置在一起
    // groupBy 方法的返回結果就是分組後的 Map 集合
    //         Map 集合中的 key 就是分組的標記， value 就是相同標記的數據集合
    val wordGroup: Map[String, List[(String, Int)]] = wordToOneList.groupBy(
      kv => {
        kv._1
      }
    )
    // HashMap(Scala -> List((Scala,1), (Scala,1)), Hello -> List((Hello,1), (Hello,1), (Hello,1), (Hello,1)), Spark -> List((Spark,1)), World -> List((World,1), (World,1), (World,1)))
//    println(wordGroup)

    // 5. 將聚合後的數據統計
    // list => count
    val wordCount = wordGroup.mapValues(
      list => {
        list.size
      }
    ).toMap
    // Map(Scala -> 2, Hello -> 4, Spark -> 1, World -> 3)
//    println(wordCount)

    // 5.5 將統計的結果按照數量進行排序，取前三名
    // 分組後的結果為 Map 類型，Map 類型沒有順序，所以無法排序
    val top3 = wordCount.toList.sortBy(
      wc => {
        wc._2
      }
    )(Ordering.Int.reverse).take(3)

    // 6. 將結果打印在控制台上
    // List((Hello,4), (World,3), (Scala,2))
    println(top3)
  }
}