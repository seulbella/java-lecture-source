package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {
        /* 메소드 전달 인자(argument)와 매개변수(parameter)에 대해 이해하고 메소드 호출 시 사용할 수 있다. */

        /* 1. 전달 인자로 값 전달 테스트
        * 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형, 갯수, 순서가 일치하게 값을 넣어 호출해야 한다. */

        Application3 app3 = new Application3();
        app3.testMethod(40); //age는 시스템 상 노출된 것, 숫자만 입력하면 됨
        app3.testMethod(30); // 전달인자
        //app3.testMethod("10");
        //app3.testMethod(20, 30);
        //app3.testMethod();

        /* 2. 변수에 저장한 값 전달 테스트 */
        int age = 20;
        app3.testMethod(age);

        /* 3. 자동 형변환을 이용한 값 전달 테스트 */
        byte byteAge = 10;
        app3.testMethod(byteAge);

        /* 4. 강제 형변환을 이용한 값 전달 테스트 */
        long longAge = 80;
        app3.testMethod((int)longAge);

        /* 5. 연산 결과를 이용한 값 전달 테스트 */
        app3.testMethod(age * 3);
    }

    /* int 타입의 매개변수를 전달 받는 메소드 선언 */
    public void testMethod(int age) { //매개변수(parameter)
        System.out.println("당신의 나이는 " + age + "세 입니다.");

    }
}
