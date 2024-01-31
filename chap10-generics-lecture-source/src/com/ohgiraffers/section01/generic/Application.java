package com.ohgiraffers.section01.generic;

public class Application {

    public static void main(String[] args) {

        /* 제네릭의 사전적인 의미는 일반적인 이라는 의미이다.
         *  자바에서 제네릭은 데이터 타입을 일반화 한다는 의미를 가진다.
         *  */

        /* 타입을 Integer로 하여 인스턴스 생성 */
        GenericTest<Integer> gt1 = new GenericTest<>();
        gt1.setValue(10);
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        /* 타입을 String으로 하여 인스턴스 생성 */
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.setValue("홍길동");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

        /* 제네릭 프로그래밍
        *: 데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입을 가질 수 있는
        *  재사용성을 높일 수 있는 프로그래밍 방식이다.
        *
        *  제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일시에 지정한다.
        *  컴파일시에 미리 타입 검사를 시행하면 객체의 타입 안정성을 높일 수 있으며(잘못 된 타입일 경우 컴파일 에러 발생),
        *  반환 값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다. (instanceof 비교 및 다운 캐스팅 작성 불필요)
        *  이는 JDK 1.5 버전부터 추가 된 문법이다.
        * */

    }
}
