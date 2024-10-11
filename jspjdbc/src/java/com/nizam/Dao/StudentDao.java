/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.Dao;

import com.nizam.beans.StudentBean;
import static com.nizam.utility.ConnectionPool.ConnectDb;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nizam
 */
public class StudentDao {

    Connection conn;

    public int addStudent(StudentBean sb) {
        int r = 0;
        conn = ConnectDb();
        String sql = "insert into student value("+sb.getId()+",'"+sb.getName()+"','"+sb.getEnroll()+"',"+sb.getPer()+");";
        try {
            Statement stmt = conn.createStatement();
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public ArrayList<StudentBean> Selectall() {
        ArrayList<StudentBean> al = new ArrayList<>();
        conn = ConnectDb();
        String sql = "select * from student";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                StudentBean sb = new StudentBean();
                sb.setId(rs.getInt("id"));
                sb.setName(rs.getString("name"));
                sb.setEnroll(rs.getString("enroll"));
                sb.setPer(rs.getFloat("per"));
                al.add(sb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public int deleteStudent(int id) {
        int r = 0;
        conn = ConnectDb();
        String sql = "delete from student where id =" + id + "";
        try {
            Statement stmt = conn.createStatement();
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public StudentBean FindById(int id) {
        conn = ConnectDb();
        StudentBean sb = new StudentBean();
        String sql = "Select * from student where id =" + id + "";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                sb.setId(rs.getInt("id"));
                sb.setName(rs.getString("name"));
                sb.setEnroll(rs.getString("enroll"));
                sb.setPer(rs.getFloat("per"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sb;
    }

    public int updateStudent(StudentBean sb) {
        int r = 0;
        conn = ConnectDb();
        String sql = "update student set name ='" + sb.getName() + "', enroll ='" + sb.getEnroll() + "', per =" + sb.getPer() + " where id =" + sb.getId() + "";
        try {
            Statement stmt = conn.createStatement();
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public static void main(String[] args) {
        StudentDao sd = new StudentDao();
//        ArrayList<StudentBean> al = sd.Selectall();
//        System.out.println(al);
//        for(StudentBean sb: al){
//            System.out.println(sb.getId());
//            System.out.println(sb.getName());
//            System.out.println(sb.getEnroll());
//            System.out.println(sb.getPer());
//        }
        StudentBean sb = new StudentBean();
        sb.setName("nizamuddin");
        sb.setEnroll("115A");
        sb.setId(1);
        sb.setPer((float) 82.45);
        int r= sd.addStudent(sb);
        System.out.println(r);
    }
}
