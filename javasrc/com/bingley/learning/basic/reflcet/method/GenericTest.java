package com.bingley.learning.basic.reflcet.method;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public class GenericTest {
    private Map<String, Integer> score;

    public static void main(String[] args) {
        Class<GenericTest> clazz = GenericTest.class;
        try {
            Field f = clazz.getDeclaredField("score");

            Class<?> a = f.getType();
            System.out.println("score type is ====>"+a);

            Type gType = f.getGenericType();
            if (gType instanceof ParameterizedType) {
                ParameterizedType pType = (ParameterizedType) gType;
                Type rType = pType.getRawType();
                System.out.println("origin type is ====>" + rType);
                Type[] tArgs = pType.getActualTypeArguments();
                for (int i = 0; i < tArgs.length; i++) {
                    System.out.println("number--" + i + "generic type is ===》" + tArgs[i]);
                }
            } else {
                System.out.println("cannot find generic type");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
