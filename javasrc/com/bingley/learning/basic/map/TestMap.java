package com.bingley.learning.basic.map;

import java.util.*;

public class TestMap {

    public static void main(String[] args) {
        TestTreeMapKeyAsc();
        TestTreeMapValueAsc();

    }


    public static void TestTreeMapKeyAsc() {
        // TreeMap默认是按键的升序排列的,HashMap 为啥在key为数字时也是同样效果
        // 如果要降序，需要实现Comparator接口
        Map<String, String> treeMap1 = new TreeMap<>();
        /*treeMap.put("2","mad");
        treeMap.put("3","kitty");
        treeMap.put("1","cherry");
        treeMap.put("4","jack");*/

        TreeMap<String, String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });


        treeMap.put("mad", "2");
        treeMap.put("kitty", "3");
        treeMap.put("cherry", "1");
        treeMap.put("jack", "4");
        System.out.println(treeMap);
    }

    public static void TestTreeMapValueAsc() {
        Map<String, String> treeMap = new TreeMap();
        treeMap.put("mad", "2");
        treeMap.put("kitty", "3");
        treeMap.put("cherry", "1");
        treeMap.put("jack", "4");
        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(treeMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for(Map.Entry<String,String> mapping:list){
            System.out.println(mapping.getKey()+":"+mapping.getValue());
        }
    }
}
