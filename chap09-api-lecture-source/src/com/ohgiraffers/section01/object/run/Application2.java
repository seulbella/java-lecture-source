package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {

    public static void main(String[] args) {
        /* Object 클래스의 equals() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        /* java.lang.Object의 equals() 메소드
        *  매개변수로 전달 받은 인스턴스와 == 연산하여 true or false 반환 (동일 인스턴스인지 확인)
        *  동일 객체 : 주소가 동일한 인스턴스
        *  동등 객체 : 주소가 다르더라도 필드 값이 동일한 인스턴스
        *
        *  Book 클래스에 equals 메소드를 동등 객체 판단 코드로 오버라이딩 하면 equals의 결과가 true로 변경 된다. */
        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));
        System.out.println("두 인스턴스의 equals() 연산 비교 : " + (book1.equals(book2)));
    }
}
