package chapter_02

import java.io.InputStream
import java.net.{ServerSocket, Socket}

object Scala08_Net_Server {
  def main(args: Array[String]): Unit = {

    // TODO 創建服務器
    val server = new ServerSocket(9999)
    println("服務器啟動成功，等待客戶端的連結…")
    val client : Socket = server.accept()
    val in: InputStream = client.getInputStream
    val result: Int = in.read()
    println("獲取客戶端發送數據，" + result)
    in.close()
    client.close()
    server.close()
  }
}
