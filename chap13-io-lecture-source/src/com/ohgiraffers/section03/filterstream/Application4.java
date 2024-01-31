package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application4 {

    public static void main(String[] args) {
        /* ObjectInputStream/ObjectOutputStream
        * 객체 단위 입출력 보조 스트림을 이해하고 사용할 수 있다. */

        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong123@ohgiraffers.com", 25, '남', 1235.7),
                new MemberDTO("user02", "pass02", "유관순", "yoo123@ohgiraffers.com", 16, '여', 1250.7),
                new MemberDTO("user03", "pass03", "이순신", "lee123@ohgiraffers.com", 40, '남', 1270.7),
        };

        try(ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("testObjectStream.txt"))) {

            for(int i = 0; i < outputMembers.length; i++) {
                objOut.writeObject(outputMembers[i]);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* DTO 클래스에 직렬화 처리를 하지 않았다면 실행 시 java.io.NotSerializableException이 발생한다.
        *  직렬화란?
        *  자바 시스템 내부에서 사용 되는 객체 또는 데이터를 외부에도 사용할 수 있도록 byte 형태로
        *  데이터를 변환하는 기술을 말한다.
        *  반대로 바이트로 변환 된 데이터를 다시 객체로 변환하는 기술을 역직렬화라고 한다.
        * */

        MemberDTO[] inputMembers = new MemberDTO[3];

        try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("testObjectStream.txt"))){

            /* readObject() 메소드는 역직렬화 해서 가져온 데이터를 객체화 할 때 해당하는 클래스가 없을 가능성이 있으므로
            *  ClassNotFoundException 핸들링이 필요하다. */
            for(int i = 0; i < inputMembers.length; i++) {
                inputMembers[i] = (MemberDTO) objIn.readObject();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(MemberDTO member : inputMembers) {
            System.out.println(member);
        }
    }
}
