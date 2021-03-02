package com.example.workstudy.pattern.decorate;

public class DecorateTest {

    /**
     * 装饰者模式，遵循开闭原则，对原有的类不做改动，只是通过新增接口来时装饰他
     * @param args
     */

    public static void main(String[] args) {
        Man man = new ManDecorate();
        System.out.println(man.getDescription());
        Women women = new WomenDecorate();
        System.out.println(women.getDescription());
    }
}
