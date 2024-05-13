package exam01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex05 {
    public static void main(String[] args) throws IOException  {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in); // InputStream -> Reader
        char ch = (char)isr.read();
        System.out.println(ch);
    }
}
