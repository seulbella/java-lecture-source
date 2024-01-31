package com.ohgiraffers.section04.sort.Arrays;

import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {
        /* 선택 정렬(select sort)에 대해 이해하고 적용할 수 있다. */

        /* 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
         * 데이터의 양이 적을 때 좋은 성능을 나타낸다(교환 회수가 적음)
         * 하지만 배열을 전부 탐색하여 최소값을 찾아야 하기 때문에 100개 이상의 자료에서는 급격하게 속도가 저하된다.
         * */

        /* 초기 배열 선언 및 초기화 */
        int[] iarr = {2,5,4,6,1,3};

        int min; 		//최소값을 가진 데이터의 인덱스 저장 변수
        int temp;

		 /* 배열 첫 인덱스부터 마지막 전 인덱스까지 반복하는 반복문
           마지막 인덱스는 자연스럽게 정렬 되므로 처리할 필요가 없음 */
        for(int i = 0; i < iarr.length - 1; i++){
            min = i;
            /* 해당 인덱스 다음 인덱스부터 끝까지 반복을 한다 */
            for(int j = i + 1; j < iarr.length; j++){

                /* i 의 인덱스 보다 작은 값이 있는 인덱스의 경우 min을 변경한다 */
                if(iarr[min] > iarr[j]){
                    min = j; //최소값이 있는 인덱스의 위치를 기억하기 위한 변수
                }
            }

            /* 작은 값을 시작 인덱스와 교환한다 */
            temp = iarr[min];
            iarr[min] = iarr[i];
            iarr[i] = temp;

            System.out.println(i + "번 인덱스 정렬 완료 : " + Arrays.toString(iarr));
            System.out.println();
        }

        /* 값 출력용 반복문 */
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
    }

}
