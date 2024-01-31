package com.ohgiraffers.section03.sync;

public class Consumer extends Thread{

    /* 공유자원을 꺼내서 사용하는 소비자 클래스 */

    private Buffer criticalData;

    public Consumer(Buffer buffer){
        this.criticalData = buffer;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){

            criticalData.getData();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}