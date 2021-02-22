package com.example.workstudy.network;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class UDPReceive {

    public static void main(String[] args) throws IOException {
        //创建数据连接通道
        DatagramSocket datagramSocket = new DatagramSocket(3001);
        //创建数据的数据包
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,1024);
        System.out.println("udpReceive: I start to receive info");
        datagramSocket.receive(datagramPacket);
        System.out.println("udpReceive: I finished receive info");

        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));

        //发送信息，建立传输数据的数据包，包含封装数据和目的地址（IP+Port）
        String str = "udpReceive send info";
        DatagramPacket datagramPacket1 = new DatagramPacket(str.getBytes(StandardCharsets.UTF_8),str.length(),
                InetAddress.getByName("127.0.0.1"),datagramPacket.getPort());
        System.out.println("udpReceive: I start send info");
        datagramSocket.send(datagramPacket1);
        System.out.println("udpReceive: I finished send info");
    }
}
