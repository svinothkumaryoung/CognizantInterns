package com.cognizantInterns.java8StudentPractice.Pojo;

public class Registeration {
    private int RegisterNo;
    private String name;
    private String city;
    private String mobileNo;

    public Registeration() {
    }

    public Registeration(int registerNo, String name, String city, String mobileNo) {
        RegisterNo = registerNo;
        this.name = name;
        this.city = city;
        this.mobileNo = mobileNo;
    }

    public int getRegisterNo() {
        return RegisterNo;
    }

    public void setRegisterNo(int registerNo) {
        RegisterNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Registeration{" +
                "RegisterNo=" + RegisterNo +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
