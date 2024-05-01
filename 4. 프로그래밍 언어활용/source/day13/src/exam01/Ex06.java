package exam01;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        String[] fruits1 = {"사과", "오렌지", "망고", "멜론"};
        String[] fruits2 = {"사과", "오렌지", "바나나", "포도"};

        int pos = Arrays.mismatch(fruits1, fruits2); // 동일한 경우 -1
        System.out.println(pos);
    }
}
