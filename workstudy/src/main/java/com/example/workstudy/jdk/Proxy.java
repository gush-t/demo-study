package com.example.workstudy.jdk;

public class Proxy implements StaticProxy {
    /**
     * 静态代理
     * 引入第三方，代理方
     * 之前只有接口和实现类，现在中间加了一层代理对象，核心还是高内聚，低耦合
     * 但是这样增加代码耦合度，一次新增接口方法，涉及到的修改太多
     *
     */

    private  StaticProxyImpl staticProxy;

    public Proxy(){

    }
    public Proxy(StaticProxyImpl staticProxy){
        this.staticProxy = staticProxy;
    }

    @Override
    public void say() {
        System.out.println("静态代理前");
        staticProxy.say();
        System.out.println("静态代理后");
    }

    public static void main(String[] args) {
        new Proxy(new StaticProxyImpl()).say();

    }

}
