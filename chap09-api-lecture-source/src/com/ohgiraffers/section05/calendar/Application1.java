package com.ohgiraffers.section05.calendar;

import java.util.Date;

public class Application1 {

    public static void main(String[] args) {
        /* java.util.Date 클래스 사용법을 이해하고 사용할 수 있다. */

        /* 1. 기본 생성자 사용 : 운영체제의 날짜/시간 정보를 이용해서 인스턴스 생성 */
        Date today = new Date();
        System.out.println(today);

        /* 2. Date(long date) 사용 : long 타입의 숫자로 전달 된 날짜/시간으로 인스턴스 생성 */

        /* 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 밀리세컨드로 계산해서 long 타입으로 반환한다. */
        System.out.println(today.getTime());

        Date time = new Date(1705038612479L);
        System.out.println(time);
    }

}
