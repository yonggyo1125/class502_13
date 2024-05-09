package exam04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex01 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");

        } catch (FileNotFoundException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("항상 실행!");
        }
    }
}
