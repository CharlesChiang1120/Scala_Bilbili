public class TestFunction {
    public static void main(String[] args) {
        // 階層
        // 5!
        System.out.println(test(5)); // 120
    }

    // 階層
    public static int test(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * test(num-1);
        }
    }
}
