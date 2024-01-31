package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
    /* 스캐너 사용 시 주의 사항에 대해 이해하고 고려하여 사용할 수 있다. */

    /* 스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰 단위로 분리해서 읽어온다.
    * 그래서 크게 두 가지 사항을 주의해야 한다.
    * 1. next()로 문자열 입력 후 정수, 실수, 논리값 입력 받을 때
    * 2. 정수, 실수, 논리값 입력 후 nextLine()으로 문자열 입력 받을 때 */

        Scanner sc = new Scanner(System.in);

//        /* 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때 */
//        System.out.print("문자열을 입력해주세요 : ");
//        String str1 = sc.next();
//        System.out.println("str1 : " + str1);
//
//        System.out.print("숫자를 입력해주세요 : ");
//        int num1 = sc.nextInt();
//        System.out.println("num1 : " + num1);

        /* 공백을 포함한 문자열을 입력하게 되면 입력 버퍼에 남아 있는 문자열로 인해 nextInt () 메소드가
        * 해당 값을 숫자로 변경하지 못해 InputMismatchException이 발생할 수 있는 가능성이 있다. */
        /* => 공백이 있는 문자열을 입력 받아야 할 경우에는 next가 아닌 nextLine을 사용한다. */

        /* 2. 정수, 실수, 논리값 입력 후 nextLine()으로 문자열 입력 받을 때 */
        System.out.print("숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 : " + num2);

        sc.nextLine(); // 입력 버퍼를 읽어서 버린다.

        System.out.print("문자열을 입력해주세요 : ");
        String str2 = sc.nextLine(); //next를 입력하면 근데 잘 넘어가게 된다(?)
        System.out.println("str2 : " + str2);

        /* 입력 버퍼에 남아있는 개행문자로 인해 이어지는 nextLine()이 아무 값도 입력 받지 않고 빈 문자열로 처리된다.
        * => 입력 버퍼에 남은 개행문자를 사전에 읽고 버린다. */


    }

}
