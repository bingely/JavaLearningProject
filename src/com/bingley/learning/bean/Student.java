package com.bingley.learning.bean;

/**
 * Created by SAM on 2017/6/6.
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

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
    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
