package com.example.workstudy.jdk;

import java.util.List;

public class Generics {
    /**
     * 泛型
     * Java 中的泛型檫除
     * 字节码文件不存在泛型类，只有普通类和普通方法，合适的地方设置类型检查和类型转换方法
     * 字节码文件中清楚类型信息 List<Integer></> List<String></> 类实际是一样的，强制类型转换
     * 限定通配符 泛型类型必须使用限定内的类型来进行初始化，否则会报编译错误
     * 上界 extends <? extends T></>  类型必须是T或者是T的子类
     * 下界 super <? super T></> 类型必须是T或者T的父类
     * 非限定通配符 T
     * 泛型的应用场景，在数据存取元素使用下界super，获取元素使用上界 extends
     *
     *
     */
    //private static List list;
    //限制通配符 最后可以转化的类型 转换上界，转换下界
    // 上界 ： 子类可以转换为父类，进行获取
    public static void testExtendsGenerics(List<? extends Fruit> list){
        //上界不可以进行添加操作，只可以进行获取操作
        //list.add(new Fruit());
        list.get(0);

    }

    public  static void testSuperGenerics(List<? super Fruit> list){
        //添加操作，可以添加T类型及其子类
         list.add(new Apple());
         list.get(1); // 不清楚上界是啥，只能是Object 超类

    }

}
