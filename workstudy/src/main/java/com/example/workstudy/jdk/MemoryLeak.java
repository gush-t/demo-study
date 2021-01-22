package com.example.workstudy.jdk;

import java.util.ArrayList;

public class MemoryLeak {

    /**
     * 内存溢出
     * Java 垃圾自动回收机制
     * GC Roots 到对象的引用链存在，不进行回收，不存在回收，用图论说法就是不可达
     * 1.静态字段内存泄漏，静态字段的生命周期和应用程序的生命周期一致
     * 2.equals 和hashmap方法实现不当，或者未实现，进行hashmap.put 操作相同对象不应该新增占用内存
     * 3.资源关闭，比如数据库连接，输入输出流，会话对象
     * 4.ThreadLocal是使用不当，造成memory leak
     */

    private static ArrayList<String> list = new ArrayList<>();

    public void populateList(){
        for (int i = 0; i < 1000000; i++) {
            list.add( "hand");
        }
    }

    public static void main(String[] args) {
        System.out.println("12");
        new MemoryLeak().populateList();
        System.out.println("13");
    }

}
