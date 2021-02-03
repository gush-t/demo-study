package com.example.workstudy.jdk;

public class Proxy implements StaticProxy {
    /**
     * 静态代理
     * 引入第三方，代理方
     * 之前只有接口和实现类，现在中间加了一层代理对象，核心还是高内聚，低耦合
     * 但是这样增加代码耦合度，一次新增接口方法，涉及到的修改太多
     * 动态代理
     * 两种实现方式
     * 代码的动态编译：1. JDK动态代理：使用Reflect类和InvocationHandler接口来实现动态代理的能力
     * JDK动态代理的限制，代理对象必须实现一个或者多个接口，如果代理没有接口的实现类，需要使用Cglib 代理方式
     * 1.Cglib(Code Generation Library) 第三方的代码生成类库，在运行时动态生成一个子类来实现目标对象的功能扩展
     * Cglib 代理类可以坐到无侵入代理
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

    @Override
    public void eat() {

    }

    public static void main(String[] args) {
        new Proxy(new StaticProxyImpl()).say();
        //只能转换为公共接口类
        StaticProxy staticProxy = (StaticProxy) new DynamicProxy(new StaticProxyImpl()).getProxy();
        staticProxy.eat();
        //不需要接口也可以实现动态代理
        StaticProxyImpl s = (StaticProxyImpl) new CglibProxy(new StaticProxyImpl()).getProxy();
        s.eat();
    }




}
