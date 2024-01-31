package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {

        /* AND, OR 연산의 특징 */

        /* 1. 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함 */
        /* 조건식 두 개가 모두 만족해야 true를 반환하지만 앞에서 미리 false가 나오게 되면
         * 뒤의 조건을 확인할 필요 없이 false를 반환한다.
         * 따라서 연산 횟수를 줄이기 위해서는 &&연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
         * */
        int num1 = 10;
        /* 앞에 조건이 false로 강제화 해 두고 && 뒤의 조건은 선치 증가로 값을 증가시킨 후 별 의미 없는 조건식으로 만들어놓았다.
         * num1 선치 증가 코드가 동작했다면 result1은 11일 것이고, 동작하지 않았다면 결과는 10일 것이다.
         * */
        int result1 = (false && ++num1 > 0)? num1 : num1; //false = num1 > 10
        System.out.println("&&실행 확인 : " + result1); //10
        /* 2. 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함 */
        /* 조건식 둘 중 하나라도 true를 반환하면 true를 반환하기 때문에 앞에서 미리 true가 나오게 되면
         * 뒤의 조건을 확인할 필요 없이 true를 반환한다.
         * 따라서 연산 횟수를 줄이기 위해서는 ||연산의 경우 앞에 true가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
         * */
        int num2 = 10;
        /* 앞에 조건을 true로 강제화 해 두고 || 뒤의 조건은 선치 증가로 값을 증가시킨 후 별 의미 없는 조건식으로 만들어놓았다.
         * num1 선치 증가 코드가 동작했다면 result2는 11일 것이고, 동작하지 않았다면 결과는 10일 것이다.
         * */
        int result2 = (true || ++num2 > 0)? num2 : num2;
        System.out.println("||실행 확인 : " + result2); //10

    }

}
