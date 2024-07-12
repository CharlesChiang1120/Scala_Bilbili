public class TestOverload {
    public static void main(String[] args) {
        // 方法的重載
        // 1. 方法名稱相同
        // 2. 方法的參數列表不相同(個數，類型，順序)
//        AA aa = new AA();
//        test(aa); // aa

//        BB bb = new BB();
//        test(bb); // bb

        // 查找方法，以類型為基礎進行查找，如過指定類型不存在，會擴大類型的範圍繼續查找
        // 父類範圍 > 子類範圍
        // 類型是 AA
        AA aa = new BB();
        test(aa); // aaaa
    }
    public static void test(AA aa) {
        System.out.println("aaaa");
    }
    public static void test(BB bb) {
        System.out.println("bbbb");
    }

}

class AA {

}
class BB extends AA{

}
