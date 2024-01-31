package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application1 {

    public static void main(String[] args) {
        /* Object 클래스의 toString() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(3, "삼국사기", "김부식", 70000);

        /* java.lang.Object 클래스의 toString()
        *  인스턴스가 생성 될 때 사용한 full class name과 @ 그리고 16진수 해시코드가 문자열로 반환된다.
        *  16진수 해시코드는 인스턴스의 주소를 가리키는 값으로 인스턴스마다 모두 다르게 반환된다. */
        System.out.println("book1.toString() : " + book1.toString());
        System.out.println("book1.toString() : " + book2.toString());
        System.out.println("book1.toString() : " + book3.toString());

        /* 레퍼런스 변수를 출력하면 자동으로 toString()을 호출한다.
        *  이런 편리한 점을 이용하여 toString() 메소드를 재정의해서 사용하게 된다. */
        System.out.println("book1 : " + book1);
        System.out.println("book2 : " + book2);
        System.out.println("book3 : " + book3);
    }
}
