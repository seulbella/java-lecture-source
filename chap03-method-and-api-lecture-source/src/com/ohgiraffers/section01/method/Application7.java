package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {
        /* 매개변수와 리턴 값을 복합적으로 활용해볼 수 있다. */

        int first = 100;
        int second = 20;

        Application7 app7 = new Application7();
        System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first,second));
        System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first,second));
        System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first,second));
        System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNumbers(first,second));

    }

    public int plusTwoNumbers(int first, int second){

        return first + second;
    }

    public int minusTwoNumbers(int first, int second){

        return first - second;
    }

    public int multipleTwoNumbers(int first, int second){

        return first * second;
    }

    public int divideTwoNumbers(int first, int second){

        return first / second;
    }

}



