package com.example.workstudy.thread;

import java.util.concurrent.BlockingDeque;

public class Consumer implements  Runnable {



    private Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        try {
            storage.pop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
