package com.ohgiraffers.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        /* HashSet 클래스를 이해하고 사용할 수 있다. */
        HashSet<String> hset = new HashSet<>();
        /* 다형성을 적용하여 상위 인터페이스를 타입으로 사용 가능 */
        Set<String> hset2 = new HashSet<>();
        Collection<String> hset3 = new HashSet<>();

        /* Set 계열에 데이터 추가 시 add 메소드 사용 */
        hset.add(new String("java")); // 동등객체
        hset.add(new String("mysql"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));

        /* 저장 순서가 유지 되지 않는다. */
        System.out.println("hset : " + hset); //

        /* 중복된 값을 허용하지 않는다. */
        /* 동일 객체 뿐만 아니라 동등 객체도 중복 값으로 판단 되어 처리 된다.
         *  string 클래스에 equals()와 hashCode()가 오버라이딩 되어 있기 때문이다.
         * */
        hset.add(new String("java")); // 동등객체
        System.out.println("hset : " + hset);

        /* 동일 객체 : 주소 값이 같은 객체 */
        /* 동등 객체 : 필드 값이 같은 객체 */

        /* contains() 메소드는 해당 객체를 포함하고 있는지 확인하는 메소드로 여기서도 동등 객체로 판단한다.
        *  내부적으로 equals() 메소드를 호출해서 사용한다. */
        System.out.println("포함 여부 확인 : " + hset.contains(new String("html")));

        /* 저장 된 객체를 인덱스 기준으로 순회할 수 없다.
        *  반복문을 이용한 연속처리 방법으로는
        *  1. toArray() 메소드로 배열로 변경한 뒤 for loop 사용
        *  2. iterator() 메소드로 반복자를 만들어서 연속 처리
        * */
        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        /* Collection 인터페이스의 상위 타입인 Iterable 인터페이스에 iterator() 메소드가 정의 되어 있다.
        *  따라서 Collection 타입이라면 반복자를 통한 순회를 할 수 있다. */
        Iterator<String> iter = hset.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
