package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

    public static void main(String[] args) {
        /* FileOutputStream을 이해하고 사용할 수 있다. */

        /* FileNotFoundException 핸들링이 필요하다.
        *  경로 문제 없이 파일이 존재 하지 않을 경우에는 자동으로 파일이 생성 되지만
        *  존재하지 않는 경로가 포함 된 경우에는 FileNotFoundException이 발생한다.
        *  파일명만 전달하는 생성자로 스트림을 생성하면 파일을 덮어쓰지만,
        *  두번째 인자로 true를 추가하면 이어쓰기 처리로 변경 된다. */
        try (FileOutputStream fout = new FileOutputStream("testOutputStream.txt", true)) {

            fout.write(97);

            /* byte 배열을 이용해서 한 번에 기록할 수 있다. */
            /* 10은 개행처리 문자이다. */
            byte[] bar = new byte[] {98, 99, 100, 101, 102, 10};
            fout.write(bar);

            /* 1번 인덱스부터 3의 길이만큼 파일에 출력 */
            fout.write(bar, 1, 3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
