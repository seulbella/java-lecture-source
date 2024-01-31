package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /* try with resource 구문의 문법을 이해하고 사용할 수 있다.
         * JDK 1.7에서 추가 된 문법으로 close 해야하는 인스턴스의 경우 try 옆 괄호 안에 생성하면
         * 해당 블럭이 완료 될 때 자동으로 close 처리가 된다. */

        try (BufferedReader in = new BufferedReader(new FileReader("test.dat"))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
