package com.ohgiraffers.section04.sort.Arrays;

import java.util.Arrays;

public class Application5 {
    public static void main(String[] args) {
        /* 삽입정렬(insert sort)에 대해 이해하고 적용할 수 있다. */

        /* 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열과 비교하여 자신의 위치에 삽입하여 정렬
         * 배열의 두번째 데이터부터 연산을 시작한다.
         * 버블정렬의 비교횟수가 많은 단점을 개선하기 위해 고안된 정렬 방식이다.
         * */

        /* 초기 배열 선언 및 초기화 */
        int[] iarr = {2,5,4,6,1,3};

        int temp;
        int j = 0;

        /* 1번째 인덱스부터 마지막 인덱스까지의 반복문 */
        for(int i = 1; i < iarr.length; i++) {
            /* 기준 값 저장 */
            temp = iarr[i];

            /* 기준 값 앞 인덱스부터 하나씩 앞으로 줄어드는 반복문 */
            for(j = i - 1; j >= 0 && temp < iarr[j]; j--) {
                /* 기준 값보다 비교 값이 크면 한 칸씩 뒤로 */
                iarr[j+1] = iarr[j];
            }

            iarr[j+1] = temp;

            System.out.println(i + "번째 인덱스까지 정렬 완료 : " + Arrays.toString(iarr));
            System.out.println();
        }

        /* 값 출력용 반복문 */
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
    }
}
