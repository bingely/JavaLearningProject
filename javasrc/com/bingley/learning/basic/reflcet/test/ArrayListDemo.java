package com.bingley.learning.basic.reflcet.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author Mr.bingley
 * @version 1.0.0
 * @since 2017/5/30.
 */

/*
 * 我给你ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现呢？
 */
public class ArrayListDemo {
    public static void main(String[] args) throws NoSuchMethodException,
            SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        // 创建集合对象  (泛型是给编译器看的，在.class文件是没有的）
        ArrayList<Integer> array = new ArrayList<Integer>();

        // array.add("hello");
        // array.add(10);

        Class c = array.getClass(); // 集合ArrayList的class文件对象
        Method m = c.getMethod("add", Object.class);

        m.invoke(array, "hello"); // 调用array的add方法，传入的值是hello
        m.invoke(array, "world");
        m.invoke(array, "java");

        System.out.println(array);
    }
}
