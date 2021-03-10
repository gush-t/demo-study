package com.example.workstudy.hauwei;

import java.util.Scanner;

public class MixString {
    /**
     * 最小的字典序
     * 1.首先需要明确一下字典序排列，测试一波，然后在进行分析
     * 分析 : 只能进行一次字符交换
     * 2.1 判断元素存在
     * 2.2 在进行元素交换
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String inputStr = scanner.nextLine();
            if (inputStr.length()<1 && inputStr.length()>1000){
                System.out.println("0");
            }
            char[] chars = inputStr.toCharArray();
            int[] change = getIndex(chars,inputStr);
            char temp = chars[change[0]];
            chars[change[0]] = chars[change[1]];
            chars[change[1]] = temp;
            System.out.println(new String(chars).toString());
        }
    }

    private static int[] getIndex(char[] chars,String inputStr) {
        int j = 0;
        int m = 0;
        int[] result = new int[2];
        for (j = 0; j < chars.length; j++) {
            char size = chars[j];
            for (char i = 'a'; i < size+1; i++) {
                if ((m =inputStr.indexOf(i,j+1)) > 0 && size != i){
                    result[0] = j;
                    result[1] = m;
                    return result;
            }
            }
        }
        return result;
    }
}
