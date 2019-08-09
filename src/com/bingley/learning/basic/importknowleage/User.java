package com.bingley.learning.importknowleage;

/**
 * @author bingley
 * @date 2019/4/15.
 */

public class User {

    private String userName;
    private int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +"userName='" + userName + '\'' +", age=" + age + '}';
    }
}
