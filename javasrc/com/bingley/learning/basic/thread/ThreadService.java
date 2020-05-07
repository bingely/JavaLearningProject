package com.bingley.learning.basic.thread;

import java.util.concurrent.*;

public class ThreadService {

    public static void main(String[] args) {
        // 核心数量
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
        ScheduledExecutorService sercer = Executors.newScheduledThreadPool(3);
    }
}
