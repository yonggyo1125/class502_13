package exam02;

public class A { // exam02.A
    public int numA;
    int numAA; // default 접근 제어자, 동일 패키지

    private int numAAA;

    protected int numB;

    void printNum() {
        numAAA = 100;
        System.out.println(numAAA);
    }
}
