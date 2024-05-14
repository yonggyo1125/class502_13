package exam01;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class Ex09 {
    public static void main(String[] args) {
        InputStream in = System.in; // 1바이트씩 터미널에서 읽기
        InputStream bis = new BufferedInputStream(in);
    }
}
