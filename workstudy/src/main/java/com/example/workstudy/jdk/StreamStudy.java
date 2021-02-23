package com.example.workstudy.jdk;

import com.example.workstudy.entity.People;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamStudy {


    /*
    * Stream  流 lambda
    *
    * lambda 表达式中最基本的4个函数接口
    * 需要for循环和Stream 结合来处理数据consumer supplier predicate function
    * Stream 可以将处理的集合数据看作一种流，在流的过程中，通过Stream API对流中的元素进行操作
    * 比如：筛选，排序，聚合
    * 主要分为两类操作：1.中间操作：每次中间操作都返回新的流，可以进行多次中间操作 ；
    * 2.终端操作：对流进行聚合操作，只能进行一次，产生新的集合或者值
    *
    * */
    public static void streamTest(){

        /**
         * collection
         * 线性结构和key-value
         * 操作，增删改查 ,遍历
         * add,remove set get
         * ArrayList 查询
         *
         * LinkedList 删除和新增优势，数据量比较大，并且操作频繁
         *
         * Set TreeSet  有序不可重复 ； HashSet  无序不可重复； HashLinkedSet 元素新增顺序 不可重复
         *
         * Queue
         *
         */
        List<People> list = new ArrayList<>();
        list.add(new People("Tom01",12,1300,"男","北京"));
        list.add(new People("Tom02",100,2003,"男","太原"));
        list.add(new People("Tom03",21,1003,"女","上海"));
        list.add(new People("Tom04",32,45000,"男","北京"));
        list.add(new People("Tom05",45,9000,"女","西安"));
        list.add(new People("Tom06",36,8000,"男","深圳"));
        list.add(new People("Tom07",56,6700,"女","北京"));

        // 将集合转换为流
        Stream<People> stream =  list.stream();
        Optional<People> people = stream.filter(x -> x.getAge() >50).findFirst();
        stream.filter(x -> x.getSalary() >5000);
        System.out.println(people.orElseGet((Supplier<? extends People>) new People()));

        /**
         * set 数据结构
         *  add 新增 remove 删除 遍历 iterator/foreach
         *  TreeSet 是基于TreeMap 中的keySet实现的，底层使用的数据结构是红黑树，平衡二叉查找树
         *  左右子树的高度差不会超过最短子树的一倍 并且TreeSet是有序的，compareTo comparable 接口 自身比较
         *  能力
         *
         *  HashSet 是基于HashMap 中的keySet实现的，底层使用的hashtable
         */
        Set<People> set = new HashSet<>();
        for (People people01: set) {

        }
        set.iterator();

        /**
         * 队列，queue  FIFO 先进先出 模式 新增和删除就OK 队列末尾新增元素 队列首部删除元素
         * operation    offer 新增 只会抛出空指针异常
         *  poll 修剪 取出队列首部元素，并进行移除
         *  peek 窥，看 取出队列首部元素，不进行元素删除
         *
         *  遍历 iterator / foreach
         *
         */
        ArrayBlockingQueue<People> queue = new ArrayBlockingQueue(1);
        queue.add(new People());
        queue.offer(new People());
        for (People people02: queue) {

        }
        queue.iterator();

        /**
         * map key -value
         * HashMap key value 都可以为空
         * TreeMap key 不可以为空，为空宝空指针异常，value可以为空
         * LinkedHashMap key, value 都可以为空，应为他继承了hashMap类，put方法使用的是hashMap类中的方法
         * 操作
         *
         */
        Map<String , People> map  = new HashMap<>();
        map.put("s",new People());

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(null,null);


    }

    public static void main(String[] args) {
        streamTest();
        Season[] seasons =  Season.values();
        System.out.println(Season.SPRING.getCode());
        for (Season s: seasons) {
            System.out.println(s.name());
            System.out.println(s.getCode());
        }
        Single single = Single.PEOPLE;
        System.out.println(single.getCode()+"  "+single.getName());
    }







}
