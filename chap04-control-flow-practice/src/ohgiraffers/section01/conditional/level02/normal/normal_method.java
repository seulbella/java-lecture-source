package ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class normal_method {

    public void testNormal1() {

        Scanner sc = new Scanner(System.in);
        System.out.print("1~10 사이의 정수 한개를 입력해주세요 : ");
        int num3 = sc.nextInt();

        if (num3 >= 1 && num3 <= 10) {

            if (num3 % 2 == 0) {
                System.out.println("짝수다.");
            } else {
                System.out.println("홀수다.");
            }

        } else {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }
    }

    public void testNormal2() {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 몸무게(kg)는 얼마입니까?");
        double kg = sc.nextDouble();

        System.out.print("당신의 신장(m)은 얼마입니까?");
        double m = sc.nextDouble();

        double BMI = kg / ( m * m );

        System.out.println("당신의 BMI 지수는 " + (int) BMI + "입니다.");
//
        if(BMI < 20) {
            System.out.println("당신은 저체중 입니다.");
        } else if (BMI < 25) {
            System.out.println("당신은 정상체중 입니다.");
        } else if (BMI < 30) {
            System.out.println("당신은 과체중 입니다.");
        } else {
            System.out.println("당신은 비만 입니다.");
        }
    }
}

