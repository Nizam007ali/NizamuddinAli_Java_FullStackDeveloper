package com.nizam.banking.utility;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class ConnectionPool {

    static Connection conn;

    public static Connection connectDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "1234");
            System.out.println("Connection done!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public static void main(String[] args) {
        connectDb();        
    }
}
