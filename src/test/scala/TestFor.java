public class TestFor {
    public static void main(String[] args) {
        // 0, 1, 2, 3, 4
        for ( int i = 0; i < 5; i++) {
            if (i == 3){
                break;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
