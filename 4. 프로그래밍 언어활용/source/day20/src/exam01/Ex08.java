package exam01;

import java.io.*;

public class Ex08 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis(); // 작업 시작 시간
        try (FileInputStream fis = new FileInputStream("specs.zip");
             InputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream("specs_copied2.zip");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while(bis.available() > 0) {
                bos.write(bis.read()); // 8kb 버퍼가 다 차면 -> 비우기 -> 출력
                // 마지막 구간 8kb 버퍼는 다 차지 않을 수 도 있음
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
        long etime = System.currentTimeMillis();
        System.out.printf("걸린 시간: %d%n", etime - stime);
    }
}
