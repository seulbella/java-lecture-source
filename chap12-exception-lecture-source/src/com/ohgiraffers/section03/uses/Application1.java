package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 예외 발생 오류를 확인하는 것이기 때문에 해당 클래스는 런타임 오류가 발생함 */
public class Application1 {
    public static void main(String[] args) {
        /* 예외 처리를 많이 사용하는 io 패키지에서 예외 처리를 사용하는 구문을 이해할 수 있다. */

        /* 아직 IO는 학습하지 않았으므로 IO의 문법보다 try catch 블럭의 실제 사용과 흐름에 집중한다. */

        BufferedReader in = null;

        try {
            /* FileReader 클래스의 생성자를 확인하면 throws FileNotFoundException으로 되어 있으므로
            *  사용하는 쪽에서 반드시 예외 처리를 해야 한다. -> try catch 블럭으로 처리 */
            in = new BufferedReader(new FileReader("test.dat"));

            String s;

            /* readLine() 메소드를 확인하면 throws IOException으로 되어 있으므로
            *  해당 예외에 대해서도 예외 처리를 해야 한다. */
            while((s = in.readLine()) != null) {
                System.out.println(s);
            }

            /* IOException은 입출력에 관해 추상화 된 예외 클래스로 FileNotFouondException도 IOException의 후손이다. */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            /* 보통 io에서 사용한 자원을 반납할 목적으로 사용한다. */
            try {
                /* close() 메소드는 입출력에 사용한 스트림을 닫아주는 메소드로 throws IOException 인 메소드이기 때문에
                *  finally 블럭 안에 다시 예외 처리를 중첩으로 해 주어야 한다. */

                /* NullPointerException은 RuntimeException의 후손으로 예외 처리가 강제화 되어 있지 않다. (UncheckedException)
                * 대신 코드를 통해 확인하고 수행하도록 처리하면 되는데 여기에서는 null 여부를 확인 후 수행 하도록 한다.
                * */
                if(in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
