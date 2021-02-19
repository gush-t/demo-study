package com.example.workstudy.thread;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadImpl implements Runnable{

    private static final ThreadLocal<Map<String,String>> theadLocal = new ThreadLocal<Map<String, String>>();

    @Override
    public void run() {
        //while (true){
            System.out.println("impl is running");
            ConcurrentHashMap<String,String> map=  new ConcurrentHashMap<String,String>();
            map.put("impl",Thread.currentThread().getName());
            try {
                theadLocal.set(map);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //theadLocal.remove();
            System.out.println(theadLocal.get().get("impl"));
        //}
    }
}
