package com.bingley.learning.basic.thread;

import java.util.concurrent.TimeUnit;

public class TestStopThread {

    public static class MoonRunner implements Runnable {
        private long i;

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                i++;
                System.out.println("MoonRunner--i=" + i
                );
            }
            System.out.println("stop");
        }
    }


    public static class MoonRunner2 implements Runnable {
        private long i;
        private volatile boolean on = true;

        @Override
        public void run() {
            while (on) {
                i++;
                System.out.println("MoonRunner2---i=" + i);
            }
            System.out.println("stop");
        }

        public void cacel(){
            on = false;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        // 第一种方式
        MoonRunner moonRunner = new MoonRunner();
        Thread thread = new Thread(moonRunner, "MoonRunner");
        thread.start();

        TimeUnit.MICROSECONDS.sleep(10);
        thread.interrupt();


        // 第二种方式
        MoonRunner2 moonRunner2 = new MoonRunner2();
        Thread thread2 = new Thread(moonRunner2, "MoonRunner2");
        thread2.start();

        TimeUnit.MICROSECONDS.sleep(16000);
        moonRunner2.cacel();
    }
}
