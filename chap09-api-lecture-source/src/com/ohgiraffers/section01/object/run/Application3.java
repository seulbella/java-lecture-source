package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application3 {

    public static void main(String[] args) {
        /* Object 클래스의 hashCode() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다.
        *  Object 클래스의 명세에 작성 된 일반 규약에 따르면 equals() 재정의 시 반드시 hashCode()를
        *  재정의 하도록 되어 있다. 만약 hashCode()를 재정의하지 않으면 같은 값을 가지는 동등 객체는 같은 해시코드 값을
        *  가져야 한다는 규약에 위반 된다. (강제성은 없지만 규약을 따르는 것이 좋다.) */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1.hashCode() : " + book1.hashCode());
        System.out.println("book2.hashCode() : " + book2.hashCode());

    }
}
