package com.example.workstudy.service.impl;

import com.example.workstudy.service.Life;

public class LifeImpl implements Life {



    @Override
    public void bath() {
        System.out.println("bath");
    }

    @Override
    public void washHands() {
        System.out.println("washHands");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
