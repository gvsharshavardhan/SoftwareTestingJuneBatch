package busyqa.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiCatchDemo {
    public static void main(String[] args) throws FileNotFoundException,IOException{

        int a = 10;
        int b = 6;
        int[] c = {2, 4, 6, 7};

        test();

//        try {
//            System.out.println(a / b);//ar
//            System.out.println(c[7]);//inoutofbound
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
//            System.out.println(ae);
//        }
    }

    public static void test() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("C:\\Users\\Harsha\\Dropbox\\My PC (DESKTOP-JOKB8D4)\\Documents\\randomfile.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
    }
}
