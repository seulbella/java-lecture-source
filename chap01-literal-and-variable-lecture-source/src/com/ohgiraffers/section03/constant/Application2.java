package com.ohgiraffers.section03.constant;

public class Application2 {

    public static void main(String[] args) {
        /* 상수의 명명 규칙에 대해 이해할 수 있다. */

        /* 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용 */
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 40; //소문자로 작성해도 컴파일 에러는 발생하지 않음. 다만 변수와 구분하기 위해 대문자로 작성함.

        /* 2. 단어와 단어의 연결은 언더스코어로 작성한다. */
        final int MAX_AGE = 60;
        final int MIN_AGE = 20;
    }

}
