package com.example.workstudy.hauwei;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryNumber {

    public static void main(String[] args) {
        //接收数据输入
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int number = scanner.nextInt();
            String binary = Integer.toBinaryString(number);
            String[] strings = binary.split("");
            System.out.println( Arrays.stream(strings).filter(x -> x.equals("1")).count());
        }
    }
}
