package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

        /* 여러 개의 전달 인자를 이용한 메소드 호출을 할 수 있다. */
        Application4 app4 = new Application4();
        app4.testMethod("홍길동",20,'남');
        // 매개변수의 타입, 개수, 순서가 모두 일치해야 전달 인자를 올바르게 전달할 수 있다.
        //app4.testMethod(20,"유관순",'여'); -> 틀린 예시

        /* 변수에 저장 된 값을 전달하며 호출 */
        String name = "이슬비";
        int age = 20;
        char gender = '여';

        app4.testMethod(name, age, gender);

    }

    public void testMethod(String name, int age, final char gender) {
        /* 매개변수도 일종의 지역 변수로 분류 된다. final 키워드도 사용 가능하다. */
        /* 단, final 매개변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다. */
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
    }
}
