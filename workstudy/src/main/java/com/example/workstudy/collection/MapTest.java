package com.example.workstudy.collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MapTest {
    /**
     * HashMap int 知道为什么取int类型了，因为和hashMap的实现结构有关系，table[] 存储的是 Node<k,v></>
     * 0.75的负载因子，资源利用和空间权衡的结果
     * hash冲突，取决于hashCode的计算方式和容量大小
     * 
     */

    /**
     * HashMap
     * @param args
     * @throws InterruptedException
     */

    public static void main(String[] args) throws InterruptedException {
        Map map = new HashMap();
        String one = new String("1");
        String two = new String();
        System.out.println(4^2);
        System.out.println(1000>>>4);
        System.out.println(49 ^ 49>>>16);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i= 0; i < 2; i++) {
            executorService.execute(()->{
                for (int j = 0; j < 10; j++) {
                    map.put(new String("i"+j), new Random().nextInt(10000) +"12");
                    //System.out.println(map.size());
                    System.out.println(map.get("i"+j));
                }
            });
        }
        System.out.println("one: "+one.hashCode());
        System.out.println("two: "+two.hashCode());
        while (true){
            System.out.println(map.size());
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
