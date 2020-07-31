package com.bingley.learning.desiner;

import com.bingley.learning.desiner.adapter.object.PhoneAdapter;
import com.bingley.learning.desiner.adapter.object.Adapter;
import com.bingley.learning.desiner.adapter.object.Electric;
import com.bingley.learning.desiner.builder.Computer;
import com.bingley.learning.desiner.builder.retrofitlib.Call;
import com.bingley.learning.desiner.builder.retrofitlib.HelloService;
import com.bingley.learning.desiner.builder.retrofitlib.Retrofit;
import com.bingley.learning.desiner.chain.ConcreteHandler1;
import com.bingley.learning.desiner.chain.ConcreteHandler2;
import com.bingley.learning.desiner.chain.demo2.Director;
import com.bingley.learning.desiner.chain.demo2.GroupLeader;
import com.bingley.learning.desiner.chain.demo2.Leader;
import com.bingley.learning.desiner.chain.demo2.Manager;
import com.bingley.learning.desiner.factory.Factory;
import com.bingley.learning.desiner.factory.ProductA;
import com.bingley.learning.desiner.observer.AObserver;
import com.bingley.learning.desiner.observer.BObserver;
import com.bingley.learning.desiner.observer.PostMan;
import com.bingley.learning.desiner.procxy.BuyHouse;
import com.bingley.learning.desiner.procxy.BuyHouseImpl;
import com.bingley.learning.desiner.procxy.BuyHouseProxy;
import com.bingley.learning.desiner.procxy.DynamicProxyHandler;
import com.bingley.learning.desiner.prototype.Card;
import com.bingley.learning.desiner.singleton.A;
import com.bingley.learning.desiner.singleton.Singer;
import com.bingley.learning.desiner.stragety.BusStragety;
import com.bingley.learning.desiner.stragety.StragetyContext;

import java.lang.reflect.Proxy;
import java.util.List;

/**
   * 
   * @Author:  Mr.bingley
   * @Version:
   * @Date:  2019/4/18
   */

public class Consoler {


    public static void main(String[] args) {

        // 单例模式
        Singer singerInstance = Singer.getInstance();
        A instance = A.getInstance();

        // 构建者模式
        Computer bingley = new Computer.ComputerBuilder().name("bingley").builder();
        System.out.print(bingley.getcName());


        Retrofit retrofit = new Retrofit.RetrofitBuilder().baseUrl("hell").builder();
        HelloService helloService = retrofit.create(HelloService.class);
        Call<List<String>> bingle = helloService.listRepos("bingle");


        // 原型模式 https://www.jianshu.com/p/6d1333917ae5
        Card card1 = new Card();
        card1.setNum(9527);
        card1.setSpec(6, 7);
        System.out.println(card1.toString());
        System.out.println("----------------------");

        Card card2 = null;
        try {
            card2 = card1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(card2.toString());
        System.out.println("----------clone update value ------------");
        card1.setSpec(10, 11);
        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println("----------------------");


        // 代理模式  https://www.cnblogs.com/daniels/p/8242592.html
        // 1 静态  ---
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(new BuyHouseImpl());
        buyHouseProxy.buyHouse();
        // 2 动态代理
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
                new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHouse();


        // 责任链模式  https://www.jianshu.com/p/3b23ac02d8af
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        concreteHandler1.successor = concreteHandler2;
        concreteHandler2.successor = concreteHandler1;
        concreteHandler1.handleRequest("ConcreteHandler2");

        Leader groupLeader = new GroupLeader();
        Leader director = new Director();
        Leader manager = new Manager();
        groupLeader.nextLeader = director;
        director.nextLeader = manager;

        groupLeader.handleRequest(5000);
        groupLeader.handleRequest(9000);
        groupLeader.handleRequest(12000);
        groupLeader.handleRequest(30000);


        // 策略 如何改造下面的写法
        // 如同是一个锦囊随时可以替换，每个锦囊独立可以替换,那如何替换if else 形式
        StragetyContext trafficCalculator = new StragetyContext();
        trafficCalculator.setCalculateStragety(new BusStragety());
        int result = trafficCalculator.calculatePrice(66);
        System.out.print("\n result trafficCalulator is" + result);

        // 适配器模式
        System.out.println("---------适配器模式-------------");
        Electric electric = new Electric();
        System.out.println("defaultV：" + electric.output_220v());
        //传递一个对象给适配器
        Adapter phoneAdapter = new PhoneAdapter(electric);
        System.out.println("adapterV：" + phoneAdapter.convert_5v());
        //

        // 装饰着模式




        // 观察者模式
        AObserver aObserver = new AObserver();
        BObserver bObserver = new BObserver();
        PostMan postMan = new PostMan();
        postMan.addObserver(aObserver);
        postMan.addObserver(bObserver);
        postMan.updateObsrever();




        // 工厂模式
        new ProductA().show();
        Factory.create(ProductA.class).show();
    }


}
