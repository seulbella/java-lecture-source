package com.ohgiraffers.section01.method;

public class Application5 {

    public static void main(String[] args) {
        /* 메소드 리턴에 대해 이해할 수 있다. */

        System.out.println("main 메소드 시작...");

        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("main 메소드 끝...");
    }

    public void testMethod(){

        System.out.println("testMethod 동작 확인...");

        /* 모든 메소드의 내부에는 return; 이 존재한다.
        * 단, void 메소드의 경우 컴파일러가 자동으로 추가해주므로 명시적 작성이 필요 없다.
        * 현재 메소드를 강제 종료한 뒤 호출한 구문으로 다시 돌아가는 명령어이다. */
        return;
//        System.out.println("test"); -> return 이후에는 명령문을 작성할 수 없다. (컴파일 에러 남)
    }
}

