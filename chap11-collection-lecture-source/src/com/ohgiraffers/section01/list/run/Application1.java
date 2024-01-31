package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {
        /* ArrayList
        *  ArrayList는 배열의 단점을 보완하기 위해 만들어졌다.
        *  배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다.
        *  이러한 기능들을 ArrayList에서 미리 메소드를 구현해서 제공하고 있으며
        *  내부적으로 수행 될 뿐이지 실행 속도가 빨리지는 것은 아니다. */

        /* ArrayList의 특징
        *  1. 저장 순서가 있다.
        *  2. 중복 데이터가 허용된다. */

        /* ArrayList는 인스턴스를 생성하면 내부적으로 10칸짜리 배열을 생성해서 관리한다. */
        ArrayList alist = new ArrayList();

        /* 다형성을 이용해서 상위 레퍼런스로 ArrayList 객체를 참조할 수 있다.
        *  List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
        *  레퍼런스 타입은 List 타입으로 해 두는 것이 더 유연한 코드를 작성하는 방법이다. */
        List list = new ArrayList();

        /* 더 상위 타입인 Collection 타입을 사용할 수도 있다. */
        Collection clist = new ArrayList();

        /* add 메소드를 통해 저장할 수 있고 현재는 Object 클래스의 하위 타입 인스턴스를 모두 저장할 수 있다. */
        alist.add("apple");
        alist.add(123);
        alist.add(45.67);
        alist.add(new java.util.Date());

        /* 저장 순서가 유지 되며 index(순번)이 적용 된다.
        *  toString() 메소드가 오버라이딩 되어 있어 담겨있는 요소들을 확인할 수 있다. */
        System.out.println("alist : " + alist);

        /* size() 메소드는 배열의 크기가 아닌 요소의 개수를 반환한다.
        *  내부적으로 관리되는 배열의 사이즈는 외부에서 알 필요가 없으므로 기능으로 제공하지 않는다. */
        System.out.println("alist의 size() : " + alist.size());

        /* 내부 배열에 인덱스가 지정 되어 있기 때문에 for문 접근 가능하다. */
        for(int i = 0; i < alist.size(); i++ ) {
            /* 인덱스에 해당하는 값을 가져 올때는 get 메소드를 사용한다. */
            System.out.println(i + " : " + alist.get(i));
        }

        /* 데이터의 중복 저장을 허용한다.
        *  배열과 같이 인덱스로 요소를 관리하기 때문에 가능하다. */
        alist.add("apple");
        System.out.println("alist : " + alist);

        /* 원하는 인덱스 위치에 값을 추가할 수 있따. */
        /* 해당 인덱스를 덮어쓰지 않고 이후 인덱스는 하나씩 뒤로 밀리게 된다. */
        alist.add(1, "banana");
        System.out.println("alist : " + alist);

        /* 저장 된 값을 삭제할 때는 remove() 메소드를 사용한다.
        *  중간 인덱스의 값을 삭제하는 경우 자동으로 인덱스를 하나씩 앞으로 당긴다. */
        alist.remove(2);
        System.out.println("alist : " + alist);

        /* 지정 된 위치의 값을 수정할 때도 인덱스를 활용하여 set() 메소드를 사용한다. */
        alist.set(1, "grape");
        System.out.println("alist : " + alist);

        /* 모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성되어 있다. */
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");
        /* 제네릭 타입을 지정하면 지정한 타입 외의 인스턴스는 저장하지 못함 */
//        stringList.add(123);

        System.out.println("stringList : " + stringList);

        /* 저장 순서를 유지하고 있는 stringList를 오름차순 정렬한다. */
        /* Collection 인터페이스가 아닌 Collections 클래스를 사용한다.
        *  컬렉션에서 사용 되는 기능들을 static 메소드들로 구현한 클래스이다. */
        Collections.sort(stringList);

        /* sort 메소드를 사용하면 리스트가 오름차순 정렬 된 후 정렬 상태가 유지 된다. */
        System.out.println("stringList : " + stringList);
    }
}
