package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
    public static void main(String[] args) {
        // throw new FileNotFoundException(...)
        try {
            FileInputStream fis = new FileInputStream("a.txt");

        } catch (FileNotFoundException e) {
            System.out.println("예외 발생!");
        }
    }
}
