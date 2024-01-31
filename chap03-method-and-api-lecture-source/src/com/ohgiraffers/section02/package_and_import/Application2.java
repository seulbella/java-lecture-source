package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator; //위치 중요 (10줄 참조)
import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application2 {

    public static void main(String[] args) {
        /* 임포트에 대해 이해할 수 있다.
         * 매번 풀클래스명을 작성하기는 번거로우므로 패키지명을 생략하고 사용할 수 있도록 import 구문을 사용한다.
         * import는 패키지 선언문과 class 선언문 사이에 작성하며 어떤 패키지 내에 있는 클래스를 사용할 것인지에 대해
         * 미리 선언하는 효과를 가진다. */

        /* 1. non-static 메소즈 호출 */
        Calculator calculator = new Calculator();
        int min = calculator.minNumberOf(50, 60);
        System.out.println("50과 60 중 작은 값은 ? " + min);

        /* 2. static 메소드 호출 */
        int max = Calculator.maxNumberOf(50,60);
        /* static 메소드를 호출할 때 import static을 하면 클래스명도 생략하고 호출할 수 있다. */
        int max2 = maxNumberOf(50,60);

    }

}
