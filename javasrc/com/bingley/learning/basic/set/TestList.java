package com.bingley.learning.basic.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 /**
   * 集合交集的操作
   * Author:  Mr.bingley
   * Version:
   * Date:  2017/6/15
   */
public class TestList {
    public static void main(String[] args) {
        /*List<String> strList = new ArrayList<String>();
        List<String> strList2 = new ArrayList<String>();
        for(int i = 0; i < 10; i ++) {
            strList.add("aaa>>" + i);
            strList2.add("aaa>>" + (10 - i));
        }

        //求出交集
        strList2.retainAll(strList);
        System.out.println("交集大小：" + strList2.size());

        for(int i = 0; i < strList2.size(); i++) {
            System.out.println(strList2.get(i));
        }*/


        List<TestBean> l1 = new ArrayList();
        l1.add(new TestBean("a",4));
        l1.add(new TestBean("b", 2));
        l1.add(new TestBean("c", 3));
        l1.add(new TestBean("d", 4));
        l1.add(new TestBean("e",5));

        List<TestBean> l2 = new ArrayList();
        l2.add(new TestBean("a", 4));
        l2.add(new TestBean("a", 5));

        l2.add(new TestBean("b",2));
        l2.add(new TestBean("b",3));
        l2.add(new TestBean("b",99));

        l2.add(new TestBean("bbb", 3));

        l2.removeAll(l1);  // 取l2中跟l1不同的bean
        System.out.println("差集：");
        for (int i = 0; i < l2.size(); i++) {
            System.out.print(l2.get(i).getId() +":"+l2.get(i).getTop()+ "\n");
        }
    }

    public List diff(List ls, List ls2) {
        List list = new ArrayList(Arrays.asList(new Object[ls.size()]));
        Collections.copy(list, ls);
        list.removeAll(ls2);
        return list;
    }

}
