package com.ohgiraffers.section01.arithmetic;

public class Application1 {

    public static void main(String[] args) {

        /* 산술 연산자에 대해 이해하고 활용할 수 있다. */
        int num1 = 20;
        int num2 = 7;
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2)); // *,/,% 는 '()'안 써도 우선 순위로 연산이 되기 때문에 제외해도 된다. 하지만 '()' 쓰는 걸 권장 _ 깔끔해보임
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
    }

}
