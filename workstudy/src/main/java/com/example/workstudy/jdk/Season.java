package com.example.workstudy.jdk;

public enum Season {
    /**
     * 枚举类型
     * 常量
     * switch
     *
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
