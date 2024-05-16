package exam01;

import java.io.File;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) throws IOException {
        File tmpFile = File.createTempFile("tmp", ".log", new File("D:/fstudy"));
    }
}
