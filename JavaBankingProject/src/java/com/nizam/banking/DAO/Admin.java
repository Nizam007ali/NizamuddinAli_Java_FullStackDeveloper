/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.banking.DAO;

import com.nizam.banking.Bean.AccountBean;
import com.nizam.banking.Bean.AdminBean;
import com.nizam.banking.Bean.TransactionBean;
import com.nizam.banking.utility.ConnectionPool;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nizam
 */
public class Admin {

    Connection conn;

    public int adminLogin(String an, String ap) {
        conn = ConnectionPool.connectDb();
        String sql = "Select * from admin where name='" + an + "' and pwd='" + ap + "';";
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

    public ArrayList<AccountBean> AllAccount() {
        ArrayList<AccountBean> al = new ArrayList<>();
        String sql = "Select * from account_tbl";
        conn = ConnectionPool.connectDb();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                AccountBean ab = new AccountBean();
                ab.setAccno(rs.getString("account_number"));
                ab.setBal(Float.parseFloat(rs.getString("balance")));
                ab.setCusnm(rs.getString("customer_name"));
                ab.setPin(Integer.parseInt(rs.getString("pin")));
                al.add(ab);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> TransactionData() {
        ArrayList<TransactionBean> al = new ArrayList<>();
        String sql = "Select * from transaction";
        conn = ConnectionPool.connectDb();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean ab = new TransactionBean();
                ab.setAccNO(rs.getString("account_number"));
                ab.setBAccNO(rs.getString("benefeciary_acc_no"));
                ab.setTD_T(rs.getString("transaction_date"));
                ab.setType(rs.getString("type"));
                ab.setTId(Integer.parseInt(rs.getString("transactionid")));
                ab.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                al.add(ab);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public AccountBean getAccount(String acc) {
        AccountBean ab = new AccountBean();
        String sql = "Select * from transaction where account_number='" + acc + "'";
        conn = ConnectionPool.connectDb();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                ab.setAccno(rs.getString("account_number"));
                ab.setBal(Float.parseFloat(rs.getString("balance")));
                ab.setCusnm(rs.getString("customer_name"));
                ab.setPin(Integer.parseInt(rs.getString("pin")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ab;
    }

    public int userAdd(AccountBean ab) {
        int r = 0;
        String sql = "Insert into account_tbl value('" + ab.getAccno() + "', '" + ab.getCusnm() + "', '" + ab.getBal() + "', '" + ab.getPin() + "')";
        conn = ConnectionPool.connectDb();
        try {
            Statement stmt = conn.createStatement();
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public int userUpdate(AccountBean ab) {
        int r = 0;
        String sql = "update account_tbl set customer_name='" + ab.getCusnm() + "', balance ='" + ab.getBal() + "', pin='" + ab.getPin() + "' where account_number=" + ab.getAccno() + "";
        conn = ConnectionPool.connectDb();
        try {
            Statement stmt = conn.createStatement();
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public ArrayList<TransactionBean> recentTransaction(String a) {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where Account_number = '" + a + "' or benefeciary_acc_no = '" + a + "';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    
    public ArrayList<TransactionBean> recentTransaction() {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> recentCreditTransaction() {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where type='credit'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> recentCreditTransaction(String acc) {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where type='credit' and account_number='"+acc+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> recentDebitTransaction() {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where type='debit'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> recentTransferTransaction() {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where type='transfer'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> recentTransferTransaction(String acc) {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where type='transfer' and Account_number='"+acc+"' or benefeciary_acc_no='"+acc+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> recentBaccTransferTransaction(String bacc) {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where type='transfer' and benefeciary_acc_no='"+bacc+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> recentAccAllTransaction(String acc) {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where account_number='"+acc+"' or benefeciary_acc_no='"+acc+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> recentAccBaccTnfTransaction(String acc,String bacc) {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where type='transfer' and account_number='"+acc+"' or benefeciary_acc_no='"+bacc+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> recentAccTnfTransaction(String acc) {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where account_number='"+acc+"' or benefeciary_acc_no='"+acc+"' and type='transfer'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> recentAccCreTransaction(String acc) {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where account_number='"+acc+"' and type='credit'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<TransactionBean> recentAccDebTransaction(String acc) {
        Connection conn = ConnectionPool.connectDb();
        ArrayList<TransactionBean> al = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Select * from transaction where account_number='"+acc+"' and type='debit'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setAccNO(rs.getString("Account_number"));
                tb.setBAccNO(rs.getString("benefeciary_acc_no"));
                tb.setTAmt(Integer.parseInt(rs.getString("transaction_amount")));
                tb.setTD_T(rs.getString("transaction_date"));
                tb.setTId(rs.getInt("transactionid"));
                tb.setType(rs.getString("type"));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public int userDelete(String Acc) {
        int r = 0;

        String sql = "delete from account_tbl where account_number=" + Acc + "";
        conn = ConnectionPool.connectDb();
        try {
            Statement stmt = conn.createStatement();
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public static void main(String[] args) {
        Admin a = new Admin();
//        int r = a.adminLogin("root", "1234");
//
//        AccountBean ab = new AccountBean();
//        ab.setAccno("1234567894");
//        ab.setBal(60000);
//        ab.setCusnm("sanju");
//        ab.setPin(12345);
//        int r = a.userDelete("1");
//        if (r > 0) {
//            System.out.println("Update Done");
//        } else {
//            System.out.println("Update Failed");
//        }
//        int r = a.userAdd(ab);
//        System.out.println(r);
//r = a.userDelete("1234567894");
//        System.out.println(r);
        ArrayList<TransactionBean> tb = a.recentAccTnfTransaction("1234567891");
        System.out.println(tb);
    }
}
