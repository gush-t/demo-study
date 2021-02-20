package com.example.workstudy.thread;

import java.util.Random;
import java.util.concurrent.BlockingDeque;

public class PoolProduct implements Runnable{

    private PoolStorage poolStorage;

    @Override
    public void run() {
        int i = 0;
        Random random = new Random(10000);
        while (true){
            i++;
            IPhone iPhone = new IPhone((int) Thread.currentThread().getId(),"名字"+random.nextInt(10000));
            System.out.println("push: "+ iPhone.toString());
            poolStorage.push(iPhone);
        }
    }

    public PoolProduct(PoolStorage poolStorage) {
        this.poolStorage = poolStorage;
    }

    public PoolProduct() {
    }
}
