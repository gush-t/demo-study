package com.example.workstudy.chinese;

import com.sun.el.stream.Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class ChineseChange {

    public static void main(String[] args) {
        String str = "100000000005";
        StringBuffer stringBuffer = new StringBuffer();
        if(str.length()>5){
            String strBefore = str.substring(0,str.length()-5);
            stringBuffer.append(changeNumberBefore(strBefore));
            String strAfter = str.substring(str.length()-5);
            stringBuffer.append(changeNumberAfter(strAfter));
        }else {
            stringBuffer.append(changeNumber(str));
        }
        String strChinese =  formatter(stringBuffer.toString());
        System.out.println(strChinese);
    }

    /**
     * 5位数字及其以下的处理
     * @param str
     * @return
     */
    private static StringBuffer changeNumber(String str) {
        char[] chars = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            int unit = chars.length-i;// 数据位数，
            stringBuffer.append(change(chars[i])); //依据数字获取对应的汉字
            if (chars[i] > '0'){
                String chineseUnit = getUnit(unit); //依据数据位数获取对应的汉字数字单位
                stringBuffer.append(chineseUnit);
                System.out.println(str.substring(i));
                if (!chineseUnit.equals("") && Integer.valueOf(str.substring(i + 1)).equals(0)) {
                    break;
                }
            }
        }
        return stringBuffer;
    }

    private static String formatter(String toString) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strings = toString.split("零");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i].equals(""));
            if (strings[i].equals("") == false){
                stringBuffer.append(strings[i]).append("零");
            }
        }
        return stringBuffer.substring(0,stringBuffer.length()-1);
    }

    private static boolean judgeOdd(int a) {
        if (a % 2 == 0){
            return false;
        }
        return true;
    }

    /**
     * 5位以上数字中，后5位之前的数字处理
     * @param strBefore
     * @return
     */
    private static StringBuffer changeNumberBefore(String strBefore) {
        char[] chars = strBefore.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            stringBuffer.append(change(chars[i]));
            int unit = chars.length-i;
            boolean odd = judgeOdd(unit/4);
            System.out.println(chars.length/4);
            System.out.println("余数"+unit%4);
            System.out.println("before: "+chars[i]);
            if (chars[i] != '0') {
                stringBuffer.append(getNumberUnit(unit % 4, odd));
                String chinese = getNumberUnit(unit % 4, odd);
                if (!chinese.equals("") && Integer.valueOf(strBefore.substring(i + 1)).equals(0)) {
                    break;
                }
            }
        }
        return stringBuffer;

    }

    /**
     * 5位以上数字的后5位数字的处理
     * @param unit
     * @param odd
     * @return
     */
    private static String getNumberUnit(int unit, boolean odd) {
        System.out.println(unit +" " +odd);
        if (odd && unit == 0){
            return Chinese.YI.getChineseNumber();
        }else if(unit == 0){
            return Chinese.MYRIAD.getChineseNumber();
        }
        switch (unit){
            case 1:
                return Chinese.TEN.getChineseNumber();
            case 2:
                return Chinese.HUNDRED.getChineseNumber();
            case 3:
                return Chinese.THOUSAND.getChineseNumber();
        }
        return "";
    }

    /**
     * 后5位数据转化
     * @param strAfter
     * @return
     */
    private static StringBuffer changeNumberAfter(String strAfter) {
        char[] charsAfter = strAfter.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < charsAfter.length; i++) {
            int unit = charsAfter.length-i;// 数据位数，
            if (charsAfter[i] == '0' && unit == 5){
                stringBuffer.append(getUnit(unit));
                continue;
            }
            stringBuffer.append(change(charsAfter[i])); //依据数字获取对应的汉字
            if( charsAfter[i] != '0'){

                String chineseUnit = getUnit(unit); //依据数据位数获取对应的汉字数字单位
                stringBuffer.append(chineseUnit);
                System.out.println(strAfter.substring(i));
                if (!chineseUnit.equals("") && Integer.valueOf(strAfter.substring(i + 1)).equals(0)) {
                    break;
                }
            }

        }
        return stringBuffer;
    }

    private static String getUnit(int unit) {
        AtomicReference<String> chineseUnit = new AtomicReference<>("");
        switch (unit){
            case 2:
                chineseUnit.set(Chinese.TEN.getChineseNumber());
                break;
            case 3:
                chineseUnit.set(Chinese.HUNDRED.getChineseNumber());
                break;
            case 4:
                chineseUnit.set(Chinese.THOUSAND.getChineseNumber());
                break;
            case 5:
                chineseUnit.set(Chinese.MYRIAD.getChineseNumber());
        }
        return chineseUnit.get();
    }

    private static String change(char aChar) {
        AtomicReference<String> chineseStr = new AtomicReference<>("");

        switch (aChar){
            case '0':
                chineseStr.set(Chinese.ZERO.getChineseNumber());
            break;
            case '1':
                chineseStr.set(Chinese.ONE.getChineseNumber());
                break;
            case '2':
                chineseStr.set(Chinese.TWO.getChineseNumber());
                break;
            case '3':
                chineseStr.set(Chinese.THREE.getChineseNumber());
            break;
            case '4':
                chineseStr.set(Chinese.FOUR.getChineseNumber());
            break;
            case '5':
                chineseStr.set(Chinese.FIVE.getChineseNumber());
            break;
            case '6':
                chineseStr.set(Chinese.SIX.getChineseNumber());
            break;
            case '7':
                chineseStr.set(Chinese.SEVEN.getChineseNumber());
            break;
            case '8':
                chineseStr.set(Chinese.EIGHT.getChineseNumber());
            break;
            case '9':
                chineseStr.set(Chinese.NIGHT.getChineseNumber());
            break;
            default:
                break;
        }
        return chineseStr.get();
    }
}
