package com.bingley.learning.basic.thread;

import java.util.PriorityQueue;

/**
 * 阻塞队列
 * @author bingley
 * @date 2020/6/17.
 */
class TestBlockQueueMain {
    private int queueSize = 10;
    private PriorityQueue<Integer> queue = new PriorityQueue<>(queueSize);

    public static void main(String[] args) {
        TestBlockQueueMain testBlockQueueMain = new TestBlockQueueMain();

        Producer producer = testBlockQueueMain.new Producer();
        Consmer consmer = testBlockQueueMain.new Consmer();
        producer.start();
        consmer.start();
    }

    class Consmer extends Thread {
        @Override
        public void run() {
            super.run();

            while (true) {
                synchronized (queue) {
                    while (queue.size() == 0) {
                        try {

                            System.out.println("队列空，等待数据");
                            queue.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    queue.poll();
                    queue.notify();
                }
            }
        }
    }


    class Producer extends Thread {
        @Override
        public void run() {
            super.run();
            while (true) {
                synchronized (queue) {
                    while (queue.size() == queueSize) {
                        try {

                            System.out.println("队列满，等待有空余数据");
                            queue.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    queue.offer(1);
                    queue.notify();
                }
            }
        }
    }
}
