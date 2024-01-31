package com.ohgiraffers.level02.normal;

import java.util.Scanner;
public class RandomMaker {

    //첫 번째 인자의 최소값 부터 두 번쨰 인자까지 범위의 난수를 출력 (randomNumber 호출)
    //모든 함수는 보편화 시키는 값을 부여하는 게 좋다.
    public static int randomNumber(int min, int max) {
        return (int)(Math.random() * (max-min+1)) + min;
    }

    public static int randomNumber2(int min, int max) {
        return (int)(Math.random() * (max-min+1)) + min;
    }

    //인자로 전달한 정수 길이의 랜덤한 문자열을 출력함 (randomUpperAlphabet 호출)
    // 반복문 들어가야 함


    //가위, 바위, 보 중 한 가지를 출력함 (rockPaperScissors 호출)
//    public static String rockPaperScissors(){
//
//        Scanner sc = new Scanner(System.in);
//        return sc.nextBoolean();
//    }

    //앞면, 뒷면 중 한 가지를 출력함 (tossCoin 호출)

}
