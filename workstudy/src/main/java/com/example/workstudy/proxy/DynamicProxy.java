package com.example.workstudy.proxy;

import com.example.workstudy.service.impl.LifeImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private LifeImpl life;

    public DynamicProxy(LifeImpl life){
        this.life = life;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass().getName());
        Object object =  method.invoke(life,args);
        return object;
    }
}
