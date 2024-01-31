package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /* FileReader를 이해하고 사용할 수 있다.
        * FileInputStream과 사용 방법은 거의 동일하나 1byte 단위가 아니라 character 단위로 읽어온다.
        * (한글 값 등도 모두 문자 단위로 처리)
        * */

        /* try with resource 문법으로 작성할 경우 블럭이 종료 되면 자동으로 자원이 반납 된다. (fr.close() 동작)*/
        try (FileReader fr = new FileReader("testReader.txt")) {
//            int value;

//            while ((value = fr.read()) != -1) {
//                System.out.println((char)value);
//            }

            /* byte 배열이 아닌 character 배열을 이용해서 한 번에 읽어올 수 있다. */
            /* 배열의 크기가 읽어올 문자의 개수보다 크므로 나머지 배열 공간은 빈 상태로 처리 된다. */
            char[] carr = new char[(int)new File("testReader.txt").length()];

            fr.read(carr);

            for(char c : carr) {
                System.out.print(c);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
