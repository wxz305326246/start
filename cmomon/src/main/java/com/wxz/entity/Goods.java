package com.wxz.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Goods {
    private Integer gid;
    private String gname;
    private int price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datea;

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", price=" + price +
                ", datea=" + datea +
                '}';
    }

    public Goods() {
    }

    public Goods(Integer gid, String gname, int price, Date datea) {
        this.gid = gid;
        this.gname = gname;
        this.price = price;
        this.datea = datea;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public Date getDatea() {
        return datea;
    }

    public void setDatea(Date datea) {
        this.datea = datea;
    }
}
