public class TestOverride {
    public static void main(String[] args) {
        // TODO 方法的重寫
        // 1. 應該存在父子類關係
        // 2. 不適用在子類的場合，所以需要改變父類的功能實現
        // 3. 方法名相同，參數列表相同，異常不能超出父類的範圍(總的異常範圍)
        //    子類重寫方法的權限不能低於父類的方法
        // 4. 重寫方法後，子類的方法可以代替父類的方法使用

        // CC cc = new CC();
        // System.out.println(cc.sum()); // 20

        // 方法的重寫其實就是在同一個內存區域中存在兩個一樣的方法，該如何區分的問題
        // JVM 在調用物件的成員方法時，會遵循動態綁定機制
        // 所謂動態綁定機制，就是在方法運行時，將方法和當前運行物件的實際內存進行綁定
        // 然後調用
        // 動態綁定機制和屬性沒有任何關係，屬性在哪裡聲明在哪裡使用
         CC cc = new DD();
         System.out.println(cc.sum()); // 40

    }
}

class CC {
    public int i = 10;
    public int sum() {
        return getI() + 10;
    }
    public int getI() {
        return i;
    }
}

class DD extends CC{
    public int i = 20;
//    public int sum() {
//        return getI() + 20;
//    }
    public int getI() {
        return i;
    }
}
