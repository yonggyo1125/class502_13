package exam01;

import java.io.File;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        //File file = new File("D:/test1.txt");
        //file.createNewFile();
        File dir = new File("D:/fstudy");
        File file = new File(dir, "test1.txt");

        // exists() : 파일 또는 디렉토리 존재 유무
        if (!dir.exists()) { // 디렉토리가 없는 경우
            dir.mkdir(); // 디렉토리 1개만 생성
        }

        file.createNewFile();
    }
}
