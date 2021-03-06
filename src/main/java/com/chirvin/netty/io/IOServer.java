package com.chirvin.netty.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class IOServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8000);
        while (true) {
            try {
                // 阻塞方法获取新的连接
                Socket socket = serverSocket.accept();
                // 每个新连接都创建一个线程，负责读取数据
                new Thread(() -> {
                    try {
                        byte[] data = new byte[1024];
                        InputStream inputStream = socket.getInputStream();
                        while (true) {
                            int len;
                            // 按照字节流的方式读取数据
                            while ((len = inputStream.read(data)) != -1) {
                                System.out.println(new String(data,0,len));
                            }
                        }
                    } catch (IOException e) {

                    }
                }).start();
            } catch (IOException e) {
            }
        }
    }
}
