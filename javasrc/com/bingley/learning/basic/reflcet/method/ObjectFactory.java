package com.bingley.learning.basic.reflcet.method;

public class ObjectFactory {


    public static Object getInstance(String name) {
        try {
            Class<?> cls = Class.forName(name);
            return cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static <T> T newInstance(Class<T> cls) {

        try {
            return cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
