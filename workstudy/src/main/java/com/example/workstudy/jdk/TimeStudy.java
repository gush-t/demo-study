package com.example.workstudy.jdk;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStudy {
    /**
     * Jdk8中的LocalDate,LocalTime,LocalDateTime ,DateTimeFormatter
     *
     *
     *
     *
     */

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String str = "2021年02月23日";
        LocalDate localDate = LocalDate.parse(str,dateTimeFormatter);
        //今天是这一年中的第几天
        System.out.println(localDate.getDayOfYear());
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));
    }
}
