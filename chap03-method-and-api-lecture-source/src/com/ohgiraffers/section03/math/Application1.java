package com.ohgiraffers.section03.math;

public class Application1 {

    public static void main(String[] args) {
        /* Math 클래스에서 제공하는 static 메소드를 호출 할 수 있다. */

        /* java.lang.Math
        * 수학에서 자주 사용 되는 상수들과 함수들을 미리 구현해 놓은 클래스로 모든 메소드는 static 메소드로 작성 되어 있다. */

        /* 1. 절대 값 출력
        * 풀 클래스 이름 작성 */
        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));

        /* import 해서 작성
        * java.lang 패키지 하위의 기능은 매우 자주 사용 되는 기능들이 있기 때문에
        * 컴파일러가 자동으로 import java.lang.*; 코드를 추가한다.
        * 따라서 별도의 import가 필요 없다.*/
        System.out.println("-7의 절대값 : " + (Math.abs(-1.25)));

        /* 2. 최대값, 최소값 출력 */
        System.out.println("10과 20 중 더 작은 값? " + Math.min(10,20));
        System.out.println("10과 20 중 더 큰 값? " + Math.max(10,20));

        /* 3. 원주율 */
        System.out.println("원주율 : " + Math.PI);

        /* 4. 난수(랜덤값) 출력 */
        /* 0부터 1미만의 실수 형태의 난수를 발생시킨다.
        * 호출 시 마다 다른 값을 가진다. */
        System.out.println("난수 발생 : " + Math.random()); //여러번 호출했을 때 값이 바뀜,
        
    }
}
