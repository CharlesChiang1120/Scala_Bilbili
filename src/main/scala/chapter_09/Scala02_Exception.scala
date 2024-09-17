package chapter_09

import java.io.FileInputStream

object Scala01_Exception {
  def main(args: Array[String]): Unit = {

    // TODO 異常
    // Java 中有異常 Exception，錯誤 Error
    // Exception 是類
    // Java 中的異常分為兩大類: 編譯期異常 ＆ 運行期異常
    // 所有的異常其實都有物件，所有的物件都是在運行時構建出來的
    // 所謂的異常其實就是為了提供程序的健壯性
    // 所謂的編譯期異常其實就是根據異常的解決程度難易，提示給開發人員。也稱之為提示性異常
    // 如果提示了異常，但沒有處理(try, catch), 需要將異常拋出去, throws

    // Scala 中的異常處理和 Java 很相似，但是有區別
    // Scala 中的異常沒有分類，所以也沒有 throws 關鍵字
    new FileInputStream("xxxxx")
  }
}
