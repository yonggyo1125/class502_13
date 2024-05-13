package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test1.txt", true)) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                fos.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
