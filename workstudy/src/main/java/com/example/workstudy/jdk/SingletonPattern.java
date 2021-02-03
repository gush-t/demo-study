package com.example.workstudy.jdk;

import java.io.Serializable;

public class SingletonPattern implements Serializable {

    /**
     * 单例模式：JVM模式中只有过一个实例对象，比如一个党只有一个主席
     * 懒汉模式
     * 饿汉模式
     *
     *
     */
    //这个就是饿汉模式，不管是否调用直接创建实例对象，占用堆空间,在初始化时已经创建，不存在同步问题
    private static SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern() {
    }

    public static SingletonPattern getSingletonPattern() {
        return singletonPattern;
    }

    public Object readResolve(){
        return singletonPattern;
    }

   /* //懒汉模式，可能存在同步问题，只有在调用时才进行创建实例对象
    private static volatile SingletonPattern singletonPattern;

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance(){
        if (singletonPattern == null){
            synchronized (SingletonPattern.class){
                if (singletonPattern ==null){
                    singletonPattern = new SingletonPattern();
                }
            }
        }
        return singletonPattern;
    }*/


}
