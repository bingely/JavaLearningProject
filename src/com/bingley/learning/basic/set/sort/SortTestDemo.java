package com.bingley.learning.basic.set.sort;

import java.util.ArrayList;
import java.util.Collections;

/**
   * 
   * Author:  Mr.bingley
   * Version: 
   * Date:  2017/6/28
   */
public class SortTestDemo {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("1wenzhi", 18));
        list.add(new Student("3wenzhi", 19));
        list.add(new Student("2wenzhi", 33));
        list.add(new Student("66wenzhi", 10));
        list.add(new Student("4wenzhi", 18));
        System.out.println("=========排序前=======");
        for (Student student : list) {
            System.out.println(student);
        }

        // 按照年龄升序排列
        Collections.sort(list, new NameSort());
        System.out.println("=========排序后=======");

        for (Student student : list) {
            System.out.println(student);
        }
    }

}
