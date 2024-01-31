package com.ohgiraffers.section04.sort.Arrays;

import java.util.Arrays;

public class Application4 {

    public static void main(String[] args) {
        /* 버블 정렬(bubble sort)에 대해 이해하고 적용할 수 있다. */

        /* 인접한 두 개의 원소를 검사하여 정렬하는 방법
         * 구현이 쉽다는 장점이 있으며, 이미 정렬된 데이터를 정렬할 때 가장 빠르다.
         * 하지만 다른 정렬에 비해 정렬 속도가 느린 편이다.
         * */

        /* 초기 배열 선언 및 초기화 */
        int[] iarr = {2,5,4,6,1,3};

        int temp;

        /* 마지막 인덱스부터 앞으로 기준 인덱스를 옮겨가는 반복문 */
        for(int i = iarr.length - 1; i >= 0; i--){
            /* 기준 인덱스까지 진행하는 반복문 */
            for(int j = 0; j < i; j++) {

                /* 앞의 값이 더 크면 변경 */
                if(iarr[j] > iarr[j + 1]) {
                    temp = iarr[j];
                    iarr[j] = iarr[j + 1];
                    iarr[j+1] = temp;
                }

            }

            System.out.println(i + "번째 인덱스 정렬 완료 : " + Arrays.toString(iarr));
            System.out.println();
        }

        /* 값 출력용 반복문 */
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
    }

}
