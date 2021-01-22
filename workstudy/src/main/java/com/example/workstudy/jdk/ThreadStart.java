package com.example.workstudy.jdk;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadStart {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread test01 = new ThreadTest01();
        Thread test02 = new Thread(new ThreadTest02());
        FutureTask<ResultObject>  task = new FutureTask(new ThreadTest03());
        Thread test03 = new Thread(task);
        test01.start();
        test02.start();
        test03.start();
        ResultObject resultObject =  task.get();
        System.out.println(resultObject.getThreadName());
        System.out.println(resultObject.getResult().get("start"));
    }

}
