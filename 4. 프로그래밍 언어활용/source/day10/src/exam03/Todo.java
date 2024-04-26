package exam03;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Todos.class)
public @interface Todo {
    String value();
}
