package com.ohgiraffers.section05.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {

    public static void main(String[] args) {
        String timeNow = "14:05:10";
        String dateNow = "2022-10-12";
        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);
        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);
        System.out.println("localDateTime = " + localDateTime);
        dateNow = "221005";
        timeNow = "14-05-10";
        System.out.println("Pattern = " + LocalDate.parse(dateNow, DateTimeFormatter.ofPattern("yyMMdd")));
        System.out.println("Pattern = " + LocalTime.parse(timeNow, DateTimeFormatter.ofPattern("HH-mm-ss")));
        LocalDate localDate1 = LocalDate.now();
        LocalTime localTime1 = LocalTime.now();
        /* 내가 원하는 양식으로 시간과 날짜를 호출한다. */
        String dateFormat = localDate1.format(DateTimeFormatter.ofPattern("yyyy년-MM월-dd일"));
        String timeFormat = localTime1.format(DateTimeFormatter.ofPattern("HH시 mm분 ss초"));
        System.out.println("dateFormat = " + dateFormat);
        System.out.println("timeFormat = " + timeFormat);

    }
}
