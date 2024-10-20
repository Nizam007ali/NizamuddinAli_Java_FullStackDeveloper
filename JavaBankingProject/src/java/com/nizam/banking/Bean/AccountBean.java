/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.banking.Bean;

/**
 *
 * @author nizam
 */
public class AccountBean {
    private String accno;
    private String cusnm;
    private float bal;
    private int pin;

    public AccountBean() {
    }

    public AccountBean(String accno, String cusnm, float bal, int pin) {
        this.accno = accno;
        this.cusnm = cusnm;
        this.bal = bal;
        this.pin = pin;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getCusnm() {
        return cusnm;
    }

    public void setCusnm(String cusnm) {
        this.cusnm = cusnm;
    }

    public float getBal() {
        return bal;
    }

    public void setBal(float bal) {
        this.bal = bal;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
