package com.bingley.learning.adbtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AdbTest {

    public static void main(String[] args) {
        // adb 环境路径
        String adbHome = "D:\\Program Files\\Android\\androidsdk\\platform-tools\\";
        String cmd = adbHome + "adb version";
        Process process;
        try {
            // 执行adb 命令
            process = Runtime.getRuntime().exec(cmd);
            System.out.println(InputStream2String(process.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String InputStream2String(InputStream inputStream) {
        String result = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String temp = "";
            while ((temp = br.readLine()) != null) {
                result += temp + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
