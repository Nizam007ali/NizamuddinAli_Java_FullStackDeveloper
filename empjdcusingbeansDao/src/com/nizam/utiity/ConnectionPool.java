/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.utiity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionPool {

    static Connection conn;

    public static Connection connectDB() {
        try {
            //step1:Register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step2: Create The Connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyindb", "root", "1234");
            System.out.println("Database Connection Success");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;
    }

    public static void main(String[] args) {
        connectDB();
    }
}
