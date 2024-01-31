package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /* Stream에 대해 이해하고 사용할 수 있다. */
        List<String> stringList = new ArrayList<>(Arrays.asList("hello","world","stream"));

        /* 이전에 스트림을 이용하지 않던 방식 */
        System.out.println("foreach =====");
        for(String str : stringList) {
            System.out.println(str);
        }

        /* 스트림을 이용한 방식 */
        System.out.println("stream =====");
        stringList.forEach(System.out::println);
    }
}
