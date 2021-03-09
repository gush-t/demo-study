package com.example.workstudy.hauwei;

import java.util.Scanner;

public class Triangle {

    /**
     * 杨辉三角形，输出偶数位置
     * 规律题
     * 行数能被4整除，在第3位
     * 行数是1，或者2 没有偶数
     * 行数被4整除的余数是1，在第2位
     * 行数被4整除的余数是3，在第2位
     * 行数被4整除的余数是0，在第3位
     * 行数被4整除的余数是2，在第4位
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int number = scanner.nextInt();
            System.out.println(evenSize(number));
        }
    }

    private static int evenSize(int number) {
        int size = -1;
        if (number == 1 || number == 2){
            size= -1;
        }else if (number % 4 == 1 || number % 4 == 3 ){
            size= 2;
        }else if (number % 4 == 0){
            size =3;
        }else if (number % 4 == 2){
            size = 4;
        }
        return size;
    }
}
