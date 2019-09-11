package com.chirvin.netty.io;

import java.net.Socket;

public class IOClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",8000);
            while (true) {
                socket.getOutputStream().write(("Hello World").getBytes());
                socket.getOutputStream().flush();
                Thread.sleep(2000);
            }
        } catch (Exception e) {
        }
    }
}
