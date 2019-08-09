package com.bingley.learning.inject;

import com.bingley.learning.inject.demo1.Jiecha;
import com.bingley.learning.inject.demo1.NoBug;

import java.lang.reflect.Method;

/**
 * @author bingley
 * @date 2019/4/15.
 * https://blog.csdn.net/briblue/article/details/73824058
 */

@TestAnnotion(id = 3, msg = "helloannotion")
public class AnotionDemo {

    // 近期有感就是学到一个东西立马去运用，不然知识停留于理论之中
    public static void main(String[] args){

        // 注解通过反射获取
        boolean annotationPresent = AnotionDemo.class.isAnnotationPresent(TestAnnotion.class);
        if (annotationPresent) {
            TestAnnotion annotation = AnotionDemo.class.getAnnotation(TestAnnotion.class);

            System.out.println("id:" + annotation.id());
            System.out.println("msg:" + annotation.msg());
        }



        // TODO Auto-generated method stub

        NoBug testobj = new NoBug();

        Class clazz = testobj.getClass();

        Method[] method = clazz.getDeclaredMethods();
        //用来记录测试产生的 log 信息
        StringBuilder log = new StringBuilder();
        // 记录异常的次数
        int errornum = 0;

        for ( Method m: method ) {
            // 只有被 @Jiecha 标注过的方法才进行测试
            if ( m.isAnnotationPresent(Jiecha.class)) {
                try {
                    m.setAccessible(true);
                    m.invoke(testobj, null);

                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    //e.printStackTrace();
                    errornum++;
                    log.append(m.getName());
                    log.append(" ");
                    log.append("has error:");
                    log.append("\n\r  caused by ");
                    //记录测试过程中，发生的异常的名称
                    log.append(e.getCause().getClass().getSimpleName());
                    log.append("\n\r");
                    //记录测试过程中，发生的异常的具体信息
                    log.append(e.getCause().getMessage());
                    log.append("\n\r");
                }
            }
        }


        log.append(clazz.getSimpleName());
        log.append(" has  ");
        log.append(errornum);
        log.append(" error.");

    }




}
