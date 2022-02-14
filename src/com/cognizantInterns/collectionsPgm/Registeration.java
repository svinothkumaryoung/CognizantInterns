package com.cognizantInterns.collectionsPgm;

public class Registeration implements Comparable<Registeration>{
    private String name;
    private int registerNo;
    private String city;
    private String Country;

    Registeration()
        {}

    public Registeration(String name, int registerNo, String city, String country) {
        this.name = name;
        this.registerNo = registerNo;
        this.city = city;
        Country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Registeration{" +
                "name='" + name + '\'' +
                ", registerNo=" + registerNo +
                ", city='" + city + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }

    @Override
    public int compareTo(Registeration r) {
        if(this.registerNo==r.registerNo){
            return 0;
        }
        else if(this.registerNo>r.registerNo)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
