package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {

        /* Stack에 대해 이해하고 사용할 수 있다. */
        Stack<Integer> integerStack = new Stack<>();

        /* stack에 값을 넣을 때는 push() 메소드를 사용한다.
         *  add()도 사용 가능하기는 하지만 Vector의 메소드이므로 push()를 사용하는 것이 좋다. */
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("integerStack : " + integerStack);

        /* 스택에서 요소를 찾을 때 search() 메소드를 사용할 수 있다.
        *  인덱스가 아닌 위에서부터 순번을 의미하며 가장 상단의 위치는 0이 아닌 1부터 시작한다.
        *  즉, 배열이 세로로 나열 되는데 제일 위 부터 숫자가 5->4->3->2->1 이다.
        *  */

        System.out.println(integerStack.search(5)); //1

        /* 스택에서 요소를 꺼내는 메소드는 크게 2가지로 볼 수 있다.
        *  peek() : 가장 마지막(상단)에 있는 요소 반환
        *  pop() : 가장 마지막(상단)에 있는 요소 반환 후 제거 */
        System.out.println("peek() : " + integerStack.peek());
        System.out.println(integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        /* 꺼내면서 요소를 제거하기 때문에 스택이 비어있는 경우에는 EmptyStackException이 발생한다. */
//        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);
    }



}
