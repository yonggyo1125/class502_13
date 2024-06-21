package exam01;

import java.lang.reflect.Constructor;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Class clazz = JoinService.class;

        Constructor[] constructors = clazz.getDeclaredConstructors();
        Constructor c1 = constructors[0];
        Constructor c2 = constructors[1];
        Constructor c3 = constructors[1];

        JoinService s1 = (JoinService) c1.newInstance();
        JoinService s2 = (JoinService) c2.newInstance("값1", 100);
        JoinService s3 = (JoinService) c3.newInstance(new Object[] {"값2", 200});

        /*
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

         */
    }
}
