package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application3 {

    public static void main(String[] args) {
        /* DataInputStream/DataOutputStream*/
        /* 데이터 입출력 보조 스트림을 이해하고 사용할 수 있다. */

        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"))) {

            dout.writeUTF("홍길동");
            dout.writeInt(95);
            dout.writeChar('A');

            dout.writeUTF("이순신");
            dout.writeInt(87);
            dout.writeChar('B');

            dout.writeUTF("김철수");
            dout.writeInt(73);
            dout.writeChar('C');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(DataInputStream din = new DataInputStream(new FileInputStream("score.txt"))) {

            /* 파일에 기록한 순서대로 읽어오지 않는 경우 에러가 발생하거나 의미 없는 데이터를 읽어오게 된다. */
            while (true) {
                /* read자료형() 메소드는 파일에서 더 이상 읽어올 값이 없는 경우 EOFException(End of File)을 발생시킨다.
                *  catch 블럭에 해당 exception 핸들링 코드를 추가한다. */
                System.out.println(din.readUTF() + ", " + din.readInt() + ", " + din.readChar());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (EOFException e) { //IOException의 후손이므로 IOException 블럭보다 위에 작성 되어야 한다.
            System.out.println("파일 읽기 완료!");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
