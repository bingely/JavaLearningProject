package com.bingley.learning.desiner.builder.retrofitlib;

import javafx.application.Platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Retrofit {
    private String url;
    private int age;

    public Retrofit(RetrofitBuilder personBuilder) {
        this.url = personBuilder.url;
    }

    public static class RetrofitBuilder {

        private String url;

        public RetrofitBuilder baseUrl(String name) {
            this.url = name;
            return this;
        }

        public Retrofit builder() {
            return new Retrofit(this);
        }
    }


    public <T> T create(final Class<T> service) {

        Object proxyInstance = Proxy.newProxyInstance(service.getClassLoader(), new Class<?>[]{service}, new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
               return null;
            }
        });


        return (T) proxyInstance;
    }
}
