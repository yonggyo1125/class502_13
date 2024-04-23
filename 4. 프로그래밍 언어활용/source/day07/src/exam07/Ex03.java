package exam07;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("b.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
