package com.bingley.learning.basic.generic;

import java.util.ArrayList;

public class GenericDemo {

    public static void main(String[] args) {
        // 泛型类
        Container<String, String> container = new Container("a", "b");
        System.out.println(container.getK());

        // 类型擦除
        Class c1 = new ArrayList<Integer>().getClass();
        Class c2 = new ArrayList<String>().getClass();

        System.out.println(c1 == c2);
    }
}
