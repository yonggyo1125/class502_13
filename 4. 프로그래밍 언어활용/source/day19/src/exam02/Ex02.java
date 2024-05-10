package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("test1.txt")) {
            int ch = 0;
            while((ch = fis.read()) != -1) {
                System.out.print((char)ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
