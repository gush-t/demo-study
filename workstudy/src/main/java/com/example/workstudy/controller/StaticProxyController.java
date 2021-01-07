package com.example.workstudy.controller;

import com.example.workstudy.proxy.StaticProxy;
import com.example.workstudy.service.impl.LifeImpl;

public class StaticProxyController {

    public static void main(String[] args) {
        LifeImpl life = new LifeImpl();
        StaticProxy proxy = new StaticProxy(life);
        proxy.bath();
    }
}
