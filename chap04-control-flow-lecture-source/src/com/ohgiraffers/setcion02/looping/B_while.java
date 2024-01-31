package com.ohgiraffers.setcion02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement() {
        /* while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 1부터 10까지 1씩 증가시키면서 10번 출력하는 기본 반복문 */

        int i = 1; //초기식
        while (i <= 10) { //조건식

            System.out.print(i + " ");
            i++; //증감식

        }
    }

    public void testWhileExample1() {
        /* 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력하기 */
        /* charAt(index) : 문자 하나씩 출력할 때 사용 */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        /* while 문 */
        int index = 0;
        while (index < str.length()) {
            char ch = str.charAt(index); //문자열에서 인덱스에 해당하는 문자를 char형으로 반환
            System.out.println(index + " : " + ch);
            index++;
        }

        /* for문 */
        for (int i = 0; i < str.length(); i++) { // <=로 한번 바꿔서 실행해보기
            char ch = str.charAt(i);
            System.out.println(i + " : " + ch);
        }

    }

    /* index 는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다.*/
    /* 존재하지 않는 인덱스에 접근할 경우 java.lang.StringIndexOutOfBoundsException 이 발생한다. */
    /* 문자 길이는 1부터 시작하지만 index는 0부터 시작하기 때문에 i <= str.length(); 로 for문 조건문을 작성할 경우
    * 런타임 오류가 발생한다. */

    public void testWhileExample2() {
        /* 정수 하나를 입력 받아 1부터 입력 받은 정수까지의 합계 구하기 */
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 하나 입력 : ");
        int num = sc.nextInt();
        /* while문으로 작성*/
        int sum = 0;
        int i = 1;
        while(i <= num){
            sum += i++;
        }

        System.out.println("1부터 입력 받은 정수 " + num + "까지의 합은 " + sum + "입니다.");

    }

    public void testWhileExample3(){
        /* 중첩 while문을 이용한 구구단 출력 */

        int dan =2; //외부 while문 초기식
        while(dan < 10) {

            int su = 1; //내부 while문 초기식 - 만약 while문 바깥에 존재하면, 메소드가 구동할 때 su가 바깥에서 정의되어 있어 초기화 하지 못하므로 초기화 시키고 다시 구동하기 위해서는 반드시 안에 써져야 한다.
            while(su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
                su++; //내부 while문 증감식
            }
            dan++; //외부 while문 증감식

        }
    }
}
