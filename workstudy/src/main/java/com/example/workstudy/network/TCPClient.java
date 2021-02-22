package com.example.workstudy.network;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;

public class TCPClient {

    public static void main(String[] args) throws IOException {
        //建立客户端服务器
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9001);
        InputStream inputStream = socket.getInputStream();
        //同一通道中，客户端的输入流对应的服务端的输出流，客户端的输出流对应的服务端的输入流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(socket.getLocalAddress().getHostAddress()+" port"  + socket.getPort());
        System.out.println("client receive :" + bufferedReader.read());
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str = bufferedReader1.readLine();
            if (str.equalsIgnoreCase("quit")){
                break;
            }else{
                dataOutputStream.writeBytes(str+"hello world");
            }
        }
        outputStream.close();
        inputStream.close();
        socket.close();
    }

}
