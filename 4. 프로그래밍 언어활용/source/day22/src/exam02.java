import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class exam02 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        String[] unfinished = solution(todo_list, finished);
        System.out.println(Arrays.toString(unfinished));
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
       return IntStream.range(0, todo_list.length)
                .filter(i -> !finished[i])
               .mapToObj(i -> todo_list[i])
               .toArray(String[]::new);
    }
}
