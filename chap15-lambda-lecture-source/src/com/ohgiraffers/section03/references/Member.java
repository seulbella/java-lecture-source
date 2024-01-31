package com.ohgiraffers.section03.references;

public class Member {

    private String memberID;

    public Member(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID='" + memberID + '\'' +
                '}';
    }
}
