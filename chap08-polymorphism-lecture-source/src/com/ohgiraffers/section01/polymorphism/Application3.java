package com.ohgiraffers.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {
        /* 다형성을 적용하여 매개변수에 활용할 수 있다. */
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        Application3 app3 = new Application3();
        app3.feed(animal1);
        app3.feed(animal2);

        app3.feed(rabbit);
        app3.feed(tiger);
    }

    /* 다형성을 적용하지 않았다면 호랑이에게 먹이를 주는 메소드, 토끼에게 먹이를 주는 메소드를 별도로 작성해야 할 것이다.
    *  또한 동물의 종류가 늘어나면 그만큼 메소드를 추가 정의해야 할 것이다.
    *  다형성을 적용하면 상위 타입인 Animal로 하나의 메소드만 작성하면 된다. */
    public void feed(Animal animal) {
        System.out.println("feed 메소드 호출...");
        animal.eat();
    }
}
