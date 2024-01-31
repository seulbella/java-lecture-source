package com.ohgiraffers.section02.abstractclass;

/* 추상 클래스 선언 */
public abstract class Product {
    /* 추상 클래스는 필드를 가질 수 있다. */
    private int nonStaticField;
    private static int staticField;

    /* 추상 클래스는 생성자도 가질 수 있다.
     *  단, 직접적으로 인스턴스를 생성할 수는 없다. */
    public Product() {
    }

    /* 추상 클래스는 일반적인 메소드를 가질 수 있다. */
    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출...");
    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 staticMethod 호출...");
    }

    /* 추상 메소드(미완성 메소드) 작성
    *  추상 메소드가 존재하는 경우 반드시 클래스에 abstract 키워드를 붙여 추상 클래스로 만들어야 한다.
    *  추상 메소드가 0개인 경우 선택적으로 클래스에 abstract 키워드를 붙여 추상 클래스로 만들 수 있다. */
    public abstract void abstMethod();

}
