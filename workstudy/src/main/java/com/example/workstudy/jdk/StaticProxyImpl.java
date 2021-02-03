package com.example.workstudy.jdk;

public class StaticProxyImpl implements StaticProxy{
    @Override
    public void say() {
        System.out.println("静态代理");
    }

    @Override
    public void eat() {
        System.out.println("新增接口");
    }
}
