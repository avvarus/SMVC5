package com.avvarus.model;

import java.util.Date;

public class Student {

    private String fName;
    private String lName;
    private int age;
    private String college;
    private Date dob;

    public Student() {
    }

    public Student(String fName, String lName, int age, String college, Date dob) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.college = college;
        this.dob = dob;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
