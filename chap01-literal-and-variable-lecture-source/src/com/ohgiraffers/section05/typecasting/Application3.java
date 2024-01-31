package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args) {
        /* 자동 형변환과 강제 형변환을 이용하여 서로 다른 자료형끼리 연산을 수행할 수 있다. */

        int inum = 10;
        long lnum = 100;

        /* inum이 long 타입으로 자동 형변환 된 뒤 연산이 일어난 결과는 long이다. int에 담을 수 없다.*/
        // int isum = inum + lnum;

        /* 1. 두 수의 연산 결과를 int 타입으로 변환 */
        int isum = (int) (inum + lnum);

        /* 2. long형 값을 int형으로 변환 시키고 연산 */
        int isum2 = inum + (int) lnum;

        /* 결과 값을 long형 자료형으로 처리 (자동 형변환) */
        long isum3 = inum + lnum;

        // 데이터 손실 가능성을 염두하고 필요하다고 판단될 때는 강제 형변환을, 아닌 경우는 자동 형변환을 쓰는 게 좋다.

        /* 주의! int 미만의 연산의 처리 결과는 int형 이다. */
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;
        int result1 = byteNum1 + byteNum2;
        int result2 = byteNum1 + shortNum1;
        int result3 = shortNum1 + byteNum1;
        int result4 = shortNum1 + shortNum2;
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);

    }
}
