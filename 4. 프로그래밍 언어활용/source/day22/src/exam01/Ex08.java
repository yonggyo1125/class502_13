package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex08 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("book.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            Book book1 = new Book(1000, "책1", "저자1");

            oos.writeObject(book1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
