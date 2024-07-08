public class TestAccess {
    public static void main(String[] args)  throws Exception {

        // TODO 權限
        // 權限是什麼？權力和限制
        // 權限的應用: 用戶和平台的關係(User, Vip, Superadmin)
        // Java 權限: 以方法為例，方法的提供者和方法的調用者之間關係，決定了訪問權限
        // 1. private   : 私有的，同類
        // 2. (default) : 包權限，同類，同包
        // 3. protested : 受保護權限，同類，同包，子類
        // 4. public    : 公共的，同類，同包，子類，所有類

        // TODO 物件有什麼方法
        // clone 方法來自於 Object，所以 AAA 物件有 clone 方法
        // clone 方法的提供者: test.AAA
        // clone 方法的調用者: test.TestAccess
        AAA aaa = new AAA();

        // 這裡的點，不是調用的意思，表示從屬關係
        aaa.clone();
    }
}

class AAA {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
