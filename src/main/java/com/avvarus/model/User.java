package com.avvarus.model;

import java.util.ArrayList;

public class User {
    private String uname;

    private ArrayList<String> skills;

    public ArrayList<String> getSkills() {
        return skills;
    }

    private String pwd;

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public User() {
    }

    public User(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public String getUname() {
        return uname;
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
}
