package chapter_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Scala01_Generic_Java {
    public static void main(String[] args) {
        // TODO Java 中的泛型
        // TODO 1. 泛型和類型的區別
        // List, ArrayList 稱之為類型，用於描述外部數據的類型
        // String 稱之為泛型，用於約束內部數據的類型
        // 類型和泛型不是一個層次上的東西
//        List<String> strList = new ArrayList<String>();
//        Message<String> message = new Message<String>();
//        final String content = message.content;

        // TODO 2. 泛型的聲明方式
        // 泛型用於約束內部數據的類型，所以需要從外部傳遞到類的內部
        // 所以有時將泛型稱之為類型參數
        // 如果參數沒有傳遞，沒有傳遞泛型。為了保證程序的健壯性，不會發生錯誤，會採用通用類型
//        Message message1 = new Message();
//        final Object content1 = message1.content;

        // TODO 3. 泛型用於進行內部數據類型的約束，在編譯時有效，運行時無效
        // 這個操作也稱之為[泛型擦除]

        // TODO 4. 泛型的應用時機，定義泛型後，什麼時候起作用
        // 4.1. 泛型定義後，才會起作用，不會對之前的代碼起作用
        // 4.2. 泛型在約束類型，意味著使用到了類型才會出現錯誤，否則不會出現錯誤
//        List list = new ArrayList();
//        list.add(new Emp());
//
//        List<User> userList = list;
//        for (User user: userList) {
//            System.out.println(userList);
//        }

        // TODO 5. 泛型和多態無關
//        List<Object> list = new ArrayList<Object>();
//        test(list);

        // TODO 6. 泛型不可變
//        Message<UserX> userMessage1 = new Message<UserX>();
//        Message<UserX> userMessage2 = new Message<Parent>(); (x)
//        Message<UserX> userMessage3 = new Message<Child>(); (x)

        // TODO 7. 如果泛型變化比較小，那麼應用面比較窄，所以泛型可以擴大範圍
        //         使用過程中，泛型存在上限和下限的概念
        // 使用數據的時候，如果類型查找的過程是往父類查找，表示使用通用性牆的類型
        // 這個查找的過程會存在下限的概念
        // TODO 下限一班應用於生產者對象

        Producer<UserX> producer = new Producer<UserX>();
        producer.produce(new Message<UserX>());
        producer.produce(new Message<Parent>());
//        producer.produce(new Message<Child>());

        // 使用數據的時候，如果類型查找的過程是往子類查找，表示使用功能不丟失
        // 這個查找的過程會存在上限的概念
        // TODO 上限一班應用於消費者對象
        Consumer<UserX> consumer = new Consumer<UserX>();
        final Message<? extends  UserX> consume = consumer.consume();
        final UserX content = consume.content;

    }
    public static void test(Collection<Object> list) {
        System.out.println(list);
    }
}

class Consumer<T> {
    // 上限，類型往下找
    public Message<? extends T> consume() {
        return null;
    }
}
class Producer<T> {
    // 下限，類型往上找
    public void produce(Message<? super T> message) {

    }
}
class Parent {

}

class UserX extends Parent {

}

class Child extends UserX{

}
