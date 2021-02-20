package com.example.workstudy.thread;

public class Storage {

    /**
     * 生产者，消费者，产品（仓库）
     * 3者之间的关系
     *
     */

    private volatile static IPhone[] iPhones = new IPhone[100];

    private int size = 0 ;

    public synchronized void push(IPhone iPhone) throws InterruptedException {
        while (size == iPhones.length){
            System.out.println("storage is full");
            wait();
        }
        iPhones[size++]= iPhone;
        System.out.println(Thread.currentThread().getName()+" product "+ iPhone.toString());
        notifyAll();
        System.out.println("storage is pushing");
    }

    public synchronized void pop() throws InterruptedException {
        while (size == 0 ){
            System.out.println("storage is empty");
            wait();
        }
        --size;
        IPhone iPhone = new IPhone(iPhones[size].getId(),iPhones[size].getName());
        iPhones[size] =null;
        System.out.println(Thread.currentThread().getName()+" consumer"+iPhone.toString());
        notifyAll();
    }

}
