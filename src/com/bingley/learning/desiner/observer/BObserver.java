package com.example.desiner.observer;

/**
 * @author bingley
 * @date 2019/3/27.
 */

public class BObserver implements Observer {
    @Override
    public void update() {
        System.out.print("Bovserver update");
    }
}
