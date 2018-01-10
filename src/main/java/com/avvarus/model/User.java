package com.avvarus.model;

import java.util.ArrayList;

public class User {

    private String uname;
    private String pwd;
    private Student student;
    private ArrayList<String> skills;

    public User() {
    }

    public String getUname() {
        return uname;
    }

    public User(String uname, String pwd, Student student, ArrayList<String> skills) {
        this.uname = uname;
        this.pwd = pwd;

        this.student = student;
        this.skills = skills;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
