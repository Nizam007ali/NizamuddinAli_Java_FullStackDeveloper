/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.dao;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import com.nizam.beans.UsersBean;
import static com.nizam.utiity.ConnectionPool.connectDB;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nizam
 */
public class UsersDao {

    Connection conn;

    public int registerUser(UsersBean ub) {
        conn = connectDB();
        int r = 0;
        try {
            Statement stmt = conn.createStatement();
            String sql = "insert into users(uid,name,email,mobile,username,password) "
                    + "values('" + ub.getUid() + "','" + ub.getName() + "','" + ub.getEmail() + "',"
                    + "'" + ub.getMobile() + "','" + ub.getUsername() + "','" + ub.getPassword() + "') ";
            r = stmt.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(UsersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public UsersBean loginCheck(String username, String password) {
        UsersBean ub = null;
        conn = connectDB();

        String sql = "select * from users where username = '" + username + "' and "
                + "password = '" + password + "'";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                ub = new UsersBean();
                ub.setEmail(rs.getString("email"));
                ub.setMobile(rs.getString("mobile"));
                ub.setName(rs.getString("name"));
                ub.setPassword(rs.getString("password"));
                ub.setUid(rs.getInt("uid"));
                ub.setUsername(rs.getString("username"));
            }
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(UsersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ub;
    }

    public static void main(String[] args) {

//        UsersBean ub = new UsersBean();
//        ub.setEmail("nizam@gmail.com");
//        ub.setMobile("9131");
//        ub.setName("nizam");
//        ub.setPassword("1234");
//        ub.setUid(101);
//        ub.setUsername("nizam@007");
//        
//        UsersDao ud = new UsersDao();
//        int x = ud.registerUser(ub);
//        if(x>0) System.out.println("Registration success");
//        else System.out.println("Registration failed");
        UsersDao ud = new UsersDao();
        UsersBean b = ud.loginCheck("nizam@007", "1234");

        if (b == null) {
            System.out.println("Login Fail Please Enter Valid UserName and Password");
        } else {
            System.out.println("Login Success");
            System.out.println("Email : " + b.getEmail());
            System.out.println("Mobile : " + b.getMobile());
            System.out.println("Name : " + b.getName());
            System.out.println("UserName : "+b.getUsername());
            System.out.println("Password : "+b.getPassword());
            System.out.println("UID : " + b.getUid());
        }
    }
}
