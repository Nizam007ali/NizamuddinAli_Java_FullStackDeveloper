/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.banking.Bean;

/**
 *
 * @author nizam
 */
public class TransactionBean {
    
    private int TId;
    private String AccNO;
    private String BAccNO;
    private String type;
    private int TAmt;
    private String TD_T;

    public TransactionBean() {
    }

    public TransactionBean(int TId, String AccNO, String BAccNO, String type, int TAmt, String TD_T) {
        this.TId = TId;
        this.AccNO = AccNO;
        this.BAccNO = BAccNO;
        this.type = type;
        this.TAmt = TAmt;
        this.TD_T = TD_T;
    }

    public int getTId() {
        return TId;
    }

    public void setTId(int TId) {
        this.TId = TId;
    }

    public String getAccNO() {
        return AccNO;
    }

    public void setAccNO(String AccNO) {
        this.AccNO = AccNO;
    }

    public String getBAccNO() {
        return BAccNO;
    }

    public void setBAccNO(String BAccNO) {
        this.BAccNO = BAccNO;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTAmt() {
        return TAmt;
    }

    public void setTAmt(int TAmt) {
        this.TAmt = TAmt;
    }

    public String getTD_T() {
        return TD_T;
    }

    public void setTD_T(String TD_T) {
        this.TD_T = TD_T;
    }
    
}
