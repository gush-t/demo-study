package com.example.workstudy.hauwei;

import java.util.Arrays;

public class ParkTest {

    public static void main(String[] args) {
        char[] chars = {1,0,1};
        Arrays.toString(chars);
        String str = "110011101";
        String[] strings =  str.split("0");
        for (int i = 0; i <strings.length; i++) {
            System.out.println(strings[i].length());
        }
    }
}
