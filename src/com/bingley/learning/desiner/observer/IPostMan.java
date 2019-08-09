package com.example.desiner.observer;

/**
 * @author bingley
 * @date 2019/3/27.
 */

public interface IPostMan {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void updateObsrever();
}
