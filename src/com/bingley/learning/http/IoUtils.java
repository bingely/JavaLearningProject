package com.bingley.learning.http;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;

/**
 * @author Mr.bingley
 * @version 1.0.0
 * @des $des$
 * @since 2017/1/28.
 */
public class IoUtils {
    public static void closeQuitly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeSocket(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
