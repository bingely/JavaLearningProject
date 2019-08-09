package com.bingley.learning.enumeration;

/**
 * @author Mr.bingley
 * @version 1.0.0
 * @des 枚举类
 * @since 2017/5/7.
 */

// 要明白如果没有枚举的话Java是如何定义的
public enum  Grade {
    A("100~90"){
        public String toLocaleString(){
            return "优秀";
        }
    },B("89~80"){
        public String toLocaleString(){
            return "良好";
        }
    },C("79~70"){
        public String toLocaleString(){
            return "一般";
        }
    },D("69~60"){
        public String toLocaleString(){
            return "刚及格";
        }
    },E("59~0"){
        public String toLocaleString(){
            return "不及格";
        }
    };//代表着自身的一个个的实例对象

    //	字段
    private String value;//  A  100~90  B 89~80 C 79~70 D 69~60 E 59~0

    //构造函数，
    private Grade(){}           // 设置为私有的
    private Grade(String value){   // 可以给枚举实例传值
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    /**
     * 带抽象方法的枚举
     * @return
     */
    public abstract String toLocaleString();  // 定义一个抽象的方法
}
