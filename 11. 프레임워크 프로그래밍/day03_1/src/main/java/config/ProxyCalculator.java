package config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProxyCalculator {

    @Pointcut("execution(* exam01..*(..))")
    public void publicTarget() {}
}
