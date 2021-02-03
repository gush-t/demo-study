package com.example.workstudy.jdk;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;

import java.io.*;

public class SerializableTest {
    /**
     * 序列化和反序列化
     *
     * 实例对象是在JVM中的堆中，想要持久的保存对象数据，需要将数据存储在存储设备中，数据库
     * 网络传输也用到，将JVM中的对象转换为字节流进行传输
     * 反序列化,将字节流转换为JVM中的对象
     * 序列化和单例关系
     * 懒汉加载模式
     * @param args
     */

    public static void main(String[] args) {
        //输入输出，源头是JVM中堆中的对象，将堆中的（实例对象）
        //write object to file
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("text.txt")));
            oos.writeObject(SingletonPattern.getSingletonPattern());
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //read object from file
        try {
            ObjectInputStream oos = new ObjectInputStream(new FileInputStream(new File("text.txt")));
            SingletonPattern singletonPattern = (SingletonPattern) oos.readObject();
            oos.close();
            System.out.println(singletonPattern.equals(SingletonPattern.getSingletonPattern()));
            System.out.println(JSON.toJSONString(singletonPattern));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
