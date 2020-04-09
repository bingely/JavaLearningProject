package com.bingley.learning.basic.utils;


import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Author:  Mr.bingley
 * Version:
 * Date:  2017/6/1
 */
public class BigDecimalDemo {
    public static void main(String[] args) {

        BigDecimal bd = new BigDecimal(new BigInteger("12345678"), 3);
        BigDecimal bd2 = new BigDecimal(new BigInteger("-12345678"), 3);
        BigDecimal movePointLeft = bd.movePointLeft(2);
        BigDecimal movePointLeft2 = bd2.movePointLeft(2);
        System.out.println("bd : " + bd);
        System.out.println("bd2 : " + bd2);
        System.out.println("movePointLeft : " + movePointLeft);
        System.out.println("movePointLeft2 : " + movePointLeft2);

        BigDecimal d = new BigDecimal(new BigInteger("123"), 2);
        Double d2 = new Double("333");
        System.out.println("d" + d);


        System.out.println("test" + moveNumberForValue("100",0));
    }

    public static String test(String value, int number) {
        BigDecimal d = new BigDecimal(new BigInteger(value), number);
        return d.toString();
    }

    /**
     * 向右移动几位小数
     * @param value
     * @param number 移动的位数
     * @return
     */
    public static String moveNumberForValue(String value, int number) {
        if (number < 0) {
            number = 0;
        }
        return new BigDecimal(new BigInteger(value), number).toString();
    }
}
