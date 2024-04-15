package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums = new int[4]; // int형 변수를 4개 생성, 순차자료구조 구현
        // nums[0], nums[1], nums[2], nums[3]
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        for (int i = 0; i <= 3; i++) {
            System.out.println(nums[i]); // 0, 1, 2, 3
        }

        /*
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

         */
    }
}
