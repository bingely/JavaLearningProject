package com.bingley.learning.basic.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadService {

    public static void main(String[] args) {
        ScheduledExecutorService sercer = Executors.newScheduledThreadPool(3);
    }
}
