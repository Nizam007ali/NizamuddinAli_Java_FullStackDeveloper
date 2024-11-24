/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.beans;

/**
 *
 * @author nizam
 */
public class ProductBeans {
    private String Pid;
    private String Pname;
    private String Ptype;
    private String Pdes;
    private String Price;

    public ProductBeans() {
    }

    public ProductBeans(String Pid, String Pname, String Ptype, String Pdes, String Price) {
        this.Pid = Pid;
        this.Pname = Pname;
        this.Ptype = Ptype;
        this.Pdes = Pdes;
        this.Price = Price;
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

    public String getPtype() {
        return Ptype;
    }

    public void setPtype(String Ptype) {
        this.Ptype = Ptype;
    }

}
