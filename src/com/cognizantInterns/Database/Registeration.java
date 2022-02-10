package com.cognizantInterns.Database;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.sql.Date;
// pojo class or bean class or encapsulation
public class Registeration {
    private int sno;
    private String name;
    private String Dept;
    private String emailid;
    private String dateOfBirth;
    private String MobilNe;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobilNe() {
        return MobilNe;
    }

    public void setMobilNe(String mobilNe) {
        MobilNe = mobilNe;
    }
}
