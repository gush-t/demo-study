package com.example.workstudy.thread;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class ScheduleExtends implements Runnable {


    @Override
    public void run() {
        System.out.println("Time： "+ LocalDateTime.now());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
