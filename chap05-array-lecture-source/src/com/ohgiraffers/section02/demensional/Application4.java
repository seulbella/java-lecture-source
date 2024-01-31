package com.ohgiraffers.section02.demensional;

public class Application4 {

    public static void main(String[] args) {
        /* 2차원 배열의 선언과 할당 및 초기화를 동시에 진행할 수 있다. */

        /* 정변 배열 */
        int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13 ,14 ,15}};

        /* 변수의 값 찾기 */
        // iarr[1][2] = 8 (인덱스 값 때문에)

        /* 반복문을 이용한 값 출력 */
        for(int i = 0; i < iarr.length; i++) {
            for(int j = 0; j < iarr[i].length; j++) {
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }

        /* 가변 배열 */
        int[][] iarr2 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9, 10}};

        /* 반복문을 이용한 값 출력*/
        for(int i = 0; i < iarr2.length; i++) {
            for(int j = 0; j < iarr2[i].length; j++) {
                System.out.print(iarr2[i][j] + " ");
            }
            System.out.println();
        }

        /* 미리 할당 된 배열을 이용한 방식 */
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[][] iarr3 = {arr1, arr2};

        /* 반복문을 이용한 값 출력 */
        for(int i = 0; i < iarr3.length; i++) {
            for(int j = 0; j < iarr3[i].length; j++) {
                System.out.print(iarr3[i][j] + " ");
            }
            System.out.println();
        }
    }

}
