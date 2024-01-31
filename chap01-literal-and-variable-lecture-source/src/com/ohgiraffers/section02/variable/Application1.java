package com.ohgiraffers.section02.variable;

public class Application1 {

    public static void main(String[] args) {
        /* 변수를 선언하고 값을 대입하여 사용할 수 있다. */

        /* 1. 변수 선언 (자료형에 변수명을 선언하는 것) */
        /* 1-1. 변수를 선언하는 방법
        *       자료형 변수명; */

        /* 1-1-1. 숫자를 취급하는 자료형 */
        /* 정수를 취급하는 자료형은 4가지가 있다. */
        byte bnum;
        short snum;
        int inum;
        long lnum;

        /* 실수를 취급하는 자료형은 2가지가 있다. */
        float fnum;
        double dnum; // 취급하는 소수점 자리가 더 늘어난다

        /* 1-1-2. 문자를 취급하는 자료형 */
        char ch;
        char ch2;

        /* 1-1-3. 논리 값을 취급하는 자료형 */
        boolean isTrue;

        /* 1-1-4. 문자열을 취급하는 자료형(기본자료형이 아닌 참조자료형) */
        String str; // 예약어가 아니기 때문에 첫문자가 대문자로, class 형태를 지님

        /* 2. 변수에 값을 대입한다. (값 대입 및 초기화) */
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L ; //long type으로 바꾸려면 'L' 옆에 삽입(?) /소문자&대문자 다 됨
        fnum = 4.0f; //double 이라는 형태를 float형태에 담으려면 'f' 옆에 삽입(?) /소문자만
        dnum = 8.0;
        ch = 'a';
        ch2 = 97; // 'a'는 아스키 코드로 97이라는 숫자이다. 그래서 a로 변환되어 출력된다.
        isTrue = true;
        isTrue = false;
        str = "안녕하세요";

        /* 선언과 동시에 초기화 할 수 있다. */
        int point = 100;
        int bonus = 10;

        System.out.println("===== 변수에 저장 된 값 출력 =====");
        System.out.println("bnum : " + bnum);
        System.out.println("snum : " + snum);
        System.out.println("inum : " + inum);
        System.out.println("lnum : " + lnum);
        System.out.println("fnum : " + fnum);
        System.out.println("dnum : " + dnum);
        System.out.println("ch : " + ch);
        System.out.println("ch2 : " + ch2);
        System.out.println("str : " + str);

        /* 대입 연산자의 왼쪽과 오른쪽에 변수 사용하기 (=) */
        /* 대입 연산자의 왼쪽은 공간이라는 의미, 오른쪽은 값이라는 의미이다. */
        point = point + 100;
        System.out.println("point : " + point);
    }
}
