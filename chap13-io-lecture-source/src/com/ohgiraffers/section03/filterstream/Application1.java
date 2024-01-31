package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {

    public static void main(String[] args) {
        /* 필터 스트림(보조 스트림) : 기반 스트림에 추가 되어 성능 향상, 기능 추가
        *  BufferedReader/Writer : 버퍼 공간을 이용하여 데이터를 쌓아두었다가 입/출력하므로써 입출력 횟수를 줄이고 성능을 향상시킴
        * */

        BufferedWriter bw = null;

        try {
            /* 보조 스트림 객체를 생성할 때에는 생성자의 인자로 기반 스트림을 전달한다. */
            bw = new BufferedWriter(new FileWriter("testBuffered.txt"));

            bw.write("안녕하세요\n");
            bw.write("반갑습니다\n");

            /* 버퍼를 이용하는 경우 버퍼가 가득차면 자동으로 내보내기를 하지만 버퍼가 가득 차지 않은 상태에서는
            *  강제로 내보내기를 해야 한다.
            *  flush()라는 메소드를 사용하면 내보내기 처리가 된다. */
//            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bw != null) {
                try {
                    /* close()를 호출하면 내부적으로 flush()를 실행하고 나서 자원을 반납한다. */
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader("testBuffered.txt"))) {

            /* readLine() 메소드 기능을 추가로 제공한다.
            *  버퍼의 한 줄을 읽어와서 문자열로 반환하며 더 이상 읽어올 값이 없을 경우 null이 반환 된다. */
            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }
}
