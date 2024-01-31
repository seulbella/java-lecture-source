package com.ohgiraffers.section03.filterstream;

import java.io.Serializable;

/* 객체 입출력을 위해서는 반드시 직렬화 처리를 해야 한다.
*  직렬화 대상 클래스에 Serializable 인터페이스만 구현하면 직렬화가 필요한 상황인 경우 데이터 직렬화 처리가 된다. */
public class MemberDTO implements Serializable {

    /* 필드 */
    private String id;
    private String pwd;
    private String name;
    private String email;
    private int age;
    private char gender;

    /* transient 예약어는 특정 필드를 직렬화에서 제외한다는 의미이다. */
    private transient double point;

    /* 기본 생성자 */
    public MemberDTO() {
    }

    /* 매개변수 생성자 */
    public MemberDTO(String id, String pwd, String name, String email, int age, char gender, double point) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }

    /* 게터, 세터 */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    /* toString 오버라이딩 */
    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", point=" + point +
                '}';
    }
}
