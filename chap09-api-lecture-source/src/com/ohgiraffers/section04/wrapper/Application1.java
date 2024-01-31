package com.ohgiraffers.section04.wrapper;

public class Application1 {

    public static void main(String[] args) {
        /* Wrapper 클래스 사용법을 이해할 수 있다. */

//        int num = 10;
        int num = 210;

        /* Wrapper 클래스의 생성자는 JDK 1.9부터 Deprecated 되었다. */
        /* Deprecated : 사용을 권장하지 않는 코드라는 뜻 (새롭게 개선하는 중) */
//        Integer num1 = new Integer(num);

        /* Boxing : int -> Integer */
        Integer num1 = Integer.valueOf(num);
        Integer num2 = num;     // Auto Boxing

        /* unBoxing : Integer -> int */
        int num3 = num1.intValue();
        int num4 = num2;    // Auto UnBoxing

        /* valueOf 메소드가 byte 범위의 숫자를 캐싱하여 사용하고 있어 10인 경우 true가 나오지만
        *  기본적으로는 인스턴스를 비교하는 것은 주소 값 비교이므로 byte 범위 이상의 숫자의 경우 false가 나온다. */
        System.out.println(num1 == num2);   //Integer, Integer 인스턴스 비교
        System.out.println(num2 == num3);   //Integer, int 값 비교
        System.out.println(num3 == num4);   // int, int 값 비교

        /* 따라서 래퍼 클래스 타입의 인스턴스를 값 비교 하고 싶다면 equals() 메소드를 사용한다. */
        System.out.println(num1.equals(num2));
    }
}
