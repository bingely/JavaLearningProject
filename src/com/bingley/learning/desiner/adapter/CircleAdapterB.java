package com.example.desiner.adapter;

/**
 * @author bingley
 * @date 2019/3/27.
 */
// 能够将IA和IB合在一起

    // 类适配器只要是通过继承源目标类来实现
public class CircleAdapterB extends A implements IB {

    @Override
    public void B() {
        //在这里做操作前，也要初始化，发现上面的类B已经写好的初始化方法，
        //也和这里要写的初始化方法一样
    }

    @Override
    public void A() {
        super.A();

    }
}
