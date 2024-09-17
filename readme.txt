下滑線的作用:

1. import
   import xxx.yyy._

2. 可以聲明變量
   val _ : "zhangsan"

3. 可以將函數作為物件使用
   val obj = fun _

4. 如果匿名函數的參數按照順序只使用一次，那麼採用下滑線代替
   _ + _

5. Import 類時，使用下滑線代替 Java 中的星號
   import java.util._

6. Import 類時，用於屏蔽
   import java.util.{Date=>_, _}

7. 屬性默認初始化
   var name: String = _

8. 模式匹配時表示任意值

    case _ => {

    }

9. 泛型中下划線表示任意類型