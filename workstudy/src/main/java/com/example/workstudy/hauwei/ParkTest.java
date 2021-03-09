package com.example.workstudy.hauwei;

import java.util.Arrays;

public class ParkTest {

    public static void main(String[] args) {
        char[] chars = {1,0,1};
        Arrays.toString(chars);
        String str = "110011101";
        System.out.println(min(0,2,3));
    }
    private static int min(int i, int i1, int i2) {
        int min01 = Math.min(i,i1);
        int min02 = Math.min(i1,i2);
        return Math.min(min01,min02);
    }
}
