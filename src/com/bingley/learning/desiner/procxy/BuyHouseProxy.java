package com.example.desiner.procxy;

/**
 * 创建代理类
 * @author bingley
 * @date 2019/3/26.
 */

public class BuyHouseProxy implements BuyHouse {

   private BuyHouse buyHouse;


    public BuyHouseProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("before buy house");
        buyHouse.buyHouse();
        System.out.println("after buy hourse");
    }
}
