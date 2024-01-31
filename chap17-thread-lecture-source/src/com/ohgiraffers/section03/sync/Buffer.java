package com.ohgiraffers.section03.sync;

public class Buffer {

    private int data;
    private boolean empty = true;

    public synchronized void getData(){

        /* 현재 값이 없으면 대기 상태, 값이 있으면 소비 */
        if(empty){
            try {
                System.out.println("getData wait");
                /* 스레드를 일시 정지 시킨다. notify() 호출 되면 블럭 상태를 빠져 나오게 된다. */
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /* 값이 있으면 소비하고, 다시 empty 는 true로 바꿈 */
        System.out.println("소비자 : " + data + " 번 상품 소비하였습니다.");
        empty = true;

        /* 스레드를 다시 실행 대기 상태로 만든다. */
        notify();
    }

    public synchronized void setData(int data){

        /* 현재 값이 있으면 대기상태로, 값이 없으면 생산 */
        if(!empty){
            try {
                System.out.println("setData wait");
                /* 스레드를 일시 정지 시킨다. notify() 호출 되면 블럭 상태를 빠져 나오게 된다. */
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /* 값이 없으니 생산하고, empty 는 false로 바꿈 */
        this.data = data;
        System.out.println("생산자 : " + data + " 번 상품을 생산하였습니다.");
        empty = false;

        /* 스레드를 다시 실행 대기 상태로 만든다. */
        notify();

    }


}
