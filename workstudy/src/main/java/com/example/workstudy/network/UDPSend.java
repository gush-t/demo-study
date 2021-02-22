package com.example.workstudy.network;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public class UDPSend {


    public static void main(String[] args) throws IOException, InterruptedException {
        //建立端口为3000的数据连接通道
        DatagramSocket datagramSocket = new DatagramSocket(3000);
        //发送数据，封装数据和目标地址
        String str = "send datagram";
        DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(StandardCharsets.UTF_8),str.length(),
                InetAddress.getByName("127.0.0.1"),3001);
        System.out.println("udpSend: I want to send info");
        datagramSocket.send(datagramPacket);
        System.out.println("udpSend: I finished send info");

        TimeUnit.SECONDS.sleep(1);
        // 接受响应数据
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes,1024);
        System.out.println("udpSend: I want to receive info");
        datagramSocket.receive(datagramPacket1);
        System.out.println("udpSend: I finished received info");

        StringBuffer receiveStr = new StringBuffer();
        receiveStr.append(new String(datagramPacket1.getData(),0,datagramPacket1.getLength())).append(" ").append(datagramPacket1.getPort());
        System.out.println("receiveInfo:" + receiveStr.toString());
    }
}
