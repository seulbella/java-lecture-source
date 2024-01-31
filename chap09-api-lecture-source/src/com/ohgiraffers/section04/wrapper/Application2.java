package com.ohgiraffers.section04.wrapper;

public class Application2 {

    public static void main(String[] args) {
        /* parsing : 문자열 값을 기본 자료형 값으로 변경하는 것을 parsing 이라고 한다. */
        /* 파싱처리는 브라우저에서 값을 입력 받으면 보통 문자열로 처리 되는데, 이를 기본 자료형 값으로 전환해서
        *  서버에 저장해야 할 때 주로 사용한다. */

        /* 해당 자료형으로 parsing 될 수 없는 문자열이 제공 되면 Exception 발생한다. */
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong(("8"));
        float f = Float.parseFloat("4.0");
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("ture");
        /* Character 는 parsing 기능을 제공하지 않는다. */
        char c = "abc".charAt(0);
    }
}
