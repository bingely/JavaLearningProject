package com.bingley.learning.basic.thread.syn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Alipay {

    private double[] accounts;

    private Lock alipaylock;

    public Alipay(int n, double money) {
        accounts = new double[n];
        alipaylock = new ReentrantLock();
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = money;
        }
    }
}
