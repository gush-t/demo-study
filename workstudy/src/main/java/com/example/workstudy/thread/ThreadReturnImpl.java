package com.example.workstudy.thread;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadReturnImpl implements Callable<String> {
    /**
     * 实现Callable接口的两种启动方式
     * 一种是通过FutureTask
     *
     * 一种是通过Executor
     */

    private static final ThreadLocal<Map<String,String>> theadLocal = new ThreadLocal<Map<String, String>>();
    @Override
    public String call() throws Exception {

            System.out.println("return is running");
            ConcurrentHashMap<String,String> map=  new ConcurrentHashMap<String,String>();
            map.put("return",Thread.currentThread().getName());
            try {
                theadLocal.set(map);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(theadLocal.get().get("return"));
        //theadLocal.remove();
        return Thread.currentThread().getName();
    }
}
