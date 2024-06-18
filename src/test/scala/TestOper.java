public class TestOper {
    public static void main(String[] args) {

        // 賦值運算符 : 將等號右邊的計算結果給左邊
        int i = 0;
        int j = i++;
        System.out.println("i = " + i); // 1
        System.out.println("j = " + j); // 0
    }
}
