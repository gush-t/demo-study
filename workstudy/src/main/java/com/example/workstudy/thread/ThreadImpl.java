package com.example.workstudy.thread;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class ThreadImpl implements Runnable{

    private  volatile boolean flag = false;

    private CountDownLatch countDownLatch;




    private static final ThreadLocal<Map<String,String>> theadLocal = new ThreadLocal<Map<String, String>>();

    public ThreadImpl(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public ThreadImpl() {
    }

    /*@Override
    public void run() {
        //while (flag){
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
    }*/

    @Override
    public void run() {
        if(Math.random()>0.5){
            throw new RuntimeException("Translation is exception");
        }
        System.out.println(Thread.currentThread().getName()+"Translation is end");
        countDownLatch.countDown();
    }
    /**
     * 线程池
     * corePoolSize
     * maxPoolSize
     * keepAliveTime
     * TimeUtils
     * BlockedQueue
     * RejectedExecutionHandler
     * Executors
     * newSingle
     * newFixed
     * newCached
     * newWorkStealing
     * newScheduled
     *
     */
}
