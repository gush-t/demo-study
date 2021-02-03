package com.example.workstudy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    /**
     * 使用JDK动态代理的步骤
     * 调用方
     * 被调用方
     * 调用处理类
     */

    //代理目标对象
    private Object object;

    public  DynamicProxy(){};

    public DynamicProxy(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Preprocess
        System.out.println("动态代理前：");
        Object result = method.invoke(object,args);
        //Postprocess
        System.out.println("动态代理后：");
        return result;
    }

    //获取代理对象
    //通过代理类来实现新建代理实例， 构造参数：类加载，接口，对应的类 ，
    public Object getProxy(){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                object.getClass().getInterfaces(),this);
    }




}
