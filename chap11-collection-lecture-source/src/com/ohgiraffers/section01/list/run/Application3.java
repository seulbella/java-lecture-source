package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {

    public static void main(String[] args) {

        /* LinkedList에 대해 이해하고 사용할 수 있다. */

        /* 객체 생성 */
        List<String> linkedList = new LinkedList<>();

        /* 객체 배열에 데이터 추가 */
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("mango");
        linkedList.add("orange");
        linkedList.add("grape");

        /* 인덱스별 데이터 표출 */
        for(int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " : " + linkedList);
        }

        /* 1번 인덱스 데이터 삭제 */
        linkedList.remove(1);

        /* str에 linkedList 담고 데이터 잘 삭제 되었는지 확인 */
        for(String str : linkedList) {
            System.out.println(str);
        }

        /* 0번 인덱스에 데이터 추가 */
        linkedList.set(0, "peach");

        System.out.println(linkedList);

        /* .isEmpty() : 해당 객체가 비어있나요? 확인하는 변수 */
        System.out.println(linkedList.isEmpty()); //false
        linkedList.clear(); //리스트 내의 요소를 모두 제거하는 메소드
        System.out.println(linkedList.isEmpty()); //true

        /* LinkedList는 List 인터페이스를 상속 받아 ArrayList와 사용하는 방법이 유사하다.
        *  단, 내부적으로 요소를 저장하는 방법이 차이가 있는 것이다.
        *  따라서 각 컬렉션 프레임워크 클래스들의 특징을 파악하고 그에 따라 적합한 자료 구조를 구현한 클래스를 선택하는 것이 좋다. */



    }

}
