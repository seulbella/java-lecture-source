package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {
        /* 사용자 정의 예외 클래스 정의 후 발생한 사용자 정의 예외를 처리할 수 있다. */
        /* 사용자 정의 예외 : 개발자가 정한 예외 클래스 */

        /* 사전에 정의 된 예외 클래스 외에 개발자가 원하는 명칭의 예외 클래스를 작성하는 것이 가능하다. */
        /* extends Exception으로 예외 처리 클래스를 상속 받아 더 구체적인 예외 이름을 정의하는 것이다. */

        ExceptionTest et = new ExceptionTest();

        try {
            /* 상품 가격보다 가진 돈이 적은 경우 */
//            et.checkEnoughMoney(50000, 30000);

            /* 상품 가격이 음수인 경우 */
//            et.checkEnoughMoney(-50000, 50000);

            /* 가진 돈이 음수인 경우 */
//            et.checkEnoughMoney(50000, -50000);

            /* 정상적으로 구매 가능한 돈을 가진 경우 */
            et.checkEnoughMoney(50000, 50000);

        } catch (Exception e) {

            /* 에러난 곳을 집어서 표출해주는 메서드 */
            e.printStackTrace();

        }

        System.out.println("프로그램을 종료합니다.");

    }
}
