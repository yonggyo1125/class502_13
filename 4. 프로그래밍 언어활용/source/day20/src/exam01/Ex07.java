package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("specs.zip");
            FileOutputStream fos = new FileOutputStream("specs_copied2.zip")) {

            while(fis.available() > 0) {
                fos.write(fis.read()); // 1바이트씩 읽고 쓰기
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
