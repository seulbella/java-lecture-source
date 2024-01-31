package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {

    public static void main(String[] args) {
    /* 스트림의 최종 연산 중 하나인 reduce에 대해 이해하고 사용할 수 있다.
    *  이전 연산에서 반환한 값이 다음 연산의 첫 번째 인자로 전달 되는 연산 */

        OptionalInt reduceOneParam = IntStream.range(1,10)
                .reduce((a, b) -> {
                    System.out.println("a : " + a + ", b : " + b);
                    return Integer.sum(a, b);
                });

        System.out.println("reducerOneParam = " + reduceOneParam);

        /* reduce에 인자를 2개 전달할 때에는 첫 번째 인자가 초기값으로 가능하며
        *  reduce의 결과 값이 반드시 존재하므로 OptionalInt 타입이 아닌 int 타입이 반환 값으로 설정 되어 있다. */
        int reducerTwoParam = IntStream.range(1, 10)
                .reduce(100, Integer::sum);

        System.out.println("reduceTwoParam=" + reducerTwoParam);
    }

}
