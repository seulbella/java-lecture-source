package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    /* throws 구문 없이 오버라이딩 할 수 있다. */
//    @Override
//    public void method() {}

    /* 같은 예외를 throws 하는 구문으로 오버라이딩 할 수 있다. */
//    @Override
//    public void method() throws IOException {}

    /* 부모 예외 처리 클래스보다 상위의 예외로는 후손 클래스에서 오버라이딩 할 수 없다. */
//    @Override
//    public void method() throws Exception{}

    /* 부모 예외 처리 클래스보다 하위의 예외(더 구체적인 예외)인 경우에는 오버라이딩 할 수 있다. */
    @Override
    public void method() throws FileNotFoundException {}

}
