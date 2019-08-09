package com.bingley.learning.desiner.chain;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class ConcreteHandler1 extends Handler{


   // public Handler successor;

    @Override
    public void handleRequest(String condition) {
        if ("ConcreteHandler1".equals(condition)){
            System.out.println("\nConcreteHandler1 handled");
            return;
        }else {
            successor.handleRequest(condition);
        }
    }
}
