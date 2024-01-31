package com.ohgiraffers.section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 리턴 타입에 활용할 수 있다. */
        Application4 app4 = new Application4();

        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();
    }

    /* 다형성을 적용하지 않으면 호랑이를 리턴하는 메소드와 토끼를 리턴하는 메소드를 따로 작성해야 한다. */
    public Animal getRandomAnimal() {
        int random = (int) (Math.random() * 2);

        System.out.println("호출된 값은 " + random + " 입니다.");
        return random == 0 ? new Rabbit() : new Tiger();
    }


}
