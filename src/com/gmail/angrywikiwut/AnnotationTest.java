package com.gmail.angrywikiwut;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AnnotationTest {
    int a();
    int b();
}
