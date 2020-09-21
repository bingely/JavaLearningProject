package com.bingley.learning.desiner.singleton;

public class C {
    private C() {

    }

    public static C getInstance(){
        return CHolder.instacce;
    }

    public static class CHolder{
        static C instacce = new C();

    }
}
