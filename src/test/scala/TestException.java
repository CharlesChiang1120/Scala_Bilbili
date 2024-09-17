import chapter_09.Scala02_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {
    public static void main(String[] args) throws Exception {
//        new FileInputStream("xxxxx");
//        String s = null;
//        if ( s != null) {
//            System.out.println(s.trim());
//        }
        // 異常存在範圍的概念，所以捕捉異常也存在範圍的概念
        // 異常地捕捉順序是從上到下，所以需要將範圍小的異常先捕捉，然後再捕捉範圍大的異常
//        try {
//            int i = 0;
//            // java.lang.ArithmeticException
//            int j = 10 / i;
//        } catch ( ArithmeticException e ) {
//            e.printStackTrace();
//        } catch ( Exception e ) {
//            e.printStackTrace();
//        }
//        Scala02_Exception.test();
    }
        public static void test() throws FileNotFoundException {
            throw new FileNotFoundException("xxx");
        }
}

