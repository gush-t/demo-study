package com.example.workstudy.hauwei;

import org.springframework.transaction.TransactionDefinition;

import java.util.Scanner;

public class StringArrange {

    /**
     * 字符串排列
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            //String inputString = scanner.next();
            //char[] chars = inputString.toCharArray();
            //recursionArrange(chars,0,chars.length-1);
            int inputNumber = scanner.nextInt();
            System.out.println(recursionFactorial(inputNumber));
        }
    }

    private static void recursionArrange(char[] chars, int start, int end) {
        if (end <=1){
            return;
        }
        if(start == end){
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
            System.out.println();
        }else {
            for (int i = start; i <= end; i++) {
                swap(chars,i,start);
                recursionArrange(chars,start+1,end);
                swap(chars,i,start);
            }
        }
    }

    private static void swap(char[] chars, int i, int start) {
        char temp = chars[i];
        chars[i] = chars[start];
        chars[start] = temp;
    }

    private static Integer recursionFactorial(Integer number){
        if (number ==1){
            return 1;
        }
        return recursionFactorial(number -1) * number;
    }
}
