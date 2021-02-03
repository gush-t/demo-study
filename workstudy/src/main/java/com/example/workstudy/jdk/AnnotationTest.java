package com.example.workstudy.jdk;

import com.example.workstudy.entity.People;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest {
    /**
     * 一共4个元注解
     * Target : 目标，注解用在什么地方，比如：方法，属性
     * Retention : 保留，注解报留在什么阶段，源码（Source），字节码(Class)，JVM运行时(Runtime)
     * Documented: 注解展示在Javadoc中
     * Inherited : 注解是否可以继承
     * @param args
     */

    public static void main(String[] args) {
        People people = new People();
        doAnnotation(people);
        System.out.println(people.toString());
    }

    public static void doAnnotation(Object obj){
        Class clazz =  obj.getClass();
        Field[] field = clazz.getDeclaredFields();
        for (Field f: field) {
            //检查该类是否使用了MyAnnotation注解
            if(f.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation myAnnotation = f.getAnnotation(MyAnnotation.class);
                if (myAnnotation != null) {
                    String fieldName = f.getName();
                    try {
                        //获取属性SET方法
                        Method setMethod = clazz.getDeclaredMethod("set"+
                                fieldName.substring(0,1).toUpperCase()+fieldName.substring(1),
                                String.class);
                        String value = myAnnotation.value();
                        setMethod.invoke(obj,value);
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
