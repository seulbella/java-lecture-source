package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Product {

    private String code; //상품코드
    private String brand; //제조사
    private String name; //상품명
    private int price; //가격
    private Date manufaturingDate; //제조일자

    /* 기본 생성자 */
    public Product() {
        System.out.println("Product 클래스의 기본 생성자 호출...");
    }

    /* 모든 필드를 초기화 하는 매개변수 생성자 */
    public Product(String code, String brand, String name, int price, Date manufaturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufaturingDate = manufaturingDate;
        System.out.println("Product 클래스의 매개변수 생성자 호출...");
    }

    /* getter, setter 메소드 */

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufaturingDate() {
        return manufaturingDate;
    }

    public void setManufaturingDate(Date manufaturingDate) {
        this.manufaturingDate = manufaturingDate;
    }

    /* 모든 필드의 값을 문자열로 반환하는 메소드 */
    public String getInformation() {
        return "Product[code=" + code + ", brand=" + brand + ", name=" + name + ", price=" + price +
                ", manufacturingDate=" + manufaturingDate + "]";
    }











}
