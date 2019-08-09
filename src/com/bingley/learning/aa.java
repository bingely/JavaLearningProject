package com.bingley.learning;

import java.text.DecimalFormat;

/**
 * 这个想证明就是 字符==int
 */
public class aa {
    public final static DecimalFormat double_df3 = new DecimalFormat("#0.##");//格式化设置  ,防止显示科学计数法
    public static void main(String[] args) {
        // 这个demo想说的是 字符就是int
        char a1 = '2';
        //char ch1 = (char) (num1 + 48);
        int b = 'B';
        System.out.println("ch1 = " + b);  // 将char类型数字8转换为int类型数字8

        double d = 19;

        System.out.println(double_df3.format(d)+"");
    }
}
