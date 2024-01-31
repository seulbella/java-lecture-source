package com.ohgiraffers.section01.polymorphism;

public class Application2 {

    public static void main(String[] args) {
        /* 다형성을 적용하여 객체 배열을 만들어 인스턴스를 연속 처리할 수 있다. */
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        /* 반복된 for문을 통한 Animal 클래스가 가지는 메소드를 오버라이딩한 메소드 호출 */
        for(Animal animal : animals) {
            animal.eat();
        }

        /* Animal 클래스가 가지는 메소드를 오버라이딩한 메소드가 호출 된다. - 동적 바인딩 */
        for(int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }

        /* 각 타입별 고유한 메소드를 동작시키기 위해서는 다운 캐스팅이 명시적으로 필요하다.
        * ClassCastExceptiond을 방지하기 위해 instanceof 연산자를 활용한다. */
        for(int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Rabbit) {
                ((Rabbit)animals[i]).jump();
            } else if(animals[i] instanceof Tiger) {
                ((Tiger)animals[i]).bite();
            } else {
                System.out.println("토끼나 호랑이가 아닙니다.");
            }
            System.out.println("다운 캐스팅 메소드 호출 =======");
        }

    }
}
