package chapter_12

object Scala04_Reg {
  def main(args: Array[String]): Unit = {
    // TODO 正規表達式

    val email = "abc@gmail.com"
    val regex = "(.*)(@.*)".r

    val maskedEmail = email match {
      case regex(_, domain) => "*****" + domain
      case _ => "Invalid email format"
    }

    println(maskedEmail) // *****@gmail.com
    }
}
