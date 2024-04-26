package exam03;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE, METHOD, FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    int min() default 10; // min 설정 항목, 기본값 10
    int max() default 100; // max 설정 항목, 기본값 100
    String[] names() default {"이름1"};
    String value();
}
