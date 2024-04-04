package com.thuchanh.th.Entity;

public class User {
    private String username;
    private String password;

    public User() {
    }

    public User(String uname, String pword) {
        this.username = uname;
        this.password = pword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String u) {
        this.username = u;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String p) {
        this.password = p;
    }
}
