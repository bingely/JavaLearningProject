package com.bingley.learning.basic.anotation;

public class AnnotationDemo {
    @MyAnnotataion(name = "lvr", website = "hello", revision = 1)
    public static void main(String[] args) {
        System.out.println("I am main method");



        // 定义一个注解，引用注解
        //
    }

    @SuppressWarnings({"unchecked", "deprecation"})
    @MyAnnotataion(name = "lvr", website = "hello", revision = 2)
    public void demo() {
        System.out.println("I am demo method");
    }
}
