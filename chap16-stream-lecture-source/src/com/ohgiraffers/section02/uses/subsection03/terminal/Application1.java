package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {

    public static void main(String[] args) {
        /* 스트림의 최종 연산 중 하나인 calculating 에 대해 이해하고 사용할 수 있다. */
        long count = IntStream.rangeClosed(1, 10).count();
        long sum = IntStream.rangeClosed(1, 10).sum();

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        /* 결과 없음을 나타내야하는 명확한 요구가 있는 메소드 반환 형식으로 OptionalInt 사용 */

        OptionalInt max = IntStream.rangeClosed(1, 10).max();
        OptionalInt min = IntStream.rangeClosed(1, 10).min();

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int oddSum = IntStream.rangeClosed(1,10)
                .filter(i -> i % 2 == 1)
                .sum();

        System.out.println("oddSum : " + oddSum);

    }


}
