package chapter_02

import java.io.InputStream
import java.net.{ServerSocket, Socket}

object Scala08_Net_Server {
  def main(args: Array[String]): Unit = {

    // TODO 創建服務器
    // 網絡通訊中沒有辦法傳輸物件，數字這樣的內容
    // 可以在網絡中傳遞字節碼，那麼可以將物件轉換為字節碼，這個過程稱之為序列化
    // 將字節碼轉換成物件，則稱之為反序列化
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
