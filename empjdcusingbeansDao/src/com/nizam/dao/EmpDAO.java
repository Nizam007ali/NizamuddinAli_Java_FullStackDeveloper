/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.dao;

import com.nizam.utiity.ConnectionPool;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nizam
 */
public class EmpDAO {
    Connection conn;
    public double getTotalSalary() {
        try {
            double total_sal=0;
            conn = ConnectionPool.connectDB();
            String sql = "select sum(sal) as tSal from emp";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                total_sal = rs.getDouble("tsal");
            }
            
            return total_sal;
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public static void main(String[] args) {
        EmpDAO ed = new EmpDAO();
        System.out.println(""+ed.getTotalSalary());
    }
}
