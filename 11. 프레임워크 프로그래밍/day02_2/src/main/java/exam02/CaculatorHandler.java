package exam02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CaculatorHandler implements InvocationHandler {
    /**
     *
     * @param method : 호출한 메서드의 정보
     *                 동적 메서드 호출 method.invoke(...)
     *
     *        args : 메서드 호출시 넘겨준 값(인수)
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(method);
        System.out.println(Arrays.toString(args));

        return null;
    }
}
