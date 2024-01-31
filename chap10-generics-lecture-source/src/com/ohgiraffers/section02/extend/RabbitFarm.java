package com.ohgiraffers.section02.extend;

/* 인터페이스의 경우도 implements가 아닌 extends 키워드를 사용한다. */
//public class RabbitFarm <T implements Animal>{
//public class RabbitFarm <T extends Animal>{

public class RabbitFarm<T extends Rabbit> {

    /* 타입 변수는 아직 어떤 토끼가 될 지 모른다. 다만 토끼이거나 토끼의 후손만 가능하다. */
    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

}
