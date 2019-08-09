package com.bingley.learning.enumeration;

/**
 * @author Mr.bingley
 * @version 1.0.0
 * @des $des$
 * @since 2017/5/7.
 */


/**
 * 枚举常用的方法（具体去看jdk文档）
 * name()
   ordinal()  // 返回枚举常量的序数
   valueof(String name)此方法虽然在JDK文档中查找不到
   values() 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便。
 */
public class EnumMain {
    public static void main(String[] args) {
        System.out.println(Grade.A.toLocaleString());


        Grade a = Grade.A;
        System.out.println("a name() "+a.name());  //枚举类型对应的字符串名称

        Grade grade_B = Grade.valueOf("B");  // 通过枚举名称得到枚举对象
        System.out.println(grade_B.toLocaleString());

        System.out.println("a oridal  "+a.ordinal());

        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            System.out.println("values "+ grade);
        }
    }
}
