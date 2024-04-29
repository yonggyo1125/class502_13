package exam04;

import java.util.LinkedList;
import java.util.Queue;

public class Ex04 {
    public static void main(String[] args) {
        Queue<Integer> items = new LinkedList<>();
        items.offer(1);
        items.offer(2);
        items.offer(3);

        System.out.println(items.poll()); // 1
        System.out.println(items.poll()); // 2
        System.out.println(items.poll()); // 3

    }
}
