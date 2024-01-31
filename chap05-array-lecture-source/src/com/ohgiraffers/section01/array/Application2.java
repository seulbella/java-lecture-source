package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        /* 배열의 선언
        * 자료형[] 변수명;
        * 자료형 변수명[]
        * => 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것
        * */
        int[] iarr;
        double darr[];

        /* 선언한 레퍼런스 변수에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소 값을 반환하는 연산자이다.
        * 발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에
        * 참조 자료형(reference type) 이라고 한다. */
//        iarr = new int[ ];  // 할당할 크기는 반드시 지정 되어야 한다.
        iarr = new int[5];
        darr = new double[10];

        /* 선언과 할당은 동시에 할 수 있다. */
        int[] iarr2 = new int[5];
        double darr2[] = new double[10];


        /* heap 메모리는 이름으로 접근하는 것이 아니라 주소로 접근하는 영역이다.*/
//       stack에 저장 된 주소로 heap에 할당 된 배열을 찾아갈 수 있다.
        System.out.println("iarr : " + iarr);
        System.out.println("darr : " + darr);

        /* hashCode() : 객체의 주소 값을 10진수로 변환하여 생성한 객체의 고유한 정수 값을 반환하는 메소드 */
        System.out.println("iarr.hashCode() : " + iarr.hashCode());
        System.out.println("darr.hashCode() : " + darr.hashCode());

        /* 배열의 길이를 알 수 있는 기능을 필드로 제공한다. ('필드'에 대한 내용은 다음 시간에..) */
        /* String 클래스의 문자열의 길이는 메소드로 제공하므로 length() 로 사용하는 점에 유의한다. */
        System.out.println("iarr.length : " + iarr.length);
        System.out.println("darr.length : " + darr.length);

        /* 스캐너를 통해 입력 받은 정수로 배열의 길이를 지정하여 배열 할당 */
        Scanner sc = new Scanner(System.in);
        System.out.print("새로 할당할 배열의 길이 : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("arr의 hashCode : " + arr.hashCode());
        System.out.println("arr의 길이 : " + arr.length);

        /* 한 번 지정한 배열의 크기는 변경하지 못한다. */
        /* 새로운 배열을 생성하여 그 주소 값을 레퍼런스 변수에 덮어쓴다. */
        arr = new int[100];

        System.out.println("수정 된 arr의 hashCode : " + arr.hashCode());
        System.out.println("수정 된 arr의 길이 : " + arr.length);

        /* 한 번 할당 된 배열은 지울 수 없다.
        * 단, 참조되지 않는 배열은 일정 시간이 지난 후 heap의 old 영역으로 이동하여 GC(가비지 컬렉터)가 삭제 시킨다.
        * 한 번 찾아 갈 수 있는 주소 값을 잃어버린 배열은 다시 참조 불가능하다. */
        arr = null; /* 참조하는 주소 값이 없음을 나타냄 */

        /* java.lang.NullPointerException 발생 */
        /* 아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있는 경우 참조 연산자를 사용하면 발생하는 에러 */
        /* . : 참조형 변수의 주소 값을 찾아간다는 것 ex) arr.length -> arr 변수의 주소 값을 찾아서 그 변수의 길이를 알려줘! */
        System.out.println("수정 된 arr의 hashCode : " + arr.hashCode());
        System.out.println("수정 된 arr의 길이 : " + arr.length);
    }
}
