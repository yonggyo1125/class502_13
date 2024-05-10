package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt")) {
            byte[] buffer = new byte[5];
            while(fis.available() > 0) {
                int ch = fis.read(buffer);
                // ch -> 읽어온 바이트수
               // System.out.println(ch);
                for (int i = 0; i < ch; i++) {
                    System.out.print((char)buffer[i]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
