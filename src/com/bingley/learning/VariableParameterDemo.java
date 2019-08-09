package com.bingley.learning;

/**
 * 可变参数demo
 * Author:  Mr.bingley
 * Version:
 * Date:  2017/5/7
 */

/**
 * 总结 ：a 可变参数就当做是数组即可。
          b 一个方法的参数列表中，只能有一个可变参数，且必须放在最后。
 */
public class VariableParameterDemo {

    /**
     * 计算任意数量的整数的和
     * @param args
     * @return
     */
    public static int sum(int... args) {   //可变参数就当做数组来用
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }

   /* public static int sum(int s[]) {   // 与上面的写法一样
        return 22;
    }*/

    public static String aa(String s2, String... s1) {  //一个方法的参数列表中，只能有一个可变参数，且必须放在最后。
        return "hello";
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(new int[]{1, 2}));
    }

}
