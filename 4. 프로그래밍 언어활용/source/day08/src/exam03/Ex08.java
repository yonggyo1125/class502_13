package exam03;

import java.lang.reflect.Field;

public class Ex08 {
    public static void main(String[] args) {
        Class cls1 = Person.class;

        Field[] fields = cls1.getFields();


        Person person = new Person();
        Class cls2 = person.getClass(); // 클래스 내부에서 사용할 목적
    }
}
