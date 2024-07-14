package chapter_06

import java.lang.reflect.Field

object Scala15_Object_Ext_1 {
  def main(args: Array[String]): Unit = {

    // TODO 物件導向編程 - 比較兩個物件
    // Java: String.class => 類型信息 => Class => 方法區
    // Scala: ClassOf[String] => 類型信息 => Class => 方法區
    val userClass: Class[User] = classOf[User]
    // userClass.getFields

    // String 類型的字符串表示不可變字符串
    // String 沒有提供任何改變其內容的方法，但是可以通過反射修改
    val name: String = " a b "

//    val stringClass: Class[String] = classOf[String]
//    // 獲取字符串底層的數組
//    val field: Field = stringClass.getDeclaredField("value")
//    field.setAccessible(true)
//    val charArray = field.get(name).asInstanceOf[Array[Char]]
//    charArray.update(2, 'c')
//    println("!"+name+"!")
  }

  class User {
    }
}


