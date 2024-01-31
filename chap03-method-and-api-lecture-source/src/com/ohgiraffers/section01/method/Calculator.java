package com.ohgiraffers.section01.method;

public class Calculator {

    /* 전달 인자 두 개 중 최솟값을 반환하는 메소드 */
    public int minNumberOf(int first, int second) {
        return first > second ? second : first; //삼항 연산자

    }
    /* 전달 인자 두 개 중 최댓값을 반환하는 메소드 */
    public static int maxNumberOf(int first, int second) {

        return first > second ? first : second; //삼항 연산자 + static 형식
    }
}
