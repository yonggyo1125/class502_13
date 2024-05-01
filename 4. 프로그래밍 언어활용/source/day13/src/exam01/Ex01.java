package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        // 변경 불가 List, 추가, 수정, 삭제 X
        List<String> names = Arrays.asList("이름1", "이름2", "이름3");
        //names.remove(0);
        System.out.println(names);

        // 변경이 필요한 경우는 List의 구현 클래스의 객체 생성시 생성자 매개변수로 대입
        List<String> names2 = new ArrayList<>(names);
        names2.remove(0);
        System.out.println(names2);
    }
}
