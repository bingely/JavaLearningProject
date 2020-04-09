package com.bingley.learning.basic.importknowleage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author bingley
 * @date 2019/4/15.
 *
 * 与采取悲观锁策略的synchronized不同，atomic包采用乐观锁策略去原子更新数据，并使用CAS技术具体实现
 */

public class AtomicDemo {

    private static Integer count = 0;
    synchronized public static void increment() {
        count++;
    }


    private static AtomicInteger atoCount = new AtomicInteger(0);

    public static void atoIncrement() {
        atoCount.getAndIncrement();
    }


    private static AtomicReference<User> reference = new AtomicReference<>();

    public static void main(String[] args){
        User user1 = new User("a", 1);
        reference.set(user1);
        User user2 = new User("b",2);
        User user = reference.getAndSet(user2);
        System.out.println(user);//输出User{userName='a', age=1}
        System.out.println(reference.get());//输出User{userName='b', age=2}

        // 4/18  8/30


    }






}
