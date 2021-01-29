package com.example.workstudy.jdk;

public class ReflectTest {

    /**
     * 程序能够在运行期间获取自身的信息，只要给定类的名字就可以获取到该类的注解，方法，属性，注释
     * 编译后的字节码文件加载到JVM中，会为创建唯一的Class对象
     * 编码-编译-运行
     * 反射和工厂模式实现了Spring中的IOC 控制反转（invocation of controller）
     * 反射机制的作用
     * 1.在运行时判断一个对象是否属于该类
     * 2.在运行时获取一个类的属性，方法，构造函数
     * 3.在运行时获取类的对象
     *
     * Spring IOC 通过对象的创建通过反射和工厂模式来实现newInstance();
     * 字节码文件在JVM中的加载机制是双亲委派 parents delegation mode
     * 源码，*.java  -> 字节码文件 *.class --> JVM运行加载
     * 类加载器分为4个级别：Bootstrap classloader 加载JVM中bin下的jar文件
     * Extension classloader 加载JVM中bin/ext目录下的扩展jar文件
     * Application classloader 加载应用中classpath下的类文件
     * user classloader 用户自定义类加载器，加载classpath指定路径下的文件
     * parents delegation mode 为什么要使用这种模式
     * 1.避免重复加载：来一个类加载请求，不会立即加载，而是请求父加载器是否已经加载过了，一层一层向上请求，直到
     * 请求到bootstrap classloader 没有加载过，才会在application classloader 中加载
     * 2.更加安全：JVM中的类不会被替换
     *
     * loaderClass first 检查这个类是否已经被加载过，如果没有，父类加载，父类也没有那就是启动类加载器查找，如果还没有，执行findClass
     *
     *
     */

    public void reflectTest(){


    }

     interface Fruit{
       void eat();
    }

    static class Apple implements Fruit{

        @Override
        public void eat() {
            System.out.println("Apple");
        }
    }
    static class Orange implements Fruit{

        @Override
        public void eat() {
            System.out.println("Orange");
        }
    }

     static class Factory {
        public static  Fruit getFruit(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
            Fruit fruit  =null;
            fruit= (Fruit) Class.forName(className).newInstance();
            return fruit;
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Fruit fruit = Factory.getFruit("ReflectTest.Orange");
    }



}
