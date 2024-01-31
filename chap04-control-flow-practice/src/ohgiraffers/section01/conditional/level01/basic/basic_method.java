package ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class basic_method {
    public void testBasic1() {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("양수다.");
        } else {
            System.out.println("양수가 아니다.");
        }
    }

    public void testBasic2() {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");
        int num1 = sc.nextInt();

        if(num1 % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("홀수다");
        }
    }

    public void testBasic3() {
        int sum = 0;
        for(int i = 0; i < 11; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }
}
