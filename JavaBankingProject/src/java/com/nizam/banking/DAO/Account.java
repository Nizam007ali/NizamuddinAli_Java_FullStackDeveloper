/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.banking.DAO;

import com.nizam.banking.Bean.AccountBean;
import com.nizam.banking.utility.ConnectionPool;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nizam
 */
public class Account {

    Connection conn;

    public int userLogin(String an, String pn) {
        conn = ConnectionPool.connectDb();
        String sql = "Select * from Account_tbl where Account_number='" + an + "' and pin='" + pn + "';";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return 1;
            } else {
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int checkAccountBal(String acc) {

        try {
            conn = ConnectionPool.connectDb();
            String sql = "Select Balance from account_tbl where Account_number = '" + acc + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                int bal = rs.getInt("Balance");
                return bal;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public int checkAccount(String acc) {

        try {
            conn = ConnectionPool.connectDb();
            String sql = "Select * from account_tbl where Account_number = '" + acc + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public String getName(String acc) {

        try {
            conn = ConnectionPool.connectDb();
            String sql = "Select customer_name from account_tbl where Account_number = '" + acc + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String n = rs.getString("customer_name");
                return n;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }

    public int getPin(String acc) {

        try {
            conn = ConnectionPool.connectDb();
            String sql = "Select pin from account_tbl where Account_number = '" + acc + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                int p = rs.getInt("pin");
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public int checkAccountBalance(String acc, float bal) {

        try {
            conn = ConnectionPool.connectDb();
            String sql = "Select * from account_tbl where Account_number = '" + acc + "' and Balance>=" + bal + "";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public int transferBalance(String ac, String tac, float bal) {
        int r1 = 0, r2 = 0, r3 = 0;
        try {
            conn = ConnectionPool.connectDb();
            String sql1 = "update account_tbl set balance=(balance-" + bal + ") "
                    + "where account_number='" + ac + "';";
            String sql2 = "update account_tbl set balance=(balance+" + bal + ") "
                    + "where account_number='" + tac + "';";
            String sql3 = "insert into transaction( Account_Number, Benefeciary_acc_no, "
                    + "Type, Transaction_amount) values ('" + ac + "','" + tac + "',"
                    + " 'transfer', " + bal + ");";

            Statement stmt = conn.createStatement();
            r1 = stmt.executeUpdate(sql1);
            r2 = stmt.executeUpdate(sql2);
            r3 = stmt.executeUpdate(sql3);
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (r1 == 1 && r1 == 1 && r2 == 1 && r3 == 1) {
            return 1;
        }
        return 0;
    }

    public int debit(String acc, float bal) {

        try {
            conn = ConnectionPool.connectDb();
            Account a = new Account();
            if (a.checkAccountBal(acc) >= bal) {
                String sql1 = "insert into transaction( Account_Number, type , transaction_amount) values('" + acc + "', 'debit', " + bal + "); ";
                String sql = "update account_tbl set Balance=Balance-" + bal + " where Account_number = '" + acc + "'";
                Statement stmt = conn.createStatement();
                int r1 = stmt.executeUpdate(sql1);
                int r = stmt.executeUpdate(sql);
                return r;
            } else {
                System.err.println("insufficient balance");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public int credit(String acc, float bal) {

        try {
            conn = ConnectionPool.connectDb();
            Account a = new Account();
            String sql1 = "insert into transaction( Account_Number, type , transaction_amount) values('" + acc + "', 'credit', " + bal + "); ";
            String sql = "update account_tbl set Balance=Balance+" + bal + " where Account_number = '" + acc + "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            int r = stmt.executeUpdate(sql);
            stmt.executeUpdate(sql1);
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public int pinchange(String acc, String pin, String npin) {

        try {
            conn = ConnectionPool.connectDb();
            String sql = "update account_tbl set pin='" + npin + "' where account_number='" + acc + "' And pin='" + pin + "';";
            Statement stmt = conn.createStatement();
            int r = stmt.executeUpdate(sql);
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }
    
    public static void main(String[] args) {
        Account a = new Account();
//        if (a.checkAccount("1234567891") == 1) {
//            System.out.println("Account exist");
//            if (a.checkAccountBalance("1234567890", 10000) == 1) {
//                System.out.println("Account has balance to transfer");
//            } else {
//                System.out.println("Account does not have balance to transfer");
//            }
//        } else {
//            System.out.println("Account not exist");
//        }
//        System.out.println(a.transferBalance("1234567890", "1234567892", 10000));
//        System.out.println(a.checkAccountBal("1234567890"));
//        System.out.println(a.getPin("1234567892"));
        System.out.println(a.debit("1234567894", 1000));
//        System.out.println(a.pinchange("1234567893", "1234", "1111"));

    }
}
