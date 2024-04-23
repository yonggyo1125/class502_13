package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")) {
            AutoCloseable auto = fis;

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
