package com.example.demo01mybatisplus.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ValueTransfer {
    /**
     * Java 中只存在值传递
     * 对象引用方式
     * 1.使用句柄池 handler 对象实体数据，对象类型数据
     * 2.直接访问指针
     *
     * 参数类型：
     * 1.实际参数
     * 2.形式参数
     *  求值策略
     *  值调用
     *  引用调用
     *  共享对象调用
     *
     */
    public static void main(String[] args) throws InterruptedException {
    soul("hello");// 主调函数调用被调函数，函数后括号中的参数就是实际参数
    }


    private static void soul(String hello) throws InterruptedException { //函数名,函数体中的
        List<String> list = new ArrayList<>();
        while(true){
            list.add("test");
            TimeUnit.SECONDS.sleep(5);
        }
    }


}
