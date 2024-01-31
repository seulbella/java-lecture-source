package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {

        /* 메소드의 호출 흐름에 대해 이해할 수 있다. */
        System.out.println("main 메소드 시작...");

        /* 작성한 메소드를 호출한다.
        * 클래스명 사용할이름 = new 클래스명();
        * 사용할이름.메소드명();
        * */
        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main 메소드 종료...");

    }

    public void methodA() {

        System.out.println("methodA 호출됨...");
        /* methodB 호출 */
        methodB();
        System.out.println("methodA 종료됨...");

    }

    public void methodB() {

        System.out.println("methodB 호출됨...");
        /* methodC 호출 */
        methodC();
        System.out.println("methodB 종료됨...");

    }

    public void methodC() {

        System.out.println("methodC 호출됨...");
        System.out.println("methodC 종료됨...");
    }
}
