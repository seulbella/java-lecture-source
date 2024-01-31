package com.ohgiraffers.section03.references;

import java.util.function.Function;

public class Application2 {

    public static void main(String[] args) {
        /* 생성자 메소드 참조를 이해하고 사용할 수 있다. */
        Function<String, Member> function = Member::new;
        Member member1 = function.apply("Lambda A");
        Member member2 = function.apply("Lambda B");
        System.out.println(member1);
        System.out.println(member2);
    }
}
