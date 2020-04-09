package com.bingley.learning.desiner.decorator;

/**
 * @author bingley
 * @date 2019/3/27.
 */

public class NewRoom extends Room {
    @Override
    public void fitment() {
        System.out.println("这是一间新房：装上电");
    }
}
