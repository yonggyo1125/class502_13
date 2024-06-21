package exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Class clazz = Member.class;

        Constructor constructor = clazz.getDeclaredConstructors()[0];
        Object obj = constructor.newInstance();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            String name = method.getName();
            if (!name.startsWith("set")) {
                continue;
            }

            Class clz = method.getParameterTypes()[0];
            Object arg = null;
            if (clz == String.class) { // setter 메서드의 매개변수가 문자열
                arg = "문자열";
            } else if (clz == LocalDateTime.class) { // setter 메서드의 매개변수가 LocalDateTime
                arg = LocalDateTime.now();
            }

            method.invoke(obj, arg); // setter 메서드 호출
        }

        System.out.println(obj);
    }
}
