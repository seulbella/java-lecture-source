package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    public void testSimpleIfElseIfStatement() {
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");
        System.out.print("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        /* 대답한 내용이 금도끼인지 확인하는 조건식 */
        if(answer == 1) {
            /* 금도끼라고 대답한 경우 출력할 내용 */
            System.out.println("이런 거짓말 쟁이!! 너에게는 아무런 도끼도 줄 수 없구나!! 이 욕심쟁이야!!");
            /* 대답한 내용이 은도끼인지 확인하는 조건식 */
        } else if(answer == 2) {
            /* 은도끼라고 대답한 경우 출력할 내용 */
            System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 어서 썩 사라지거라!!");
            /* 위에 제시한 금도끼, 은도끼가 둘 다 아닌 경우(즉, 쇠도끼인 경우) */
        } else {
            /* 쇠도끼라고 대답한 경우 출력할 내용 */
            System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라!!");
        }
        /* 대답 여부와 상관 없이 마지막에 실행하는 내용 */
        System.out.println("그렇게 산신령은 다시 연목 속으로 사라지고 말았다...");
    }

    public void testNestedIfElseIfStatement() {
        /* 중첩 된 if-else if 문의 흐름을 이해하고 적용할 수 있다. *
         * 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D', 60점 미만이면 'F'를
         * 학점 등급으로 매겨본다. */
        /* 추가로 각 등급의 중간 점수(95, 85, 75, 65) 이상인 경우에는 '+'를 붙여준다.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수 입력 : ");
        int point = sc.nextInt();

        /* 학생의 등급을 저장하기 위한 변수 선언 및 초기화*/
        String grade = ""; //빈 문자열로 정의 (만약 String 변수를 쓰고 싶은데 아직 값이 없다면 "" 빈 문자열로 초기화

        if(point >= 90) {
            grade = "A";
            if(point >= 95) {
                grade += "+";
            }
        } else if (point >= 80) {
            grade = "B";
            if(point >= 85) {
                grade += "+";
            }
        } else if (point >= 70) {
            grade = "C";
            if(point >= 75) {
                grade += "+";
            }
        } else if (point >= 60) {
            grade = "D";
            if(point >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";
        }

        System.out.println(name + " 학생의 점수는 " + point + "점이고, 등급은 " + grade + " 입니다.");
    }

    public void improveNestedIfElseIfStatement() {
        /* 위의 메소드를 개선해본다. *

         * 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D', 60점 미만이면 'F'를
         * 학점 등급으로 매겨본다. */
        /* 추가로 각 등급의 중간 점수(95, 85, 75, 65) 이상인 경우에는 '+'를 붙여준다.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수 입력 : ");
        int point = sc.nextInt();

        /* 학생의 등급을 저장하기 위한 변수 선언 및 초기화*/
        String grade = ""; //빈 문자열로 정의 (만약 String 변수를 쓰고 싶은데 아직 값이 없다면 "" 빈 문자열로 초기화

        if(point >= 90) {
            grade = "A";

        } else if (point >= 80) {
            grade = "B";

        } else if (point >= 70) {
            grade = "C";

        } else if (point >= 60) {
            grade = "D";

        } else {
            grade = "F";
        }

        if(point % 10 >= 5 && point >= 60 || point == 100) {
            grade += "+";
        }

        System.out.println(name + " 학생의 점수는 " + point + "점이고, 등급은 " + grade + " 입니다.");
    }


}
