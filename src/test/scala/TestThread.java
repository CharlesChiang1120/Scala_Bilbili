public class TestThread {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();

        // TODO sleep & wait 方法的區別
        // 核心區別就在於字體不一樣
        // IDEA 方法用什麼字體是怎麼確定的？
        // sleep 方法是靜態的，屬於類，和物件無關
        t1.sleep(1000); // 休眠的線程不是t1，哪一個線程調用了sleep方法，哪一個線程休眠
        // wait 方法是成員的，屬於物件
        t2.wait(); // 等待的線程是t2

    }
}
