package com.bingley.learning.basic.generic;

public class Demo {
    // 泛型方法
    // 修饰词 <T,S>  返回值类型 方法名（形参列表）
    // 就是在平常的方法体，加入了泛型的内容
    public <T> T fun(T t) {
        return t;
    }
}
