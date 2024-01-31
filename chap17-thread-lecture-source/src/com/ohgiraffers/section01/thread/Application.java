package com.ohgiraffers.section01.thread;

public class Application {
    public static void main(String[] args) {
        /* Thread를 생성하는 방법
        *  1. Thread 클래스 상속
        *  2. Runnable 인터페이스 구현
        * */

        Car car = new Car();
        Tank tank = new Tank();
        Plane plane = new Plane();

        /* Thread 타입의 인스턴스로 변환 */
        Thread t1 = car;
        Thread t2 = tank;
        Thread t3 = new Thread(plane); //Runnable을 상속 받을 클래스는 Thread 생성자에 인자로 인스턴스를 전달한다.

        /* 다형성을 적용하여 Thread 타입으로 바로 인스턴스 생성*/
        Thread t4 = new Car();
        Thread t5 = new Tank();
        Thread t6 = new Thread(new Plane());

        /* 기본적으로 가지고 있는 우선 순위 확인 */
        System.out.println("t4 우선 순위 : " + t4.getPriority());
        System.out.println("t5 우선 순위 : " + t5.getPriority());
        System.out.println("t6 우선 순위 : " + t6.getPriority());

        /* 우선 순위 변경 */
        t4.setPriority(Thread.MAX_PRIORITY);
        t6.setPriority(Thread.MIN_PRIORITY);

        /* 변경된 우선 순위 확인 */
        System.out.println("t4 우선 순위 : " + t4.getPriority());
        System.out.println("t5 우선 순위 : " + t5.getPriority());
        System.out.println("t6 우선 순위 : " + t6.getPriority());

        /* run() 메소드 호출 시 별도의 스레드로 동작하지 않고 메인 스레드가 메소드를 호출하는 방식으로 동작한다. */
//        t4.run();
//        t5.run();
//        t6.run();

        /* start() 메소드 호출 시 별도의 호출 스택을 생성하여 각각의 스레드가 동작한다. */
        t4.start();
        t5.start();
        t6.start();

        /* join() 메소드 호출 시 지정 스레드가 종료 될 때까지 현재 스레드의 종료를 대기 시킬 수 있다. */
        try {
            t4.join();
            t5.join();
            t6.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main end ==========================");


    }
}
