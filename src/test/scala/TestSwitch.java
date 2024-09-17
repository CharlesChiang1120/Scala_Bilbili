public class TestSwitch {
    public static void main(String[] args) {
        int age = 10;

        // TODO 多重分支判斷
        // 會根據 case 進行數據匹配，匹配成功，執行對應的邏輯代碼
        // 如果匹配不成功，會繼續匹配下一個 case, 依此類推
        // 如果所有的 case 都不滿足，執行 default 語句

        // 如果某一個 case 匹配成功，那麼執行邏輯後，不使用 break 關鍵字，那麼後續的 case
        // 即使不滿足條件，也會執行，這個稱之為 switch 穿透現象
        // default 語句也需要增加 break
        // default 語句可以聲明在前，但是執行順序依然先判斷 case

        // 如果沒有 default 語句，程序不會發生錯誤
        switch (age) {
//            default:
//                System.out.println("其他");
//                break;
            case 10:
                System.out.println("age = 10");
                break;
            case 20:
                System.out.println("age = 20");
                break;
        }
    }
}
