package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis(); // 작업 시작 시간
        try (FileInputStream fis = new FileInputStream("specs.zip");
            FileOutputStream fos = new FileOutputStream("specs_copied2.zip")) {

            while(fis.available() > 0) {
                fos.write(fis.read()); // 1바이트씩 읽고 쓰기
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long etime = System.currentTimeMillis();
        System.out.printf("걸린 시간: %d%n", etime - stime);
    }
}
