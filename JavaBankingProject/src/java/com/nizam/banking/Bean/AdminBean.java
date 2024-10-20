/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.banking.Bean;

/**
 *
 * @author nizam
 */
public class AdminBean {
    private String adminName;
    private String password;

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AdminBean(String adminName, String password) {
        this.adminName = adminName;
        this.password = password;
    }

    public AdminBean() {
    }
}
