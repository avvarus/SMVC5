package com.avvarus.model;

public class Student {
    public Student(String fName, String lName, String college, int age) {
        this.fName = fName;
        this.lName = lName;
        this.college = college;
        this.age = age;
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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    private String fName;
    private String lName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String college;
    //private Date dob;

    public Student() {
    }

}
