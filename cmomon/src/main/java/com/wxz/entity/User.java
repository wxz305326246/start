package com.wxz.entity;

public class User {
    private Integer userid;
    private String username;
    private String pwd;

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public User(Integer userid, String username, String pwd) {
        this.userid = userid;
        this.username = username;
        this.pwd = pwd;
    }

    public User() {
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
