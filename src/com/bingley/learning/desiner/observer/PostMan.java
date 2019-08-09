package com.example.desiner.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bingley
 * @date 2019/3/27.
 */

// 将一个方法抽象成一个接口的形式
public class PostMan implements IPostMan{


    List<Observer> mObservers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        mObservers.remove(observer);
    }

    @Override
    public void updateObsrever() {
        for (Observer observer : mObservers) {
            observer.update();
        }
    }
}
