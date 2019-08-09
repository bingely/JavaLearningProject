package com.bingley.learning.desiner.chain.demo2;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class Manager extends Leader {
    @Override
    protected void handler(int money) {
        System.out.println(money+"由Manager批准");
    }

    @Override
    protected int getLimit() {
        return 20000;
    }
}
