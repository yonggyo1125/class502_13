package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            HashMap<String, Object> data = new HashMap<>();

            Book book1 = new Book(1000, "책1", "저자1");
            Book book2 = new Book(1001, "책2", "저자2");

            List<Book> books = Arrays.asList(
              new Book(1002, "책3", "저자3"),
              new Book(1003, "책4", "저자4")
            );

            data.put("book1", book1);
            data.put("book2", book2);
            data.put("books", books);
            data.put("str", "안녕하세요.");

            oos.writeObject(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
