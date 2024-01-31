package com.ohgiraffers.level01.basic;

public class Calculator {

    //메소드 호출 확인용
    public void checkMethod() {

        System.out.println("메소드 호출 확인");
    }

    //함수를 호출하여 1~10까지의 합을 리턴 받아 출력
    public int sum1to10() {
        return 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
    }

    //10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
    public int checkMaxNumber(int first, int second) {

        return first > second ? first : second;
    }

    //10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
    public int sumTwoNumber(int first, int second) {

        return first + second;
    }

    //10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
    public int minusTwoNumber(int first, int second) {

        return first - second;
    }

}
