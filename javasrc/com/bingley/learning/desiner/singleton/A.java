package com.bingley.learning.desiner.singleton;

/**
 * @author bingley
 * @date 2019/3/27.
 */

public class A {

    private static A mInstance = null;

    private A() {}

    public static A getInstance() {
        if (mInstance == null) {
            synchronized (A.class) {
                if (mInstance == null) {
                    mInstance = new A();
                }
            }
        }
        return mInstance;
    }
}
