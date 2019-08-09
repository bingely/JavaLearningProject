/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 Umeng, Inc
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.bingley.learning.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * 简单的服务器实现
 * 
 * @author mrsimple
 */
public class SimpleHttpServer extends Thread {

    public static void main(String[] args) {
        new SimpleHttpServer().start();
    }

    public static final int HTTP_PORT = 8000;
    ServerSocket mSocket = null;

    public SimpleHttpServer() {
        try {
            mSocket = new ServerSocket(HTTP_PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (mSocket == null) {
            throw new RuntimeException("服务器Socket初始化失败");
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("等待连接中");
                new DeliverThread(mSocket.accept()).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private class DeliverThread extends Thread{
        Socket mClientSocket;
        BufferedReader mInputStream;
        PrintStream mOutputStream;
        /**
         * 请求方法,GET、POST等
         */
        String httpMethod;
        /**
         * 子路径
         */
        String subPath;
        /**
         * 分隔符
         */
        String boundary;

        /**
         * 请求参数
         */
        Map<String, String> mParams = new HashMap<String, String>();
        // 请求headers
        Map<String, String> mHeaders = new HashMap<String, String>();
        /**
         * 是否已经解析完Header
         */
        boolean isParseHeader = false;

        public DeliverThread(Socket socket) {
            mClientSocket = socket;
        }

        @Override
        public void run() {
            try {
                mInputStream = new BufferedReader(new InputStreamReader(
                        mClientSocket.getInputStream()));
                mOutputStream = new PrintStream(mClientSocket.getOutputStream());
                parseRequest();
                handleResponse();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                IoUtils.closeQuitly(mInputStream);
                IoUtils.closeQuitly(mOutputStream);
                IoUtils.closeSocket(mClientSocket);
            }
        }
    }

    private void handleResponse() {

    }

    private void parseRequest() {

    }
}
