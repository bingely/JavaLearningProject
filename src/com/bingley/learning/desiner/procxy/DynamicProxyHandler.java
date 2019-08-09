package com.example.desiner.procxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class DynamicProxyHandler implements InvocationHandler {

    private Object mObject;

    public DynamicProxyHandler(Object object) {
        mObject = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        System.out.print("before***************");
        Object result = method.invoke(mObject, objects);
        System.out.print("after***************");
        return result;
    }
}
