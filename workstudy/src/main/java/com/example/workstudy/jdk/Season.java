package com.example.workstudy.jdk;

public enum Season {
    /**
     *
     * Season 反编译后 final 不可修改，不可继承
     * static final 常量，初始化将值赋值，然后调用获取
     *
     * 枚举类型
     * 常量
     * switch
     * 枚举是线程安全和序列化
     * 线程安全是因为初始化铜鼓classloader 中的loadClass方法，这个方法加锁了
     * 单例使用枚举最简单
     *
     */
    SPRING(1),SUMMER(2),AUTUMN(3),WINTER(4);


    private int code;
    Season(int i) {
        this.code = i;
    }

    int getCode(){
        return this.code;
    }
}
