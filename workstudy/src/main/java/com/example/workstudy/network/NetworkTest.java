package com.example.workstudy.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NetworkTest {

    /**
     * 网脉编程
     * 网络通信
     * TCP（Translation Controller Protocol）,面向连接，稳定传输数据
     * UDP（User Datagram Protocol）用户数据报协议，无状态，非面向连接的
     * 网脉中的层级：物理层，数据链路层，网络层，传输层，应用层
     * DatagramSocket 通讯的数据管道，send 和receive
     * DatagramPacket 数据包
     * 集装箱：封装数据
     * 数据地址：发送或者接受数据的IP+Port
     * 无状态无链接
     *
     */

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bufferedReader1.readLine());
    }

}
