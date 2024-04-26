package exam03;

import java.lang.annotation.Annotation;

public class Ex03 {
    public static void main(String[] args) {
        Class cls = Ex02.class;

        MyAnno anno = (MyAnno)cls.getAnnotation(MyAnno.class);
        int min = anno.min();
        int max = anno.max();

        System.out.printf("min=%d, max=%d%n", min, max);
    }
}
