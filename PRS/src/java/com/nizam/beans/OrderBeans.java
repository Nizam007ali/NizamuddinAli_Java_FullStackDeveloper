/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.beans;

/**
 *
 * @author nizam
 */
public class OrderBeans {
    private String oid;
    private String email;
    private String Pid;
    private String Pname;
    private String Ptype;
    private String Pdes;
    private String Price;
    private String num;
    private String status;

    public OrderBeans() {
    }

    public OrderBeans(String oid, String email, String Pid, String Pname, String Ptype, String Pdes, String Price, String num, String status) {
        this.oid = oid;
        this.email = email;
        this.Pid = Pid;
        this.Pname = Pname;
        this.Ptype = Ptype;
        this.Pdes = Pdes;
        this.Price = Price;
        this.num = num;
        this.status = status;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPid() {
        return Pid;
    }

    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public String getPtype() {
        return Ptype;
    }

    public void setPtype(String Ptype) {
        this.Ptype = Ptype;
    }

    public String getPdes() {
        return Pdes;
    }

    public void setPdes(String Pdes) {
        this.Pdes = Pdes;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
