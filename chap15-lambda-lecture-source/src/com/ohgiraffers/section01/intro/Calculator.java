package com.ohgiraffers.section01.intro;

/* 내부에 하나의 추상 메소드가 선언 된 인터페이스만 람다식의 타깃이 될 수 있다.
 * => 함수적 인터페이스(Functional Interface)라고 하며 해당 조건을 만족하는지
 * 컴파일 시점에 체크해주는 어노테이션이 @FunctionalInterface이다.*/

@FunctionalInterface
public interface Calculator {

    public int sumTwoNumber(int a, int b);

//    public int minusTwoNumber(int a, int b); -> 추상 메소드가 2개 이상이면 컴파일 에러 발생


}
