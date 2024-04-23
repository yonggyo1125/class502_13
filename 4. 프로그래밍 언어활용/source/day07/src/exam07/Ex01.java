package exam07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //BufferedInputStream bis = null;
        try {
            fis = new FileInputStream("b.txt");

            System.out.println("파일 읽기 처리...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {}
            }
        }
    }
}
