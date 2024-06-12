package exam03;

import exam01.Controller;
import exam01.GetMapping;
import exam01.PostMapping;
import exam02.MemberController;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args) {
        Class<MemberController> cls = MemberController.class;
        Annotation[] annotations = cls.getAnnotations();


        for (Annotation anno : annotations) {
           if (anno instanceof Controller) {
               Constructor[] cons = cls.getDeclaredConstructors();
               try {
                  Object obj = cons[0].newInstance();
                  Method[] methods = obj.getClass().getDeclaredMethods();
                  for(Method method : methods) {
                      for (Annotation manno : method.getAnnotations()) {
                          if (manno instanceof GetMapping) {
                              Object r = method.invoke(obj);
                              if (r instanceof String) {
                                  String view = (String)r;
                                  System.out.println(view);
                              }
                          } else if (manno instanceof PostMapping) {
                              Object r = method.invoke(obj);
                              System.out.println(r);
                          }

                      }
                  }
               } catch (Exception e) {

               }
           }
        }

    }
}
