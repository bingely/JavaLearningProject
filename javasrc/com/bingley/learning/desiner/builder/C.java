package com.bingley.learning.desiner.builder;

public class C {

    private String name;
    private int age;

    private C(CBuilder cbuidler) {
        this.name = cbuidler.name;
        this.age = cbuidler.age;
    }

    public static class CBuilder {
        private String name;
        private int age;

        public CBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public CBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public C builer() {
            return new C(this);
        }
    }
}
