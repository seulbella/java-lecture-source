package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {
        /* 스트림의 병렬 처리에 대해 이해할 수 있다. */
        List<String> stringList = new ArrayList<>(Arrays.asList("java", "mysql", "jdbc", "html", "css"));

        /* 모든 작업은 기본적으로 main 스레드에서 일어난다. */
        System.out.println("foreach =====");
        for(String s : stringList) {
            System.out.println(s + " : " + Thread.currentThread().getName());
        }

        /* 일반적인 스트림도 main 스레드에서 작업을 수행한다. */
        System.out.println("normal stream =====");
        stringList.forEach(Application2::print);
        stringList.forEach(Application2::print);

        /* 병렬 스트림은 자동으로 병렬처리가 되고 성능상 유리하다.
        *  스트림을 활용하면 병렬 처리가 손쉽다는 것이 장점 중 하나이다. */
        System.out.println("parallel stream =====");
        stringList.parallelStream().forEach(Application2::print);
        stringList.parallelStream().forEach(Application2::print);
    }

    private static void print(String str){
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
