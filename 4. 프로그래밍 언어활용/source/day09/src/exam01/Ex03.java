package exam01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data.txt"));

        int total = 0;
        while(sc.hasNextInt()) {
            int num = sc.nextInt();
            total += num;
        }
        System.out.println(total);
    }
}
