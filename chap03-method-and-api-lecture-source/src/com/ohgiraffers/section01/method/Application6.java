package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {
        /* 메소드 리턴 값을 이해하고 활용할 수 있다. */
        Application6 app6 = new Application6();
        app6.testMethod();

        /* 메소드의 반환 값이 있을 경우 반환 값을 변수에 담을 수 있다. */
        String returnText = app6.testMethod();
        System.out.println("returnText : " + returnText);

        /* 변수에 저장하지 않고 바로 출력도 가능하다. */
        System.out.println(app6.testMethod());
    }

    public String testMethod(){

        return "hello world";
    }
}
