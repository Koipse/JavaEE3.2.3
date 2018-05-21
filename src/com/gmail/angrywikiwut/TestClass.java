package com.gmail.angrywikiwut;

public class TestClass {
    @AnnotationTest(a = 10, b = 6)
    public static int test(int a, int b){
        return a + b;

    }
}
