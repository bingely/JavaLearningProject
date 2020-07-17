package com.bingley.learning.basic.thread.syn;


/**
 * 演示线程同步引发的问题
 *
 *
 */
public class Ticket implements Runnable {

    private int num = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
            synchronized (this){
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "-----sale-----" + num--);
                }
            }

        }
    }
}
