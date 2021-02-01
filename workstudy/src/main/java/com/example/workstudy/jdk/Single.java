package com.example.workstudy.jdk;

public enum Single {
    //单例枚举实现

    /**
     * 枚举常数可以看做是常量或者方法，都可以，直接赋值的方法，然后过去方法参数的值
     */
    INSTANCE,PEOPLE(01,"习近平");
    private int code;

    private String name;

    Single(int code,String name){
        this.code = code;
        this.name = name;
    }

    int getCode(){
        return this.code;
    }

    String getName(){
        return this.name;
    }

    Single() {

    }
}
