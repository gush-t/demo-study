package com.example.workstudy.jdk;

import java.util.HashSet;
import java.util.Set;

public class CollectionsTest {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Set<Apple> set = new HashSet<>();
        set.add(apple);
        set.add(apple4);
        set.add(apple2);
        set.add(apple3);
        for (Apple apple5: set) {
            System.out.println(apple5.toString());
        }
    }
}
