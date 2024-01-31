package com.ohgiraffers.section01.intro;

public class Application1 {

    public static void main(String[] args) {
        /* 람다식에 대해 이해하고 사용할 수 있다. */

        /* 인터페이스에 정의 된 추상 메소드를 활용하기 위해서는 3가지 방법이 있다.
        *  1. 인터페이스를 상속 받은 클래스를 정의하여 기능을 완성한 후 사용하는 방법
        * */
        Calculator c1 = new CalculatorImpl();
        System.out.println(c1.sumTwoNumber(10, 20));

        /* 2. 익명 클래스를 사용하는 방법 */
        Calculator c2 = new Calculator() {
            @Override
            public int sumTwoNumber(int a, int b) {
                return a + b;
            }
        };
        System.out.println(c2.sumTwoNumber(20, 30));

        /* 3. 람다식을 이용한 방법 */
        Calculator c3 = (a, b) -> a + b;
        System.out.println(c3.sumTwoNumber(40,50));
    }

}
