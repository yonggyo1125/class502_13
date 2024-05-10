package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt")) {
            int ch = fis.read(); // 1바이트
            System.out.println((char)ch);

            ch = fis.read(); // 1바이트
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch); // E

            ch = fis.read(); // -1 : 파일을 전부 다 읽음
            System.out.println(ch);
            System.out.println((char)ch);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
