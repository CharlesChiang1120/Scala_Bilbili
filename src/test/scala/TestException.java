import java.io.FileInputStream;

public class TestException {
    public static void main(String[] args) throws Exception{
         new FileInputStream("xxxxx");
        String s = null;
        if ( s != null) {
            System.out.println(s.trim());
        }
    }
}
