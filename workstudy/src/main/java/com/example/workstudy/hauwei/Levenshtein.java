package com.example.workstudy.hauwei;

import com.example.workstudy.pattern.decorate.Man;

import java.util.Scanner;

public class Levenshtein {
    /**
     * 相关连接：https://www.iteye.com/blog/wdhdmx-1343856
     * 编辑距离算法
     * 最短编辑距离
     * 两个字符串之间的相识度
     *     abc a b c
     *  abd 0  1 2 3
     *   a  1  0 1 2
     *   b  2  1 0 1
     *   d  3  2 1 1
     *
     *   左右值加一
     *   左上角的值，如果两个值相等就加0 ，不等就加1
     *   取左，右，左上角 3个值中的最小值
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str01 = scanner.nextLine();
            String str02 = scanner.nextLine();
            char[] chars01 = str01.toCharArray();
            char[] chars02 = str02.toCharArray();
            int [][] dynamicArray = new int[str01.length()+1][str02.length()+1];
            for (int i = 0; i <= str01.length(); i++) {
                dynamicArray[i][0] = i;
            }
            for (int j = 0; j <= str02.length(); j++) {
                dynamicArray[0][j] = j;
            }
            int temp = 0;
            for (int i = 1; i <= str01.length(); i++) {
                for (int j = 1; j <= str02.length(); j++) {
                    if (chars01[i-1] != chars02[j-1]){
                        temp = 1;
                    }else {
                        temp = 0;
                    }
                    dynamicArray[i][j] = min(dynamicArray[i-1][j-1]+temp,dynamicArray[i][j-1]+1,
                            dynamicArray[i-1][j]+1);
                }
            }
            System.out.println(dynamicArray[str01.length()][str02.length()]);
        }
    }
    private static int min(int i, int i1, int i2) {
        int min01 = Math.min(i,i1);
        int min02 = Math.min(i1,i2);
        return Math.min(min01,min02);
    }
}
