package com.bingley.learning.desiner.chain.demo2;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class Director extends Leader {
    @Override
    protected void handler(int money) {
        System.out.println(money+"由Director批准");
    }

    @Override
    protected int getLimit() {
        return 10000;
    }
}
