package com.gmail.angrywikiwut;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args)throws IllegalAccessException, InvocationTargetException {
        Class<?> someCls = TestClass.class;
        Method[] tester = someCls.getDeclaredMethods();

        for(Method m : tester){
            if(m.isAnnotationPresent(AnnotationTest.class)){
                AnnotationTest tested = m.getAnnotation(AnnotationTest.class);
                int result = (Integer) m.invoke(null,tested.a(), tested.b());
                System.out.println(result);

            }
        }
    }
}
