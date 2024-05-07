package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex09 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "이이름", 80),
                new Student(1, "김이름", 60),
                new Student(1, "박이름", 55),

                new Student(2, "이이름", 100),
                new Student(2, "김이름", 90),
                new Student(2, "박이름", 30),

                new Student(3, "이이름", 60),
                new Student(3, "김이름", 90),
                new Student(3, "박이름", 50)
        };

        Map<Boolean, List<Student>> data = Arrays.stream(students)
                .collect(Collectors.partitioningBy(s -> s.getScore() >= 70));

        List<Student> students1 = data.get(true); // 70점 이상인 학생 목록
        students1.forEach(System.out::println);
    }
}
