package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class ProxyCalculator2 {

    /*
    @Pointcut("execution(* exam01..*(..))")
    public void publicTarget() {}
    */
    //@Around("publicTarget()")
    @Around("execution(* exam01..*(..))")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        long stime = System.nanoTime();

        try {
            Object result = joinPoint.proceed();

            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
