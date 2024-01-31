package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {

    public static void main(String[] args) {
        /* extends 키워드를 이용하여 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다. */

        /* Rabbit의 상위 타입이거나 또는 관련 없는 타입을 통해서 인스턴스 생성이 불가능하다. */
//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();
//
        /* Rabbit 타입이거나 Rabbit의 후손 타입으로 인스턴스 생성이 가능하다. */
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();

    }

}
