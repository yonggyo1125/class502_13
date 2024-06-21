package exam01;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Class clazz = JoinService.class;

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("매개변수 갯수 : " + constructor.getParameterTypes().length);

            List<Object> arguments = new ArrayList<>();
            for (Class clz : constructor.getParameterTypes()) {
                if (clz == String.class) { // 문자열
                    arguments.add("문자열");
                } else if (clz == int.class) { // 기본 자료형 int
                    arguments.add(100);
                } else if (clz == long.class) { // 기본 자료형 long
                    arguments.add(200L);
                }
            }

            Object obj = arguments.isEmpty()
                            ?constructor.newInstance()
                            :
                            constructor.newInstance(arguments.toArray());

            JoinService service = (JoinService) obj;
            System.out.println(service);
        }


        /*
        Constructor c1 = constructors[0];
        Constructor c2 = constructors[1];
        Constructor c3 = constructors[1];

        JoinService s1 = (JoinService) c1.newInstance();
        JoinService s2 = (JoinService) c2.newInstance("값1", 100);
        JoinService s3 = (JoinService) c3.newInstance(new Object[] {"값2", 200, 300});

        /*
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

         */
    }
}
