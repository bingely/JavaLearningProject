package com.example.desiner.chain;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class ConcreteHandler2 extends Handler{

    @Override
    public void handleRequest(String condition) {
        if ("ConcreteHandler2".equals(condition)){
            System.out.println("ConcreteHandler2 handled");
            return;
        }else {
            successor.handleRequest(condition);
        }
    }
}
