package com.example.workstudy.hauwei;

import java.util.Scanner;

public class SnakeMatrix {
    /**
     * 蛇形矩阵
     * 1.建立一个二维数组
     * 2.向二维数组中放置元素
     * 3.遍历二维数组
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int line  = scanner.nextInt();
            int[][] snakeArray = new int[line][line];
            int number =1;
            for (int i = 0; i < line; i++) {
                int k =i;
                int j =0;
                for (int l = 0; l <= i; l++) {
                    snakeArray[k--][j++] = number++;
                }
            }
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < line; j++) {
                    int outNumber = snakeArray[i][j];
                    if (outNumber != 0){
                        System.out.print(outNumber+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
