package com.example.workstudy.hauwei;

import java.util.Arrays;
import java.util.Scanner;

public class LCM {

    /**
     * 两个数的最小公倍数 A,B
     * 计算公式：A*B /最大公约数
     * 如何计算最大公约数
     * 如果A>B ，A%B 的余数C B%C ,直到余数为0，除数就是最大公约数
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String number = scanner.nextLine();
            String[] strings = number.split(" ");
            //Arrays.stream(strings).forEach(System.out::println);
            int first = Integer.valueOf(strings[0]);
            int second = Integer.valueOf(strings[1]);
            int third = first*second;
            int max = 1;
            if (first>second){
              max =  gcd(first,second);
            }else {
               max = gcd(second,first);
            }
            System.out.println(third/max);
        }
    }

    private static int gcd(int first, int second) {
        if (second == 0 ){
            return first;
        }
        return gcd(second,first%second);
    }
}
