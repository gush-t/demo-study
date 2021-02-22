package com.example.workstudy.network;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPServer {
    /**
     * 实现一定的功能，并对在一个公开地址对外公开服务
     * 服务端 ServerSocket，等待客户端连接，服务端接受到客户端请求连接，会创建一个Socket和客户端的Socket建立专线连接，
     * 后续服务器和客户端对话连接
     * 客户端 连接到服务器
     *
     */

    public static void main(String[] args) throws IOException {
        //创建服务端
        ServerSocket serverSocket = new ServerSocket( 9001);
        //等待客户端连接
        Socket socket =  serverSocket.accept();
        System.out.println(" welcome to java world");
        System.out.println(serverSocket.getLocalPort());
        System.out.println( socket.getLocalAddress().getHostAddress() + " port" + socket.getPort());
        //在同一个通道中，服务端的输入流就是客户端的输出流，客户端的输入流就是服务端的输出流
        OutputStream outputStream = socket.getOutputStream();
        //输出一条数据到
        outputStream.write("server send info ".getBytes());
        InputStream inputStream = socket.getInputStream();// 等待客户端连接的输出流数据
        System.out.println("socket");
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(inputStream));
        System.out.println("server receive info: " + bufferedReader.read());
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
