package com.example.workstudy.hauwei;

import java.util.Arrays;
import java.util.Scanner;

public class RedRaiment {

    /**
     * 梅花桩
     * 升序排列
     * 最大升序子序列
     * 举例：[1,5,3,2,6]
     * i=0 , Array[i] = 1 stepNumber[i] =1
     * i=1 , Array[i] = 5 stepNumber[i] =2
     * 因为stepNumber[i] > stepNumber[i-1]; stemNumber[i] = stemNumber[i]+1
     * i=2 , Array[i] = 3 stepNumber[i] =1
     * i=3 , Array[i] = 2 stepNumber[i] =1
     * i=4 , Array[i] = 6 stepNumber[i] =1
     * 因为stepNumber[i] > stepNumber[0,1,2,3]，; stemNumber[i] = Max(stemNumber[i])+1
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int size = Integer.parseInt(scanner.nextLine());
            String strNumber = scanner.nextLine();
            //存储升序子序列的数组
            Integer[] integers = new Integer[size];
            //数据的数值数组
            String[] strings = strNumber.split(" ");
            for (int i = 0; i < strings.length; i++) {
                integers[i] = 1;
                for (int j = 0; j < i; j++) {
                    if ( Integer.parseInt(strings[i]) > Integer.parseInt(strings[j])){
                        integers[i] = Math.max(integers[i], integers[i]=integers[j]+1);
                    }
                }
            }
            System.out.println(Arrays.stream(integers).max((x,y) -> x.compareTo(y)).get());
        }
    }
}
