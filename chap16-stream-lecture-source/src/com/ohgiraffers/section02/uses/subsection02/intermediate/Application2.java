package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {

    public static void main(String[] args) {
        /* 스트림의 중계 연산 중 하나인 map에 대해 이해하고 사용할 수 있다.
        * map은 스트림에 들어 있는 데이터를 특정 람다식을 통해 가공하고 새로운 스트림에 담아주는 역할을 한다.
        * 중간 연산은 여러 번 수행 되어도 문제 없다. */
        IntStream intStream = IntStream.range(1, 10);

        intStream.filter(i -> i % 2 == 0).map(i -> i * 5).forEach(System.out::println);
    }
}
