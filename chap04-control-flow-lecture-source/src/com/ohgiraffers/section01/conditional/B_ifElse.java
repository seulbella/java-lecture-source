package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testSimpleIfElseStatement() {
        /* if-else 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 정수 1개를 입력 받아 홀수이면 "입력하신 숫자는 홀수입니다." 라고 출력한다.
         * 홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력핟나.
         * 단, 조건과 무관하게 종료 시 "프로그램을 종료합니다." 라고 출력한다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력 : ");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println("입력하신 숫자는 홀수입니다.");
        } else {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }

        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfElseStatement() {
        /* 중첩 된 if-else 문에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 정수 1개를 입력 받아 홀수이면 "입력하신 숫자는 홀수입니다." 라고 출력한다.
         * 홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력한다.
         * 단, 0이면 "0입니다."라고 출력한다.
         * 단, 조건과 무관하게 종료 시 "프로그램을 종료합니다." 라고 출력한다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력 : ");
        int num = sc.nextInt();

        if (num != 0) {
            if (num % 2 != 0) {
                System.out.println("입력하신 숫자는 홀수입니다.");
            } else {
                System.out.println("입력하신 숫자는 짝수입니다.");
            }
        } else {
            System.out.println("0입니다.");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
