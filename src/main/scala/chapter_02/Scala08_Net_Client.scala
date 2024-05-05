package chapter_02

import java.io.OutputStream
import java.net.Socket

object Scala08_Net_Client {
  def main(args: Array[String]): Unit = {

    // TODO 建立服務器連接
    val server = new Socket("localhost", 9999)
    println("連接服務器成功，向服務器發送數據")
    val out: OutputStream = server.getOutputStream
    out.write(100)
    println("向服務器發送數據，100")
    out.close()
    server.close()
  }
}
