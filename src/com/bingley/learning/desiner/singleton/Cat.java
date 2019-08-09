package com.bingley.learning.desiner.singleton;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class Cat {

    private Cat() {

    }

    public static Cat getInstace() {
        return CatHolder.mCat;
    }
    private static class CatHolder{
        public static Cat mCat = new Cat();
    }
}
