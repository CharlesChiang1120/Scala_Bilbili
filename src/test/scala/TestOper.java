public class TestOper {
    public static void main(String[] args) {

        // 賦值運算符 : 將等號右邊的計算結果給左邊
        int i = 0;
        // int j = i++;
        // ++放置在變量的後面，先賦值再加一，如果放置在前面，先加一，再賦值
        // ++運算不是原子性運算，所以會有多步操作，多個步驟間會存在臨時計算結果
        // 計算過程中應該存在臨時變量
        i = i++; // _tmp = i = 0; i = 0 + 1 = 1; i = _tmp = 0
        System.out.println("i = " + i); // 1
        // System.out.println("j = " + j); // 0
    }
}
