package com.ohgiraffers.section01.generic;

/* 제네릭 선언은 클래스 선언부 마지막에 다이아몬드 연산자를 이용하여 작성한다.
 *  다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성한다.
 *  T는 타입 변수라고 부른다. 타입 변수를 자료형 대신 사용한다.
 *  가상으로 존재하는 타입으로 T가 아닌 다른 영문자를 사용해도 무방하다.
 *  여러 개의 타입 변수를 작성할 때는 ,를 이용해서 기술 할 수 있다. */
public class GenericTest<T> {

    /* 제네릭 선언은 int, String 등 선언하고 작성하는 클래스에 비해
    여러가지 다양한 자료형 타입을 활용할 수 있는 객체를 만들 수 있다는 장점이 있다. (유동성) */

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    /* 사용하는 쪽에서 작성한 제네릭 클래스를 이용할 때 실제 사용할 타입을 변수 자리에 넣어주게 되면
    *  컴파일 시점에 타입이 결정되게 된다. */


}
