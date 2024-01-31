package com.ohgiraffers.section01.thread;

public class Tank extends Thread {

    @Override
    public void run() {
        /* Tank 스레드로 수행할 작업 내용을 작성한다. */
        for(int i = 0; i < 1000; i++) {
            System.out.println("Tank Shooting...");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
