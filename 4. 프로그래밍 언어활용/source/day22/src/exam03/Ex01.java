package exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("book2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Book book1 = new Book(1000, "책1", "저자1");
            oos.writeObject(book1);
            System.out.println(System.identityHashCode(book1));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
