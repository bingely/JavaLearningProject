package com.bingley.learning;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

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

        String rule = "/^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[~!@#$%^&*])[\\da-zA-Z~!@#$%^&*]{8}$/";
        String rule2 = "/^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*,\\.])[0-9a-zA-Z!@#$%^&*,\\.]{8,12}$/";
        String rule3 = "^(?=.*?[a-z])[\\w~!@&$%^*\\(\\)_#]{8,25}$";

        String PW_PATTERN = "^(?![A-Za-z]+$)(?![A-Z\\d]+$)(?![A-Z\\W]+$)(?![a-z\\d]+$)(?![a-z\\W]+$)(?![\\d\\W]+$)\\S{8,20}$";


        boolean matches = Pattern.matches(PW_PATTERN, "12345678s?,");
        System.out.println(matches+"");


        // 用户昵称
         String USER_NICK_PATTERN = "^[\\u4E00-\\u9FA5A-Za-z0-9-_]+$";
        boolean matches1 = Pattern.matches(USER_NICK_PATTERN, "^1");
        System.out.println(matches1+"用户昵称");
    }
}
