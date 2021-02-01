package com.example.workstudy.jdk;

import com.example.workstudy.entity.People;
import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class SystemInOut {

    /**
     * 流，单位 Bit 0或者1，电路中显示就是高电平，低电平，断路或者通路
     * 字节 byte 8Bit -128 ~ 127 InputStream  OutputStream 操作字节类数据，不需要缓存区，直接对文本
     * 本身进行操作
     * 字符 char 16Bit 0 ~ 65535 Reader Writer 使用缓存区来缓存数据，不关闭流就不会输出任何内容
     * 相互转换：围绕在中心的核心就是存储介质，存储介质中的数据一定是字节流，
     * 输入从字节转换为字符  InputStreamReader Reader的子类 输入操作将数据存储在存储介质中
     * 输出从字符转换为字节  OutputStreamWriter Writer的子类 从存储介质中读取数据
     *
     *
     *
     */

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        // 向文件中写数据，是从字符流转换为字节流，需要一个侨联，OutputStreamWriter
        try {
            OutputStreamWriter osw = new OutputStreamWriter( new FileOutputStream(file),"UTF-8");
            osw.write("向文件中写入数据");
            osw.close();
            InputStreamReader isr = new InputStreamReader( new FileInputStream(file),"UTF-8");
            char[] buf = new char[5];
            //read 方法，将数据存储到buf字符数组中，并返回对应数组的大小，如果没有数据则是-1
            int size =0;
            while((  size = isr.read(buf)) != -1){
                System.out.println(new String(buf, 0, size));
            }
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        testIO();

    }


    /**
     * 同步、异步 ，是相对于被调用饭而言的，A是调用方，B是被调用方
     * 同步：A调用B，B立即去执行A需要执行的内容，并给出返回结果
     * 异步：A调用B，B任然继续做自己正在做的事情，他只是保证一定做A需要执行的内容，完成后给出A返回结果
     *
     * 阻塞、非阻塞  是相对于调用方而言的
     * 阻塞：A调用B，A会等待B的返回结果才回进行下一步操作
     * 非阻塞：A调用B，A会继续执行其他任务，不会等待B的返回结果
     *
     * IO流中现有的3中方式
     * 1.BIO 同步阻塞 老张烧水等待
     * 2.NIO 同步非阻塞 老张烧水，轮询查看水壶状态，是否烧开
     * 3.AIO 异步非阻塞
     *
     */

    private static void testIO(){

        // BIO
        BIOTest();
        NIOTest();
    }

    private static void BIOTest(){
        //同步阻塞
        //谁是调用方，谁是被调用方
        People people  = new People("Tom",12,23,"男","北京");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("text.txt"));
            oos.writeObject(people);
            oos.close();
            //读数据
            ObjectInputStream ois = new ObjectInputStream( new FileInputStream("text.txt"));
            People p = (People) ois.readObject();
            System.out.println( p.toString() );
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {

        }
    }


    private static void NIOTest(){
        //同步非阻塞
        //非阻塞中的重点就是channel 和 buffer
        //请求 -- selector  -- channel  -- buffer

        //写数据 write
        try {
            FileOutputStream fos = new FileOutputStream("text.txt");
            FileChannel channel = fos.getChannel();
            ByteBuffer byteBuffer = Charset.forName("UTF-8").encode("谷少华一定会成功，坚信自己，自立自强");
            //字符缓存容量和限制会随着数据变化而变化，不是固定不变的
            System.out.println("容量"+byteBuffer.capacity()+";限制："+byteBuffer.limit()+"位置"+byteBuffer.position());
            int position =0 ;
            //将缓存数据写入到channel通道中，一次写完，下次继续从哪个位置写
            while ( (position=channel.write(byteBuffer)) >0){
                System.out.println(position);
            }
            channel.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //读数据 read

        try {
            FileInputStream fis = new FileInputStream("text.txt");
            FileChannel channel01 = fis.getChannel();
            ByteBuffer byteBuffer01 = ByteBuffer.allocate(30);
            System.out.println("容量"+byteBuffer01.capacity()+";限制："+byteBuffer01.limit()+"位置"+byteBuffer01.position());
            int size = 0;
            //从channel通道中读取数据到缓存中，再从缓存中将数据读取出来，并清空缓存，进行下一次读取存放数据
            while ((size = channel01.read(byteBuffer01)) >1){
            //clear()方法将读取数据位置为0，下次从开始读取
            byteBuffer01.clear();
            byte[] bytes = byteBuffer01.array();
            System.out.println(size);
            System.out.println(new String(bytes,0,size));
            System.out.println("容量"+byteBuffer01.capacity()+";限制："+byteBuffer01.limit()+"位置"+byteBuffer01.position());
            }
            channel01.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void AIOTest(){


    }



}
