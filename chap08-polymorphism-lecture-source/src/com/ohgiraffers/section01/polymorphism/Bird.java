package com.ohgiraffers.section01.polymorphism;

public class Bird extends Animal{

    @Override
    public void eat() {
        System.out.println("새가 열매를 쪼아 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("새가 날개죽지를 펴고 달려갑니다.");
    }

    @Override
    public void cry() {
        System.out.println("새가 삐욕삐욕하고 웁니다.");
    }

    public void bite() {
        System.out.println("새가 살 끝을 쪼아 뭅니다.");
    }
}
