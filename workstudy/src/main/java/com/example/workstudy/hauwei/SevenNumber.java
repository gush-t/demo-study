package com.example.workstudy.hauwei;

import java.util.Scanner;

public class SevenNumber {

    /**
     * 输出小于N的数字中于7有关的个数
     * 能被7整除和包含7个个数
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int number = scanner.nextInt();
            int count = 0 ;
            for (int i = 7; i <= number ; i++) {
                if (i % 7 == 0 || contains(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    private static boolean contains(int number) {
        String strNumber = String.valueOf(number);
        return strNumber.contains("7");
    }
}
