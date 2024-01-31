package com.ohgiraffers.section03.copy;

public class Application4 {

    public static void main(String[] args) {
        /* 향상 된 for문을 이해하고 활용할 수 있다. */

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

        /* for문을 이용해 인덱스에 값을 10씩 누적 증가 */
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] += 10;
        }

        /* 출력하기 */
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        //region
        /* 향상 된 for문 : jdk 1.5 버전부터 추가 된 문법
        * 배열 인덱스에 차례로 접근해서 임시로 사용할 변수에 값을 담고 반복문을 실행한다. */
        /* 요약 : 값 변경이 되지 않는 변수이기 때문에 1.1은 구동되지 못하지만
        * 사용할 변수를 추출할 때는 유용하게 사용할 수 있다. (코드가 간결하기 때문) */

        /* 향상 된 for문은 배열 인덱스에 차례로 접근할 때는 편하게 사용할 수 있지만 값을 변경할 수는 없다.
         * 인덱스에 접근해서 값을 변경한 것이 아니라 꺼낸 값을 복사해서 사용하고 있기 때문이다.
         * 대신 변경이 아니라 사용이 목적일 경우 더 편리하게 사용할 수 있다. */
        //endregion
        /* 1-1. 인덱스에 값을 10씩 누적 증가*/
        for(int i : arr2) { // int i 는 arr2들의 변수를 새로운 변수 공간에 옮겨 담기만할 뿐, 메소드에서
            // i라는 변수명을 명명한 것이다. 그래서 값 변경 불가(x) int 1는 이 반복문이 돌 때만 유효한 변수이다.
            i += 10;
        }

        /* 2-1. 출력하기 */
        for(int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        double[] darr = {1.0, 2.0, 3.0, 4.0, 5.0};
        for(double num : darr) { //num : darr의 하나 하나의 변수 값에 접근할 임시 변수
            System.out.print(num + " ");
        }
    }

}
