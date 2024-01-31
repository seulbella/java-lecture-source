package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {
        /* 기본 타입 스트림 생성에 대해 이해하고 사용할 수 있다. */

        /* range(시작값, 종료값) : 시작 값부터 1씩 증가하는 숫자를 종료 값 전까지 스트림으로 생성
        *  rangeClosed(시작값, 종료값) : 시작 값부터 1씩 증가하는 숫자를 종료 값 까지 스트림으로 생성 */
        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5,10);
        longStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        /* Wrapper 클래스 자료형의 스트림으로 변환이 필요한 경우 boxing 할 수 있다.
        *  doubles(갯수) : 난수를 활용하여 DoubleStream을 전달한 개수만큼 생성하여 반환한다.
        *  boxed() : 기본 타입 스트림인 XXXStream을 박싱하여 Wrapper 타입의 Stream<XXX>로 반환한다. */
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        /* 문자열을 IntStream으로 변환 할 수 있다. */
        IntStream helloworldChars = "hello world".chars();
        helloworldChars.forEach(value -> System.out.print(value + " "));
        System.out.println();

        /* 문자열을 split하여 Stream으로 생성할 수 있다. */
        Stream<String> splitStream = Pattern.compile(", ").splitAsStream("html, css, javascript");
        splitStream.forEach(System.out::println);

        /* Stream.of() 를 이용한 생성 */
        Stream<String> stringStream1 = Stream.of("java","mysql","jdbc");
        Stream<String> stringStream2 = Stream.of("html", "css", "javascript");


        /* 스트림은 1회성으로 사용 가능하며 이미 열린 스트림은 재사용이 불가능하다.
        *  재사용할 경우 java.lang.IllegalStateException: stream has already been operated upon or closed 발생 */
//        stringStream1.forEach((System.out::println));
//        stringStream2.forEach((System.out::println));

        /* concat()을 이용하여 두 개의 스트림을 동일 타입 스트림으로 합칠 수 있다. */
        Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);
        concatStream.forEach(v -> System.out.print(v + " "));


    }

}
