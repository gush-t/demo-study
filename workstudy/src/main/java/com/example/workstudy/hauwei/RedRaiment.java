package com.example.workstudy.hauwei;

import java.util.Arrays;
import java.util.Scanner;

public class RedRaiment {

    /**
     * 梅花桩
     * 升序排列
     * 从i开始，升序序列，如果符合条件+1，累计的数据存储在数组中
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int size = Integer.parseInt(scanner.nextLine());
            String strNumber = scanner.nextLine();
            Integer[] integers = new Integer[size];
            String[] strings = strNumber.split(" ");
            int temp;
            for (int i = 0; i < strings.length; i++) {
                temp = Integer.parseInt(strings[i]);
                int count=1;
                for (int j = i+1; j < strings.length; j++) {
                    if (temp < Integer.parseInt(strings[j])){
                        temp = Integer.parseInt(strings[j]);
                        count++;
                    }
                }
                integers[i] = count;
            }
            System.out.println(Arrays.stream(integers).max((x,y) -> x.compareTo(y)).get());
        }
    }
}
