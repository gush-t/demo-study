package com.example.workstudy.controller;

import com.example.workstudy.proxy.DynamicProxy;
import com.example.workstudy.service.Life;
import com.example.workstudy.service.impl.LifeImpl;

import java.lang.reflect.Proxy;

public class DynamicProxyController {

    public static void main(String[] args) {
        LifeImpl life = new LifeImpl();
        DynamicProxy proxy = new DynamicProxy(life);
        Life lifeProxy = (Life) Proxy.newProxyInstance(LifeImpl.class.getClassLoader(), LifeImpl.class.getInterfaces(),proxy);
        lifeProxy.bath();
    }
}
