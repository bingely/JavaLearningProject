package com.example.desiner.chain.demo2;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public abstract class Leader {

    public Leader nextLeader;

    public final void handleRequest(int money) {
        if (money <= getLimit()) {
            handler(money);
        } else {
            if (nextLeader != null) {
                nextLeader.handleRequest(money);
            } else {
                System.out.print(money + "nobody can do it");
            }
        }
    }

    protected abstract void handler(int money);

    protected abstract int getLimit();


}
