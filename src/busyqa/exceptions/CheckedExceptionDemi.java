package busyqa.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemi {
    static FileReader  fr;//null
    public static void main(String[] args) {
        System.out.println("line1");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println("line2");
        try {
              fr = new FileReader("C:\\Users\\Harsha\\Dropbox\\My PC (DESKTOP-JOKB8D4)\\Documents\\randomfile.txt"); //FileNotException
        } catch (FileNotFoundException fne) {
            System.out.println(fne);
        }
        BufferedReader bfr = new BufferedReader(fr);
        try {
            System.out.println(bfr.readLine()); //IOException
        } catch (IOException ie) {
            System.out.println(ie);
        }
        try {
            System.out.println(bfr.readLine()); //IOException
        } catch (IOException ie) {
            System.out.println(ie);
        }
        try {
            System.out.println(bfr.readLine()); //IOException
        } catch (IOException ie) {
            System.out.println(ie);
        }

    }
}
