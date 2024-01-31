package com.ohgiraffers.level01;

public class basic {

    public static void main(String[] args) {

        /* 문제 1 */
        System.out.println("문제 1");
        /* 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */

        System.out.println("=====내 답=====");

        int num20 = 20;
        int num30 = 30;

        System.out.println("더하기 결과 : " + (num20 + num30));
        System.out.println("빼기 결과 : " + (num20 - num30));
        System.out.println("곱하기 결과 : " + (num20 * num30));
        System.out.println("나누기한 몫 : " + (num20 / num30));
        System.out.println("나누기한 나머지 : " + (num20 % num30));

        /* 선생님 답 */
        System.out.println("=====선생님 답=====");

        int first = 20;
        int second = 30;

        int plus = first + second;
        int minus = first - second;
        int multi = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("더하기 결과 : " + plus);
        System.out.println("빼기 결과 : " + minus);
        System.out.println("곱하기 결과 : " + multi);
        System.out.println("나누기한 몫 : " + div);
        System.out.println("나누기한 나머지 : " + mod);


        /* 문제2 */
        System.out.println("문제2");
        /* 사각형의 넓이와 둘레를 구하는 문제이다.
         * 너비 12.5 높이 36.4를 변수에 저장하고
         * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
         *
         * -- 출력 예시 --
         * 면적 : 455.0
         * 둘레 : 97.8
         *  */

        System.out.println("=====내 답=====");

        double numWidth = 12.5;
        double numHeight = 36.4;

        double area = numWidth * numHeight;
        double round = (numWidth * 2) + (numHeight * 2);

        System.out.println( "면적 : " + area);
        System.out.println( "둘레 : " + round);

        /* 선생님 답 */
        System.out.println("=====선생님 답=====");

        double width = 12.5;
        double height = 36.4;

        double area2 = width * height;
        double round2 = (width + height) * 2;

        System.out.println("면적 : " + area2);
        System.out.println("둘레 : " + round2);
    }
}
