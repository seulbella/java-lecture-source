package com.ohgiraffers.section03.grammar;

public class Application1 {
    public static void main(String[] args) {
        /* 1. values() : 열거 타입의 모든 값을 배열로 리턴 */
        for(EnumType type : EnumType.values()) {
            System.out.println("type = " + type);
        }

        /* 2. valueOf() : 해당 이름을 가진 열거 타입 상수를 리턴 */
        for(EnumType type : EnumType.values()) {
            if(type == EnumType.valueOf("JAVA"))
                System.out.println("type = " + type);
        }

        /* 3. ordinal() : 열거 타입의 상수의 순서를 리턴 */
        for(EnumType type : EnumType.values()) {
            System.out.println("ordinal = " + type.ordinal());
        }
        System.out.println("ORACLE.ordinal = " + EnumType.ORACLE.ordinal());

        /*4. name() : 열거 타입의 문자열을 리턴 */
        System.out.println("name = " + EnumType.SPRING.name());
        /* 기본적으로는 toString()도 열거 타입의 문자열을 리턴함. 필요에 따라 오버라이딩 해서 사용 가능 */
        System.out.println("name = " + EnumType.SPRING.toString());
        System.out.println("name = " + EnumType.SPRING);
    }
}
