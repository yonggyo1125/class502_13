package 다른패키지;

import 같은패키지.A;

public class B extends A {
    public void print() {
        protectedNum = 100;
        System.out.println(protectedNum);
    }
}
