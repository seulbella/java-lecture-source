package com.ohgiraffers.section02.functionalinterface;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.*;

public class Application1 {

    public static void main(String[] args) {

        /* 표준 함수적 인터페이스 중 Consumer에 대해 이해하고 사용할 수 있다. */
        /* Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다. (매개변수 소비자 역할) */

        /* 1. Consumer<T>#accept(T t) : void : 객체 T를 받아 소비한다. */
        Consumer<String> consumer = str -> System.out.println(str + "이(가) 입력됨");
        consumer.accept("hello world");

        /* 2. BiConsumer<T, U>#accept(T t, U u) : void : 객체 T, U를 받아 소비한다. */
        BiConsumer<String, LocalTime> biConsumer = (str1, time) -> System.out.println(str1 + "이(가) " + time + "에 입력됨");
        biConsumer.accept("hello world", LocalTime.now());

        /* 3. IntConsumer#accept(int value) : void : int값을 받아 소비한다. */
        IntConsumer intConsumer = num -> System.out.println("입력하신 정수의 제곱은 " + (num * num) + "입니다.");
        intConsumer.accept(15);

        /* 4. LongConsumer#accept(long value) : void : long값을 받아 소비한다. */
        LongConsumer longConsumer = num -> System.out.println("입력하신 정수는 " + num + "입니다.");
        longConsumer.accept(12345);

        /* 5. ObjIntConsumer<T>#accept(T t, int value) : void : 객체 T와 int값을 받아 소비한다. */
        ObjIntConsumer<java.util.Random> objIntConsumer =
                (random, bound) -> System.out.println("0 부터 " + bound + "전 까지의 난수 발생 : " + random.nextInt(bound));
        objIntConsumer.accept(new java.util.Random(), 10);

        /* 6. ObjLongConsumer<T>#accept(T t, long value) : void : 객체 T와 long값을 받아 소비한다. */
        ObjLongConsumer<LocalDate> objLongConsumer =
                (date, days) -> System.out.println(date + "의 " + days + "일 후의 날짜는 : " + date.plusDays(days));
        objLongConsumer.accept(LocalDate.now(), 10);

        /* 7. ObjDoubleConsumer<T>#accept(T t, double value) : void : 객체 T와 double값을 받아 소비한다. */
        ObjDoubleConsumer<StringBuilder> objDoubleConsumer =
                (sb, doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder("절대값 : "), -123.5);
    }
}
