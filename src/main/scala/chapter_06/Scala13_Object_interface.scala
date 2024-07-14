package chapter_06

import scala.math.Ordering.CachedReverse

object Scala13_Object_interface {
    def main(args: Array[String]): Unit = {

      // TODO 物件導向編程 - 街口
      // interface 在 Java 中表示接口
      // 什麼是接口？
      // Scala 中沒有接口的概念
      // Scala 可以將多個物件中相同的特徵從物件中抽離出來，形成一個獨立的語法結構
      // 稱之為特質，如果一個物件符合這個特徵(特質)，那麼可以將特質混入到這個物件

      // 向類中混入特質，有2種方式
      // 1. 如果存在父類，那麼採用 with
      // 2. 如果沒有父類，那麼可以直接採用 extends 來混入
      //    如果需要混入多個特質，那麼第一個採用 extends，後面都採用 with
      val cat = new Cat()
      cat.run()

      // TODO 特質的本質是接口，編譯後的字節碼就是 interface
    }
  // 特質
  trait Run {
    def run(): Unit
  }

  class Cat extends Run {
    override def run(): Unit = {
      println("cat run....")
    }
  }
  class Person {

  }
  class User extends Person with Run {
    override def run(): Unit = {
      println("user run...")
    }
  }
}


