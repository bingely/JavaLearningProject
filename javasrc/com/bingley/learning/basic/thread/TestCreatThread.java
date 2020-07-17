package com.bingley.learning.basic.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCreatThread {

    public static class MyTestCallable implements Callable {
        @Override
        public String call() throws Exception {
            return "hello callable";
        }
    }

    public static class TestRunnalbe implements Runnable {
        @Override
        public void run() {
            System.out.println("hello runnable");
        }
    }


    public static class TestThread extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println("Hello TestThread");
        }
    }

    public static void main(String[] args) {

        TestThread testThread = new TestThread();
        testThread.run();
        // 第二种
        TestRunnalbe testRunnalbe = new TestRunnalbe();
        Thread thread = new Thread(testRunnalbe);
        thread.start();
        // 第三种
        MyTestCallable myTestCallable = new MyTestCallable();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future submit = executorService.submit(myTestCallable);
        try {
            System.out.println(submit.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
