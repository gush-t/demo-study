package com.example.workstudy.thread;

import java.util.concurrent.*;

public class ThreadTest {

    public static void method(String[] args) throws ExecutionException, InterruptedException {
        new ThreadExtends().start();
        new ThreadExtends().start();
        new Thread(new ThreadImpl()).start();
        FutureTask futureTask =  new FutureTask<String>(new ThreadReturnImpl());
        new Thread(futureTask).start();
        System.out.println("callable:  "+futureTask.get());

        ExecutorService threadPoolExecutor =  Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            FutureTask  futureTask1 = (FutureTask) threadPoolExecutor.submit(new ThreadReturnImpl());
            System.out.println(futureTask1.get());
        }

    }

    public static void main(String[] args) {
        /*new ThreadExtends().start();
        new ThreadExtends().start();
        new ThreadExtends().start();
        new ThreadExtends().start();*/
        ExecutorService executorService =  Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new ThreadExtends());
        }
    }
}
