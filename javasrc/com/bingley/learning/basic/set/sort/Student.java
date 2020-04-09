package com.bingley.learning.basic.set.sort;

/**
 * Created by SAM on 2017/6/28.
 */
public class Student {
    //创建两个基本属性
    String name = "";
    int age = 0;

    //从写构造方法用来传递数据
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    //从写toString方法，方便显示
    @Override
    public String toString() {
        return name + " " + age;
    }

    //基本属性的get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
