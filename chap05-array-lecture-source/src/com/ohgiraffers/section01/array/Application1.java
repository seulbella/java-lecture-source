package com.ohgiraffers.section01.array;

public class Application1 {

    public static void main(String[] args) {
        /* 배열의 선언 및 할당 */
        int[] arr = new int[5];

        /* 하나의 이름으로 관리 되는 연속 된 메모리 공간이고, 공간마다 찾아갈 수 있는 번호(인덱스)를 이용해 접근한다. */
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 60;

        /* 인덱스를 반복문으로 처리해서 값을 대입할 수 있다. */
        for(int i = 0, value = 0; i < arr.length; i++) { //length 값은 길이이기 때문에 인덱스 + 1 이다. 인덱스는 0부터 시작하는 컴퓨터 언어다.
            // value는 인덱스 내에서 생성한 또 다른 변수이다.
            arr[i] = value += 10;
        }

        /* 일반적인 변수처럼 사용할 수도 있다. */
        int sum = 0;

        sum += arr[0];
        sum += arr[1];
        sum += arr[2];
        sum += arr[3];
        sum += arr[4];

        sum = 0;
        /* 인덱스를 반복문으로 활용해서 처리 */
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum : " + sum);
    }
}

