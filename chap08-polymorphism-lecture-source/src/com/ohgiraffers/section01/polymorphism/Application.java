package com.ohgiraffers.section01.polymorphism;

public class Application {

    /* 다형성에 대해 이해할 수 있다. */

    /* 다형성이란? : 하나의 인스턴스(객체)가 여러 타입을 가질 수 있다. */

    public static void main(String[] args) {
        System.out.println("Animal 생성 ==============");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("Rabbit 생성 ==============");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("Tiger 생성 ===============");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        /* Rabbit, Tiger는 Animal 클래스를 상속 받았으므로
        *  Rabbit은 Rabbit 타입이기도 하면서 Animal 타입이기도 하다.
        *  Tiger는 Tiger 타입이기도 하면서 Animal 타입이기도 하다.
        * */

        /* 부모 타입으로 자식 인스턴스의 주소 값 참조가 가능하다. */
        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

        /* 하지만 반대로 Animal은 Tiger나 Rabbit이 아니다.*/
//        Rabbit r = new Animal();
//        Tiger t = new Animal();

        /* 컴파일 당시에는 해당 타입의 메소드와 연결 되어 있다가(정적 바인딩)
        *  런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어 동작하는 것을 동적 바인딩이라고 한다. */
        System.out.println("동적 바인딩 확인=============");
        a1.cry();
        a2.cry();

        /* 현재 레퍼런스 변수 타입은 Animal 이기 때문에 Rabbit과 Tiger가 가진 고유한 기능을 호출하지 못한다. */
//        a1.jump();
//        a2.bite();

        /* 타입 형변환
        *  객체별로 고유한 기능을 동작 시키기 위해 레퍼런스 변수를 Rabbit과 Tiger로 형변환 해야 한다. */
        System.out.println("클래스 형변환 확인======");
        ((Rabbit)a1).jump(); // 형변환 연산자보다 참조 연산자가 더 우선 실행 되기 때문에 '()'를 한번 더 쳐줘서 형변환 연산자가 우선 실행되게 해줘야 한다.
        ((Tiger)a2).bite();

        /* 타입 형변환을 잘못하는 경우 */
        /* 컴파일 에러는 발생하지 않지만 런타임 에러가 발생한다. (java.lang.ClassCastException) */
//        ((Tiger)a1).bite();

        /* 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 instanceof 연산자 */
        System.out.println("instanceof 연산자 확인============");
        System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));
        System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
        System.out.println("a2이 Rabbit 타입인지 확인 : " + (a2 instanceof Rabbit));
        System.out.println("a2이 Tiger 타입인지 확인 : " + (a2 instanceof Tiger));

        /* 상속 받은 타입도 함께 가지고 있다. */
        System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
        System.out.println("a2이 Animal 타입인지 확인 : " + (a2 instanceof Animal));

        /* 모든 클래스는 Object의 후손이다. */
        System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));
        System.out.println("a2이 Object 타입인지 확인 : " + (a2 instanceof Object));

        /* instanceof 연산자를 이용해서 해당 타입이 맞는 경우에만 클래스 형변환을 적용한다. */
        if(a1 instanceof Rabbit) {
            ((Rabbit)a1).jump();
        }

        if(a1 instanceof Tiger) {
            ((Tiger)a2).bite();
        }

        /* 클래스의 업 캐스팅과 다운 캐스팅
        * up-casting : 상위 타입으로 형변환(묵시적 형변환)
        * down-casting : 하위 타입으로 형변환(명시적 형변환)
        * */

        Animal animal1 = (Animal) new Rabbit(); //up-casting
        Animal animal2 = new Rabbit();          //up-casting 묵시적 형변환 가능

        Rabbit rabbit1 = (Rabbit) animal1;        //down-casting
//        Rabbit rabbit2 = animal2;               //down-casting 묵시적 형변환 불가
    }



}
