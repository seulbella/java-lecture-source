package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String[] args) {
        /* 다른 흐름의 메소드 호출에 대해 이해할 수 있다. */
        System.out.println("main 메소드 시작됨...");

        Application2 app2 = new Application2();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main 메소드 종료됨...");

    }

    public void methodA(){
        System.out.println("methodA 호출됨...");
        System.out.println("methodA 반환됨...");
    }

    public void methodB(){
        System.out.println("methodB 호출됨...");
        System.out.println("methodB 반환됨...");
    }

    public void methodC(){
        System.out.println("methodC 호출됨...");
        System.out.println("methodC 반환됨...");
    }


}
