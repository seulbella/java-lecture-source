package com.ohgiraffers.section03.interfaceimplements;

public class Application {

    public static void main(String[] args) {
        /* 인터페이스에 대해 이해할 수 있다. */

        /* 인터페이스는 인스턴스화 불가 */
//        InterProduct interProduct = new InterProduct();

        /* 다형성을 이용하여 레퍼런스 타입으로 사용 가능 */
        InterProduct interProduct = new Product();

        /* 오버라이딩 강제화 된 추상 메소드 */
        interProduct.nonStaticMethod();
        interProduct.abstMethod();
        /* 오버라이딩 (강제화x) 된 default 메소드 */
        interProduct.defaultMethod();
        /* 인터페이스에 정의 된 static 메소드*/
        InterProduct.staticMethod();
        /* 인터페이스에 정의 된 상수 필드 */
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);

        /* 인터페이스 사용 이유?
        * 1. 추상 클래스와 유사하게 필요한 기능을 공통화해서 강제성을 부여할 목적으로 사용한다. (표준화)
        * 2. 자바의 단일 상속의 장점을 극복할 수 있다. (다중 상속)
        * */
    }
}
