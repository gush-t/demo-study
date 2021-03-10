package com.example.workstudy.hauwei;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Range {

    /**
     * 问题分析：
     * 1. 柱子高度无序
     * 2. 面积计算方式：柱子间距*（间距中柱子的最短柱子的长度）
     * 获取结果：最大面积
     *
     * 利用穷举法计算，算出所有可能，获取最大值
     * 数据选型，int 整形不够
     *
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String inputStr = scanner.nextLine();
            String[] strings = inputStr.split(",");
            List<String> mix = new ArrayList(Arrays.asList(strings));
            List<Integer> max = (List<Integer>) mix.stream().map(x -> Integer.valueOf(x)).collect(Collectors.toList());
            System.out.println(new ArrayList<>(max.subList(0,3)).stream().min((x,y) -> x.compareTo(y)).get());
            List<BigInteger> result = new ArrayList();
            if (inputStr.length() <1 || inputStr.length() >10000){
                System.out.println("0");
            }
            for (int j = 0; j < strings.length; j++) {
                for (int i = j+1; i < strings.length; i++) {
                    BigInteger a = BigInteger.valueOf(i-j);
                    Integer c = max.subList(j,i).stream().min((x,y) -> x.compareTo(y)).get();
                    BigInteger b = BigInteger.valueOf(c);
                    result.add(a.multiply(b));
                }
            }
            System.out.println(result.stream().max(BigInteger::compareTo).get());

        }

    }
}
