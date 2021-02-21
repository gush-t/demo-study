package com.example.workstudy.thread;

import org.springframework.scheduling.Trigger;

import java.util.concurrent.*;

public class ThreadExecutor {

    /*public static void main(String[] args) {

        PoolStorage poolStorage = new PoolStorage();
        ExecutorService product =  Executors.newFixedThreadPool(2);
        PoolProduct poolProduct = new PoolProduct(poolStorage);
        for (int i = 0; i < 10; i++) {
            product.execute(poolProduct);
        }
        PoolConsumer poolConsumer = new PoolConsumer(poolStorage);
        ExecutorService consumer =  Executors.newFixedThreadPool(2);
        for (int i = 0; i < 1000; i++) {
            consumer.execute(poolConsumer);
        }

    }*/

    public static void main(String[] args) {
        ScheduleExtends scheduleExtends = new ScheduleExtends();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        //scheduledExecutorService.scheduleAtFixedRate(scheduleExtends,3,3,TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(scheduleExtends,1,3,TimeUnit.SECONDS);
    }

}
