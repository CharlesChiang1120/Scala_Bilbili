package chapter_04

object Scala02_If {
  def main(args: Array[String]): Unit = {
    // TODO 分支流程
    // 語法上使用 if 進行流程的分支處理(判斷)
    // if 關鍵字可以獨立使用，稱之為單分支
    val age = 40
    // if (age == 30) {
    // println("30 years old")
    // }
    // println("Not 30 years old")
    // if 關鍵字也可以和 else 聯合使用，稱之為雙分支
    // if (age == 30) {
    // println("30 years old")
    // } else {
    // println("Not 30 years old")
    // }
    // if 關鍵字也可以和elseif、else 聯合使用，稱之為多分支
    if (age < 16) {
      println("少年")
    } else if (age >= 16 && age < 30) {
      println("青年")
    } else if (age >= 30 && age < 45) {
      println("壯年")
    } else if (age >= 45 && age < 60) {
      println("中年")
    } else {
      println("老年")
    }
  }
}
