package com.example.workstudy.jdk;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy  implements MethodInterceptor {
    /**
     * Cglib 实现动态代理
     * 实现MethodInterceptor 接口中的Intercept方法
     * Cglib 通过继承的方式来实现动态代理，super,class 如果代理类用final 修饰，这不能通过Cglib实现动态代理
     *
     * 获取
     */

    // 增强类，提升类
    private Enhancer enhancer = new Enhancer();

    //代理目标对象
    private Object object;

    public CglibProxy(){

    }
    public CglibProxy(Object o){

        this.object = o;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //Preprocess
        System.out.println("Cglib : 前置处理");
        //通过代理类调用父类中的方法
        Object ob = methodProxy.invokeSuper(o,objects);
        //Postprocess
        System.out.println("Cglib : 后置处理 ");
        return ob;
    }

    //获取代理对象

    public Object getProxy(){
        //设置需要创建子类的类
        this.enhancer.setSuperclass(this.object.getClass());
        this.enhancer.setCallback(this);
        //通过字节码技术动态创建子类
        return enhancer.create();
    }
}
