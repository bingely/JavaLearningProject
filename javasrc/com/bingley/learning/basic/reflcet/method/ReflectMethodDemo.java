package com.bingley.learning.basic.reflcet.method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Mr.bingley
 * @version 1.0.0
 * @des 通过反射获取构造方法并使用。
 * @since 2017/5/29.
 */
public class ReflectMethodDemo {
    public static void main(String[] args) throws Exception {
        // 获取字节码文件对象
        Class c = Class.forName("com.bingley.learning.basic.reflcet.Person");
        // 获取构造方法
        // public Constructor[] getConstructors():所有公共构造方法
        // public Constructor[] getDeclaredConstructors():所有构造方法
        // Constructor[] cons = c.getDeclaredConstructors();
        // for (Constructor con : cons) {
        // System.out.println(con);
        // }
        // 获取单个构造方法
        // public Constructor<T> getConstructor(Class<?>... parameterTypes)
        // 参数表示的是：你要获取的构造方法的构造参数个数及数据类型的class字节码文件对象


        // 为啥要通过这个来生成类的实例？？？ （
        Constructor con = c.getConstructor();// 返回的是构造方法对象
        // Person p = new Person();
        // System.out.println(p);
        // public T newInstance(Object... initargs)
        // 使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
        Object obj = con.newInstance();
        System.out.println(obj);


        Method[] methods = c.getMethods();
        for (Method method :
                methods) {
            System.out.println(method.getName());
        }

        System.out.println("_____________________________________");


        Field[] fields = c.getFields();
        c.getDeclaredFields();
        for (Field field :
                fields) {
            System.out.println(field.toString());
        }


        for (Field field :
                c.getDeclaredFields()) {
            System.out.println("所有的属性"+field);
        }


       // Object newInstance = c.getConstructor().newInstance();
        // 必须是public类型才行吗
        Object newInstance = c.newInstance();
        Field field = c.getField("age");
        field.setInt(newInstance, 10);
        System.out.println("操作对象里面的值------------------》"+newInstance.toString());
    }
}
