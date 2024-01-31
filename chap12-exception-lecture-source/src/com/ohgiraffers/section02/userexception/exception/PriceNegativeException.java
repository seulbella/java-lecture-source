package com.ohgiraffers.section02.userexception.exception;

/* 사용자 정의 예외 클래스를 만들기 위해서는 Exception 클래스를 상속 받는다.
*  경우에 따라서는 더 상위 타입인 Throwable 클래스나 하위 타입인 RuntimeException 클래스를 상속 받기도 한다.
*  만약 RuntimeException 클래스를 상속할 경우에는 예외 처리가 강제화 되지는 않는다. */
public class PriceNegativeException extends NegativeException {

    public PriceNegativeException(String message) {
        /* 상위 타입으로 전달 된 메세지는 Throwable의 detailMessage라는 필드에 설정된다. */
        super(message);
    }


}
