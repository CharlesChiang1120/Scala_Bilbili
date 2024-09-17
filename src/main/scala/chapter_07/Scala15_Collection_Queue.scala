package chapter_07

import scala.collection.mutable

object Scala15_Collection_Queue {
  def main(args: Array[String]): Unit = {

    // TODO 集合 - Queue

    val que = new mutable.Queue[String]()

    que.enqueue("a", "b", "c")
    val que1 : mutable.Queue[String] = que += "d"
    println(que eq que1)

    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())
  }
}