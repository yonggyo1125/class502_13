package exam02;

import java.util.Arrays;
import java.util.Comparator;

public class Ex12 {
    public static void main(String[] args) {
        int[] nums = { 33, 10, 5, 1, 3, 88, 100, 10};
        int[] nums2 = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(nums2));
                        // Stream<Integer>
        int[] nums3 = Arrays.stream(nums).boxed()
                        .sorted(Comparator.reverseOrder())
                        .mapToInt(x -> x)
                        .toArray();
        System.out.println(Arrays.toString(nums3));
    }
}
