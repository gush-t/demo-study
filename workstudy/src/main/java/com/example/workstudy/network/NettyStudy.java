package com.example.workstudy.network;

import java.time.Duration;
import java.time.LocalDateTime;

public class NettyStudy {

    public static void main(String[] args) {
        //插入排序：从第二多个元素开始和之前的元素进行比较，并进行位置交换
        int[] ints = {12,12,34,65,67,12,01,11,0,1,};
        insertSort( ints);


        //冒泡排序


        //选择排序：从元素中选出第I小的元素放置到合适的位置
    }

    private static void insertSort(int[] ints) {
        LocalDateTime beginTime =  LocalDateTime.now();
        System.out.println("begin time:"+ beginTime.toString());
        for (int i = 1; i < ints.length; i++) {
            int currentDump = ints[i];
            int j = i-1;
            while (j>=0 && (ints[j+1]<ints[j])){
                ints[j+1] =ints[j];
                j=j-1;
            }
            ints[j+1] = currentDump;
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("endTime: "+ endTime.toString());
        Duration duration =  Duration.between(beginTime,endTime);
        System.out.println("duration: "+duration.getNano());
    }
}
