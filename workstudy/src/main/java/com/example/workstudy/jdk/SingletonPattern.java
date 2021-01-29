package com.example.workstudy.jdk;

public class SingletonPattern {

    private static SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern() {
    }

    public static SingletonPattern getSingletonPattern() {
        return singletonPattern;
    }
}
