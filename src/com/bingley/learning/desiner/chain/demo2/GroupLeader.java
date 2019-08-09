package com.example.desiner.chain.demo2;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class GroupLeader extends Leader {
    @Override
    protected void handler(int money) {
        System.out.println(money+"由GroupLeader批准");
    }

    @Override
    protected int getLimit() {
        return 5000;
    }
}
