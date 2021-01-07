package com.example.workstudy.proxy;

import com.example.workstudy.service.Life;
import com.example.workstudy.service.impl.LifeImpl;

public class StaticProxy implements Life {

    private LifeImpl life;

    public StaticProxy(LifeImpl life){
        this.life = life;
    }

    @Override
    public void bath() {
        System.out.println("before");
        life.bath();
    }

    @Override
    public void washHands() {
        life.washHands();
        System.out.println("after");
    }

    @Override
    public void eat() {
        System.out.println("before");
        life.eat();
        System.out.println("after");
    }
}
