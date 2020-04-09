package com.bingley.learning.basic.io;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节流读取中文可能出现的小问题：
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象
        FileInputStream fis = new FileInputStream("a.txt");

        // 读取数据(读字母的话是没问题，如果是读中文的话，会出现乱码情况，但是读在文件中是没有问题的？？）
        // int by = 0;
        // while ((by = fis.read()) != -1) {           // 每次读一个字符
        //      System.out.print((char) by);         // int --> char
        // }

        byte[] bys = new byte[1024];                            //但是如果读写到1023的话还是有问题。  ----这个是怎么出现的？？？？
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        // 释放资源
        fis.close();
    }

    public void read() throws IOException {
        FileInputStream fis = new FileInputStream("a.text");
        byte[] bytes = new byte[1024];

        int len = 0;
        while ((len = fis.read(bytes)) == -1) {

        }
    }
}
