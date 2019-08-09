package com.bingley.learning.set.sort;

import java.util.Comparator;

//按照名字的升序排列 实现接口 泛型是自定义类，里面有要排序的内容
public class NameSort implements Comparator<Student> {
    @Override         //两个参数是泛型的对象
    public int compare(Student o1, Student o2) {
        //按照姓名的升序排列，前面加个负号就按照降序排列
        return o1.getName().compareTo(o2.getName());
    }
}
