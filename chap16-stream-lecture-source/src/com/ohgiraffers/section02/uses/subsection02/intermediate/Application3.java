package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {

    public static void main(String[] args) {
        /* 스트림의 중계 연산 중 하나인 flatMap에 대해 이해하고 사용할 수 있다.
        *  중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어 준다. => 플래트닝(flattening)
        * */

        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                Arrays.asList("java", "spring", "springboot")
        );

        System.out.println(list);

        List<String> flatList = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("flatList = " + flatList);
    }
}
