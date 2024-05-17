package exam02;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] lottos = getLotto();
        System.out.println(Arrays.toString(lottos));
    }

    public static int[] getLotto() {
        int[] lottos = new int[6];

        int cnt = 0;
        while(true) {
            int num = (int)(Math.random() * 46) + 1;

            boolean exists = false;
            for (int lotto : lottos) {
                if (lotto == num) {
                    exists = true;
                }
            }

            if (!exists) {
                lottos[cnt] = num;
                cnt++;
            }
            if (cnt == 6) {
                break;
            }
        }

        return lottos;
    }
}
