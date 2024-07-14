public class Child extends Parent{
    public String name = "lisi";

    public void test() {
        // 字節碼中根本就沒有 super 這個變量
        // super 關鍵字只在編譯時用於關聯父類，運行時無效
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
