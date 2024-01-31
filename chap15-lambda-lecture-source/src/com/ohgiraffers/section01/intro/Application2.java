package com.ohgiraffers.section01.intro;

public class Application2 {
    public static void main(String[] args) {
        /* 람다식 활용을 위한 내부 인터페이스 관리 기법에 대해 이해할 수 있따. */

        OuterCalculator.Sum sum = (x, y) -> x + y;
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiple multiple = (x, y) -> x * y;
        OuterCalculator.Divide divide = (x, y) -> x / y;

        System.out.println("sum : " + sum.sumTwoNumber(20,10));
        System.out.println("minus : " + minus.minusTwoNumber(20,10));
        System.out.println("multiple : " + multiple.multipleTwoNumber(20,10));
        System.out.println("divide : " + divide.divideTwoNumber(20,10));
    }
}
