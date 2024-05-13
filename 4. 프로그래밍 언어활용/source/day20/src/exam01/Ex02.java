package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test2.txt");
            InputStreamReader isr = new InputStreamReader(fis)) {
            int ch = 0;
            while((ch = isr.read()) != -1) {
                System.out.print((char)isr.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
