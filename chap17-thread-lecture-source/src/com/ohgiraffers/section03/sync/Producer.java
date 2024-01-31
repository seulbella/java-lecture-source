package com.ohgiraffers.section03.sync;

public class Producer extends Thread {

    /* 공유데이터 값 넣는 일을 하는 공급자(생산자) */

    private Buffer criticalData;

    public Producer(Buffer buffer){
        this.criticalData = buffer;
    }

    @Override
    public void run(){

        for (int i = 1; i <= 10; i++) {
            criticalData.setData(i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}