package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {

    public static void main(String[] args) {
        /* 와일드 카드에 대해 이해할 수 있다.
        *  제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
        *  그 객체의 타입 변수를 제한할 수 있다. */

        WildCardFarm wildCardFarm = new WildCardFarm();

        /* 1. 매개변수의 타입 제한이 없는 경우 => 어떤 토끼를 가진 토끼 농장이던 인자로 전달 가능하다.  */
        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

        /* 2. 매개변수의 타입이 바니이거나 바니 후손 토끼를 가진 토끼 농장만 인자로 전달 가능 */
//        wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        /* 3. 매개변수의 타입이 바니이거나 바니 상위 타입의 토끼를 가진 토끼 농장만 인자로 전달 가능 */
        wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
        /* 바니의 하위 타입인 드렁큰 버니는 불가능하다. */
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

    }

}
