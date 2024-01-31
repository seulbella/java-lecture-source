package com.ohgiraffers.section05.typecasting;

public class Application4 {

    public static void main(String[] args) {
        /* 형변환 시 데이터 손실에 유의해서 사용해야 한다. */

        /* 1. 의도하지 않은 데이터 손실 */
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum); // 엉뚱한 값으로 나옴

        /* 2. 의도한 데이터 손실 */
        double height = 175.5;
        int floorHeight = (int) height;

        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeight);
    }

}
