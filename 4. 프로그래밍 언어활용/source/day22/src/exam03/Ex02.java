package exam03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex02 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("book2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Book book1 = (Book)ois.readObject();
            // 새로운 Book 객체 생성  : 데이터가 입력
            System.out.println(book1);
            System.out.println(System.identityHashCode(book1));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
