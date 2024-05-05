package chapter_02

object Scala06_String {
  def main(args: Array[String]): Unit = {

    // TODO 字符串
    // Scala 中沒有字符串，使用就是 Java 字符串
    // 字符串的方法，都可在 Scala 中使用
    // val name : String = "ABC"

    // TODO 字符串的拼接問題
    val name = "zhangsan"
    val age = 30

    // println("Name : " + name + ", Age : " + age)
    // JSON 字符串 : 符合 JSON 格式的字符串
    // {"name" : "zhangsan", "age" : 30}
    println("{\"name\" : \""+name+"\", \"age\" : "+age+"}")

    // 傳值字符串拼接
    printf("name=%s\n", name)

    // 插值字符串拼接
    println(s"name=${name}")
    println(s"name=$name")
    println(s"name=${name.substring(0, 1)}")
    println(s"{\"name\" : \"${name}\", \"age\" : ${age}}")

    // 多行字符串，主要用於 SQL 和 JSON 格式字符串
    // 這裡的豎線表示頂格符
    println(
      """
        | hello
        | scala
        |""".stripMargin)

    // 想把頂格符換成 #
    println(
      """
        # hello
        # scala
        #""".stripMargin('#'))

    // 主要用於 SQL 和 JSON 格式字符串
    println(
      s"""
        | {"name" : "${name}", "age" : ${age}}
        |""".stripMargin)

    println(
      s"""
         | SELECT
         | *
         | FROM user
         | WHERE id = 1
         |""".stripMargin)
  }
}
