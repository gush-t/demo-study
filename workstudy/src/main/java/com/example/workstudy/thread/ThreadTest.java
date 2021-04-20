package com.example.workstudy.thread;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;

public class ThreadTest {
    /**
     * Java中线程的状态
     * new ,runnable,running,block,terminal
     * sleep
     * join 等待一个线程结束
     * wait/notify,notifyALL
     * interrupt 中断 向一个线程发送中断信号，线程就收到信号会触发interruptException(中断异常，可接触阻塞)，
     * 并进行下一步处理
     *
     * @param args
     * @throws ExecutionException
     * @throws InterruptedException
     */

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

    public static void method2(String[] args) {
        /*new ThreadExtends().start();
        new ThreadExtends().start();
        new ThreadExtends().start();
        new ThreadExtends().start();*/
        ExecutorService executorService =  Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new ThreadExtends());
        }
    }

    /**
     * 生产者消费者问题测试
     * 生产者不断生产产品，当产品满了以后，生产者停止生产产品
     * 消费者不断消费产品，当产品为空以后，消费者停止消费产品
     * 多线程生产和消费，产品（需要单例）
     */

    public static void method3(String[] args) throws InterruptedException {
        Storage storage = new Storage();
        Storage storage2 = new Storage();

        ExecutorService executorServiceProduct =  Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorServiceProduct.execute(new Product(storage));
        }
        Thread.sleep(3000);
        ExecutorService executorServiceConsumer =  Executors.newFixedThreadPool(100);
        for (int i = 0; i < 101; i++) {
            executorServiceConsumer.execute(new Consumer(storage2));
        }
    }

    public static void method4(String[] args) throws InterruptedException {
       ThreadExtends thread =  new ThreadExtends();
       thread.start();
       Thread.sleep(1000);
       //thread.setFlag(false);
    }

    public static void method5(String[] args) {
        int i =10;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i);
    }



    public static void method6(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        ThreadImpl thread = new ThreadImpl(countDownLatch);
        for (int i = 0; i < 11; i++) {
            new Thread(thread).start();
        }
        /*for (int i = 0; i < 100; i++) {
            Executors.newFixedThreadPool(3).execute(thread);
        }*/
        countDownLatch.await(10,TimeUnit.SECONDS);
        System.out.println(countDownLatch.getCount());
        System.out.println("countDownLatch execute end");
    }

    /**
     * 生产和消费者
     */

    /*public static void main(String[] args) {
        LinkedBlockingDeque<IPhone> blockingDeque = new LinkedBlockingDeque<>(10);
        ExecutorService product = Executors.newFixedThreadPool(3);
        ExecutorService consumer = Executors.newFixedThreadPool(3);


    }*/
    public static void main(String[] args) {
        String a = "123";
        String b = "123";
        System.out.println(a== b);
        StringBuffer stringBuffer = new StringBuffer("123");
        modify(stringBuffer);
        System.out.println(stringBuffer.toString());
        HashMap hashMap = new HashMap<String,String>();
        hashMap.put("key","value");

        Iterator<Map.Entry<String,String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getKey()+" ");
        }
    }

    private static void modify(StringBuffer stringBuffer) {
        stringBuffer.append(" modify");
    }

}
