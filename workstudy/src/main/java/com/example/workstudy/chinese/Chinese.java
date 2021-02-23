package com.example.workstudy.chinese;

public enum Chinese {
    //壹亿贰仟叁佰肆拾伍万陆仟柒佰捌拾玖元整
    ZERO("零"),
    ONE("壹"),
    TWO("贰"),
    THREE("叁"),
    FOUR("肆"),
    FIVE("伍"),
    SIX("陆"),
    SEVEN("柒"),
    EIGHT("捌"),
    NIGHT("玖"),
    TEN("拾"),
    HUNDRED("佰"),
    THOUSAND("仟"),
    MYRIAD("万"),
    YI("亿");

    private String chineseNumber;

    Chinese(String chineseNumber) {
        this.chineseNumber = chineseNumber;
    }

    public String getChineseNumber() {
        return chineseNumber;
    }
}
