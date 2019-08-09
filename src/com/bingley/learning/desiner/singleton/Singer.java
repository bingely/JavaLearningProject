package com.bingley.learning.desiner.singleton;

/**
 * 优点保证单一性，线程安全性，对象初始化延迟性
 * @author bingley
 * @date 2019/3/26.
 */

public class Singer {

    private Singer() {
    }

    public static Singer getInstance() {
        return SingerHolder.singer;
    }

    private static class SingerHolder {
        private static Singer singer = new Singer();
    }
}
