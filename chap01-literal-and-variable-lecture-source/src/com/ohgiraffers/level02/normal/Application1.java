package com.ohgiraffers.level02.normal;

public class Application1 {

    public static void main(String[] args) {

        System.out.println("문제1");
        /* 문자형 변수를 하나 선언 후 'a'를 대입한 후
         * 출력은 문자 'a'가 가지는 유니코드값을 출력하도록 하세요
         *
         * -- 출력 예시 --
         * 문자 a의 unicode : 97
         * */

        System.out.println("=====내 답=====");

        System.out.println("(풀이 1)");
        char chaA = 'a';
        System.out.println((int)chaA);

        System.out.println("(풀이 2)");
        int unicode = (int)chaA;
        System.out.println(unicode);

        System.out.println("문제2");
        /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */

        System.out.println("=====내 답=====");

        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;
        double totalPlus = korean + math + english;

        int total = (int)totalPlus;
        int average = (int)((totalPlus)/3);

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);
    }
}
