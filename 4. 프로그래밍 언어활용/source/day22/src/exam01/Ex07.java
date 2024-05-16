package exam01;

import java.io.File;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/fstudy/sub1/sub2/sub3/test1.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        // D:/fstudy/test1.txt
        File file2 = new File("D:/fstudy/sub1/sub2/sub3/../../../test1.txt");
        String absolutePath2 = file2.getAbsolutePath();
        System.out.println(absolutePath2);
        String canonicalPath = file2.getCanonicalPath();
        System.out.println(canonicalPath); // D:/fstudy/test1.txt

        System.out.println("getName() : " + file.getName());
        System.out.println("getPath() : " + file.getPath());

    }
}
