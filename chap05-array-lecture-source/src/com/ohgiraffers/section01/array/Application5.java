package com.ohgiraffers.section01.array;

public class Application5 {

    public static void main(String[] args) {
        /* 랜덤한 카드 한 장 뽑아서 출력해보기 */
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        /* 배열 인덱스 범위의 난수 발생 시키기 */
        int randomShapeIndex = (int) (Math.random() * shapes.length);
        int randomCardNumberIndex = (int) (Math.random() * cardNumbers.length);

        System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " + cardNumbers[randomShapeIndex]  + " 카드 입니다.");
    }

}
