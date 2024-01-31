package com.ohgiraffers.section03.interfaceimplements;

/* 인터페이스는 인터페이스를 상속할 수 있다. 이 때는 extends 라는 키워드를 사용한다. */
/* 클래스 extends 클래스 -> 단일 상속
*  클래스 implements 인터페이스1, 인터페이스2 ... -> 다중 상속
*  인터페이스 extends 인터페이스1, 인터페이스2 ... -> 다중 상속
* */
public interface InterProduct extends java.io.Serializable {

    /* 인터페이스는 상수 필드만 작성 가능하다.
     * public static final 제어자 조합을 상수 필드라고 부른다.
     * 반드시 선언과 동시에 초기화 해주어야 한다. */
    public static final int MAX_NUM = 100;

    /* 상수 필드만을 가질 수 있기 때문에 모든 필드는 묵시적으로 public final이다. */
    int MIN_NUM = 10;

    /* 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct(){}

    /* 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다. */
//    public void nonStaticMethod(){}

    /* 추상 메소드만 작성이 가능하다. */
    public abstract void nonStaticMethod();

    /* 인터페이스 내 메소드는 묵시적으로 public abstract의 의미를 가진다. */
    void abstMethod();

    /* static 메소드는 작성이 가능하다. (JDK 1.8 추가 */
    public static void staticMethod() {
        System.out.println("InterProduct 인터페이스의 staticMethod 호출...");
    }

    /* default 키워드를 사용하면 non-static 메소드도 작성 가능하다. (JDK 1.8 추가)
     *  default 메소드는 완성되어 있으므로 오버라이딩이 강제화 되지 않는다. */
    public default void defaultMethod() {
        System.out.println("InterProduct 인터페이스의 defaultMethod 호출...");
    }
}
