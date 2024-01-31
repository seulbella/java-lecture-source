package com.ohgiraffers.section01.exception;

public class Application2 {

    public static void main(String[] args) {
        /* try catch 블럭을 이용하여 예외 처리를 할 수 있다. */
        ExceptionTest et = new ExceptionTest();

        try {
            /* try 블럭에는 예외 발생 가능성이 있는 코드를 호출 한다. */
            et.checkEnoughMoney(50000, 10000);

            /* 위의 메소드 호출 시 예외가 발생하지 않는 경우 이후 내용을 마저 실행 한다.*/
            System.out.println("===== 상품 구입 가능 =====");
        } catch (Exception e) {
            /* try 블럭에서 예외 발생 시 catch 블럭의 코드가 실행 된다.
            *  이 때 예외 발생 위치 하단의 코드는 동작하지 않는다. */
//            throw new RuntimeException(e); //기존에 있던 코드는 주석처리 하거나 삭제한다. (현재 의도할 메서드가 아님)
            System.out.println("===== 상품 구입 불가 =====");
//            e.printStackTrace();
        }

        /* 예외 발생을 포함하여 catch 블럭 실행 후 프로그램의 수행 흐름으로 돌아와 정상 종료 된다. */
        System.out.println("프로그램을 종료합니다.");

    }

}
