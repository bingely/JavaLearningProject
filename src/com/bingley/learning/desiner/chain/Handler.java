package com.example.desiner.chain;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public abstract class Handler {

    // protect
    public Handler successor;

    public abstract void handleRequest(String condition);

}
