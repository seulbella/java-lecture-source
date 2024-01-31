package com.ohgiraffers.section02.string;

public class Application2 {

    public static void main(String[] args) {
        /* 문자열 객체를 만드는 방법
        *  "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton)
        *  new String("문자열") : 매번 새로운 인스턴스를 생성한다.
        * */
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        /* 리터럴 형태로 만든 문자열 인스턴스는 상수풀이라는 메모리 영역에 저장되는데, 이와 동일한 값을 가지는 인스턴스와 하나의 인스턴스로 관리한다.
        *  따라서 주소 값을 비교하는 == 연산으로 비교시 true를 반환한다. */
        System.out.println("str1 == str2 : " + (str1 == str2));
        /* new 로 새로운 인스턴스를 생성하게 되면 기본 인스턴스를 두고 상수풀이 아닌 heap에 새로운 인스턴스를 할당하기 때문에
        *  == 연산으로 비교시 false를 반환한다. */
        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));

        /* 동일한 문자열은 동일한 hashCode 값을 반환하도록 String 클래스에 재정의 되어 있다. */
        System.out.println("str1의 hashCode : " + str1.hashCode());
        System.out.println("str2의 hashCode : " + str2.hashCode());
        System.out.println("str3의 hashCode : " + str3.hashCode());
        System.out.println("str4의 hashCode : " + str4.hashCode());

        /* 문자열은 불변이라는 특징을 가진다.
        *  기존 문자열에 + 연산을 수행하는 경우 문자열을 수정하는 것이 아니라 새로운 문자열을 할당하게 된다.
        * */
        str2 += "oracle";
        System.out.println("str1 == str2 : " + (str1 == str2));

        /* equals() : 인스턴스 주소 값 비교가 아니라 문자열 값을 비교하여 동일한 값을 가지면 true을 반환하도록
        *  재정의 되어 있다. 따라서 문자열 인스턴스 생성 방식과 상관 없이 동일한 문자열인지 비교하기 위해서는
        *  == 연산이 아니라 equals() 메소드를 사용해야 한다. */
        System.out.println("str1.equals(str3) : " + str1.equals(str3));
        System.out.println("str1.equals(str4) : " + str1.equals(str4));



    }
}
