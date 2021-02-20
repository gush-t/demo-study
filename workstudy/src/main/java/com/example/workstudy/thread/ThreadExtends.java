package com.example.workstudy.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadExtends extends Thread{

    private static final ThreadLocal<Map<String,String>> theadLocal = new ThreadLocal<Map<String, String>>();

    private  volatile int ticket = 100;
    private volatile boolean flag = true;

    private String str = "synchronized";

    /**
     * 成员变量
     * 属性
     * Thread 中的start()方法，进行new一个线程
     * 调用run() 方法，在当前线程运行run(),
     */

    /*@Override
    public void run() {
        while (true){
            System.out.println("extends is running");
            ConcurrentHashMap<String,String> map=  new ConcurrentHashMap<String,String>();
            map.put("extends",Thread.currentThread().getName());
            theadLocal.set(map);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(theadLocal.get().get("extends"));
            theadLocal.remove();
        }
    }*/

    /*@Override
    public void run() {
        synchronized (str){
        while (true){
                    if (ticket > 0) {
                        ticket = ticket - 1;
                        System.out.println("sell ticket surplus:" + ticket);
                    }
                    try {
                        Thread.sleep(1);
                        Thread.yield();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }*/

    @Override
    public void run() {
        while (flag){
            System.out.println("interrupt");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println("Thread terminal");
    }

    public  void setFlag(boolean flag) {
        this.flag = flag;
    }
}
