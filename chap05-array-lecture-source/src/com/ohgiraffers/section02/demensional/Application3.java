package com.ohgiraffers.section02.demensional;

public class Application3 {

    public static void main(String[] args) {
        /* 2차원 가변 배열을 선언 및 할당하여 사용할 수 있다. */

        /* 가변 배열의 경우 각 인덱스별 배열을 따로 할당해야 한다. */
        int[][] iarr = new int[3][];

        System.out.println(iarr); //stack의 레퍼런스 배열 참조하는 주소값
        System.out.println(iarr[0]); //heap의 1차원 배열 참조하는 주소값(현재는 할당하지 않아 null)
//        System.out.println(iarr[0][0]); //존재하지 않으므로 java.lang.NullPointerException 발생

        iarr[0] = new int[3];
//        iarr[1] = new char[2]; //자료형이 다른 배열은 하나로 묶어서 관리할 수 없음
        iarr[1] = new int[2];

        int[] arr = new int[5];
        iarr[2] = arr;          //미리 할당해둔 배열을 이용할 수 있음

        /* 가변 배열도 정변 배열에서 사용했던 것과 동일하게 반복문을 이용해서 값을 대입하고 출력할 수 있다. */
        int value = 1;

        for(int i = 0; i < iarr.length; i++) {
            for(int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = value++;
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
