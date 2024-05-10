package exam01;

public class Ex01 {
    public static void main(String[] args) {
        // %d(정수), %f(실수), %s(문자열), %c(문자)
        /**
         * %자리수s  -> %5s     공백3ab
         * %-자리수s  -> %-5s   ab공백3
         */

        System.out.print("----");
        System.out.printf("%10s", "ab");
        System.out.println("----");

        System.out.print("----");
        System.out.printf("%10s", "ab");
        System.out.println("----");

        System.out.print("----");
        System.out.printf("%-10s", "ab");
        System.out.println("----");

        System.out.print("-----");
        System.out.printf("%05d", 100);
        System.out.println("-----");
    }
}
