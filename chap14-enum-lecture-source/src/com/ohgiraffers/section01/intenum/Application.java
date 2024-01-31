package com.ohgiraffers.section01.intenum;

public class Application {

    public static void main(String[] args) {
        /* 정수 열거 패턴과 이의 단점을 이해할 수 있다. */

        /* 1. 타입 안전을 보장할 방법이 없으며 에러 디버깅이 어렵다. */
        int food = Foods.MEAL_AN_BUTTER_KIMCHI_STEW;     // 상수값 : 0
        food = Foods.DRINK_RADISH_KIMCHI_LATTE;          // 상수값 : 0

        /* 2. 2가지가 모두 상수 0이라는 값을 가지고 있기 때문에 이를 구분 할 수 없다. */
        if(food == Foods.MEAL_AN_BUTTER_KIMCHI_STEW) {
            System.out.println("식사 카테고리 - 앙버터 김치찜");
        }

        /* 2. 정수형 상수는 문자열로 출력하기 어렵다.
        *  경우에 따라서는 상수 값을 문자열로 사용해야 하는 경우가 있는데 문자열로 출력하기 까다롭다. */
        System.out.println(Foods.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(Foods.MEAL_MINT_SEAWEED_SOUP);
        System.out.println(Foods.MEAL_BUNGEOPPANG_SUSHI);

        /* 3. 정수 열거 그룹에 속한 모든 상수를 순회하는 방법도 쉽지 않다. */

        /* 4. 정수 열거 패턴으로 상수가 선언 된 경우 상수에 변경이 발생하면 컴파일을 새로 해야한다. */

    }
}
