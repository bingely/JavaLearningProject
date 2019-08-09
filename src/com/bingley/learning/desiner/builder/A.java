package com.example.desiner.builder;

/**
 * @author bingley
 * @date 2019/3/28.
 */

public class A {

    private String name;
    private String color;


    public A(ABuilder aBuilder) {
        this.name = aBuilder.name;
    }


    public static class ABuilder{

        public String name;

        public ABuilder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 其实就是将构造方法转移到这个构造器中。
         */
        public A builder() {
            return new A(this);
        }



    }

}
