package com.example.workstudy.thread;

import java.util.concurrent.BlockingDeque;

public class PoolConsumer implements Runnable{

    private PoolStorage poolStorage;


    @Override
    public void run() {
        while(true){poolStorage.poll();}
    }

    public PoolConsumer(PoolStorage poolStorage) {
        this.poolStorage = poolStorage;
    }

    public PoolConsumer() {
    }
}
