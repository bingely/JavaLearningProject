package com.bingley.learning.basic.anotation;

import java.lang.reflect.Method;

// 基于反射技术解析注解
//
public class AnnotationParser {
    public static void main(String[] args) throws ClassNotFoundException {
        String clazz = "com.bingley.learning.basic.anotation.AnnotationDemo";
        /*Method[] demoMethod = AnnotationParser.class.getClassLoader().loadClass(clazz).getMethods();
        for (Method method : demoMethod) {
            if (method.isAnnotationPresent(MyAnnotataion.class)) {
                MyAnnotataion annotationInfo = method.getAnnotation(MyAnnotataion.class);
                System.out.println("method: " + method);
                System.out.println("name= " + annotationInfo.name() + " , website= " + annotationInfo.website() + " , revision= " + annotationInfo.revision());
            }
        }*/


        Method[] methods = AnnotationParser.class.getClassLoader().loadClass(clazz).getMethods();
        for (Method method :
                methods) {
            if (method.isAnnotationPresent(MyAnnotataion.class)) {
                MyAnnotataion annotation = method.getAnnotation(MyAnnotataion.class);
                System.out.println("method" + method);
                System.out.println("name="+annotation.name()+", website"+annotation.website()+", revision="+annotation.revision());
            }
        }
    }
}
