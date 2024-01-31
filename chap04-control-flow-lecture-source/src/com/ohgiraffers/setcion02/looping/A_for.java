package com.ohgiraffers.setcion02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {
        /* for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 1부터 10까지 1씩 증가시키면서(10번) 값을 출력하는 반복문 */
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    public void testForExample1() {
        /* 무엇을 반복해야 하는지 확인한 뒤 반복문으로 코드 개선하기 */

        /* 무엇을 반복하는지를 확인하고, 반복문으로 개선해보기 */
        /* 10명의 학생 이름을 입력받아 이름을 출력해보자 */
        /* 반복해야 할 내용이 무엇인지와 몇 번 반복해야 하는지를 확인해보자!! */
        Scanner sc = new Scanner(System.in);
        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
        String student2 = sc.nextLine();
        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
        String student3 = sc.nextLine();
        System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
        String student4 = sc.nextLine();
        System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
        String student5 = sc.nextLine();
        System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
        String student6 = sc.nextLine();
        System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
        String student7 = sc.nextLine();
        System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
        String student8 = sc.nextLine();
        System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
        String student9 = sc.nextLine();
        System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
        String student10 = sc.nextLine();
        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

        /* 위의 코드를 반복문으로 개선한다. */
        for(int i = 1; i <= 10; i++){
            System.out.println(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");
        }
    }

    public void testForExample2() {
        /* 문장 속에서 규칙을 찾아 반복문으로 구현하기 */

        /* 1 ~ 10까지의 합계를 구하시오 */

        /* 1부터 10까지 변수에 저장 */
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        /* 결과를 누적시켜 담아줄 변수 선언 */
        /* 더한 값을 누적시킬 변수는 통상적으로 0으로 초기화 */
        int sum = 0;

        /* sum에 변수의 값 하나씩 담기 */
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;

        /* sum에 저장 된 값 출력 */
        System.out.println("sum : " + sum);

        /* 위의 코드를 반복문으로 개선 */
        int sum2 = 0;

        for(int i = 1; i <= 10; i++){
            sum2 += i;
        }

        System.out.println("sum2 : " + sum2);

    }

    public void testForExample3() {
        /* 5 ~ 10 사이의 난수를 발생 시켜서 1부터 발생한 난수까지의 합계를 구한다. */

        int random = (int) (Math.random() * 6) + 5;

        int sum = 0;

        for(int i = 1; i <= random; i++) {
            sum += i;
        }

        System.out.println("1부터 " + random + "까지의 합계 : " + sum);

    }

    public void testForExample4(){
        /* 숫자 2개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하시오
        * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결한다. */

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 입력 : ");
        int second = sc.nextInt();

        /* 작은 수에서 큰 수까지의 합계를 구하는 것이기 때문에
        * first와 second 중 어느 것이 더 큰 수인지 확인하면 작은 수 ~ 큰수 까지의 합계를 구하는 로직으로 작성 가능하다. */
        int min = 0;
        int max = 0;
        int sum = 0;

        if(first > second) {
            max = first;
            min = second;
        } else {
            max = second;
            min = first;
        }

        for(int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.println(min + "에서 " + max + "까지의 합계 : " + sum);

    }

    public void printSimpleGugudan () {
        /* 구구단은 곱하는 수가 1부터 시작하여 9까지 1씩 증가하며 곱하는 규칙을 가지고 있다. */

        /* 2 ~ 9 사이의 수를 입력 받아 구구단을 출력하고, 해당 범위의 수를 입력하지 않으면
        * "반드시 2 ~ 9 사이의 양수를 입력해야 합니다."를 출력한다. */

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단의 단 수를 입력 : ");
        int dan = sc.nextInt();

        if (dan >= 2 && dan <= 9) {

            for(int su = 1; su <= 9; su++){

                System.out.println(dan + " * " + su + " = " + (dan * su));

            }

        } else {
            System.out.println("반드시 2 ~ 9 사이의 양수를 입력해야 합니다.");
        }

    }
}
