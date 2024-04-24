package exam04;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        // 1 ~ 43, 6개의 숫자 - 중복 X
        int cnt = 0;
        int[] lotto = new int[6];

        while(cnt < 6) {
            int num = getNumber();
            if (chkDuplicated(lotto, num)) {
                continue;
            }

            lotto[cnt] = num;
            cnt++;
        }

        System.out.println(Arrays.toString(lotto));
    }

    public static int getNumber() {
        return (int)(Math.random() * 43) + 1;
    }

    public static boolean chkDuplicated(int[] lotto, int num) {

        for (int n : lotto) {;

            if (n == num)
                return true;
        }

        return false;
    }
}
