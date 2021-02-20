package com.example.workstudy.thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class PoolStorage {

    private volatile  BlockingDeque blockingDeque = new LinkedBlockingDeque(10);

    public PoolStorage() {
    }

    public void push(IPhone iPhone){
        blockingDeque.push(iPhone);
    }

    public void poll(){
        blockingDeque.poll();
        System.out.println("poll:");
    }

}
