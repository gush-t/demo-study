package com.example.workstudy.thread;

import java.util.Random;

public class Product implements Runnable{

    private Storage storage ;

    public Product(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        //初始生产产品
        int i  =0;
        Random random = new Random();
        while (i<10){
            i++;
            IPhone iPhone = new IPhone((int) Thread.currentThread().getId(),"名字"+random.nextInt(12));
            try {
                storage.push(iPhone);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
