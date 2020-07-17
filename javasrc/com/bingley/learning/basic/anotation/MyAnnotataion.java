package com.bingley.learning.basic.anotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotataion {
    String name();
    String website() default "Hello";
    int revision() default 1;
}
