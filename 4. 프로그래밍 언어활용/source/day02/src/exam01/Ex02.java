package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int n1 = 10; // 스택 영역
        int n2 = 20;
        int r = add(n1, n2);
        //System.out.println(r);
    }

    static int add(int n1, int n2) {  // 함수 지역
        int result = n1 + n2;

        return result;
    }
}
