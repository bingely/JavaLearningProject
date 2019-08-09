package com.bingley.learning.desiner.observer;

/**
 * @author bingley
 * @date 2019/3/27.
 */

public class AObserver implements Observer {
    @Override
    public void update() {
        //
        System.out.print("AObserver update");
    }
}
