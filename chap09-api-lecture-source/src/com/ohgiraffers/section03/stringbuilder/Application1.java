package com.ohgiraffers.section03.stringbuilder;

public class Application1 {

    public static void main(String[] args) {
        /* String과 StringBuilder */
        /* String은 수정 될 때마다 새로운 객체를 할당해야 하고 (불변의 특징) StringBuilder는 그러한 단점을 보완한 가변적인 특징을 가지고 있따. */
/* jdk 1.5 버전에서는 문자열의 + 연산이 StringBuilder의 append()로 컴파일이 된다.
* 따라서 성능에 큰 차이를 보이지는 않는다.
* 하지만 반복문에서 문자열의 + 연산을 수행하는 경우 StringBuilder 인스턴스를
* 반복 루프 시 마다 생성하기 때문에 성능에는 좋지 않은 영향을 준다.
*
* 역컴파일 결과 예시
*
* 원본코드
* ---------------------------------------------------
* String str1 = "java";
* String str2 = "oracle";
*
* String str3 = str1 + str2;
* String str4 = "";
*
* for(int i = 0; i < 10; i++) {
* str4 += str1;
* }
* ----------------------------------------------------
*
* JDK 1.4 이하
* ----------------------------------------------------
* String str1 = "java";
* String str2 = "oracle";
*
* String str3 = str1 + str2;
* String str4 = "";
*
* for(int i = 0; i < 10; i++) {
* str4 = str4 + str1;
* }
* ----------------------------------------------------
*
* JDK 1.5 이상
* ----------------------------------------------------
* String str1 = "java";
자주 쓰는 API 16
* String str2 = "oracle";
*
* String str3 = new StringBuilder(str1).append(str2).toString();
* String str4 = "";
*
* for(int i = 0; i < 10; i++) {
* str4 = new StringBuilder(str4).append(str1).toString();
* }
* */
        /* StringBuilder 인스턴스 생성 */
        StringBuilder sb = new StringBuilder("java");
        /* toString이 오버라이딩 되어 있다. */
        System.out.println("sb : " + sb);
        /* hashCode는 오버라이딩 되어 있지 않다.
         * 즉, 동일한 값을 가지는 경우 같은 해쉬코드를 반환하는 것이 아닌,
         * 인스턴스가 동일해야 같은 해쉬코드를 반환한다.
         * */
        System.out.println("sb의 hashCode : " + sb.hashCode());
        /* 문자열 수정 */
        sb.append("oracle");
        System.out.println("sb : " + sb);
        /* hashCode를 다시 출력하면 기존 인스턴스와 동일한 것을 확인할 수 있다.
         * 즉, 문자열을 변경했다고 해서 새로운 인스턴스가 생성된 것은 아니다.
         * */
        System.out.println("sb의 hashCode : " + sb.hashCode());
    }
}
