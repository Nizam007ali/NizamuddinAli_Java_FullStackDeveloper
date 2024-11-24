/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.Dao;

import com.nizam.beans.ProductBeans;
import com.nizam.beans.UserBeans;
import static com.nizam.connectionPool.connect.connectDb;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nizam
 */

public class Admin {

    public int login(String em, String pw) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from admin where username='" + em + "' and password='" + pw + "';";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                r = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public int AddUser(UserBeans ub) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "insert into users( name, email, phone, password) value( '" + ub.getName() + "','" + ub.getEmail() + "',  " + ub.getPhone() + ", '" + ub.getPassword() + "');";
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public int UpdUser(UserBeans ub) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "update users set name='" + ub.getName() + "', email='" + ub.getEmail() + "', phone='" + ub.getPhone() + "', password='" + ub.getPassword() + "' where id=" + ub.getId() + ";";
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public int UpdOrder(String oid, String status) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "update orders set status='" + status + "' where oid=" + oid + ";";
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public int DeleteUser(String id) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Delete from users where id='" + id + "';";
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public ArrayList<UserBeans> AllUser() {
        ArrayList<UserBeans> al = new ArrayList<>();
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from users;";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                UserBeans ub = new UserBeans();
                ub.setId(rs.getString("id"));
                ub.setName(rs.getString("name"));
                ub.setEmail(rs.getString("email"));
                ub.setPhone(rs.getString("phone"));
                ub.setPassword(rs.getString("password"));
                ub.setImage(rs.getString("image"));
                al.add(ub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<ProductBeans> AllPro() {
        ArrayList<ProductBeans> al = new ArrayList<>();
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from product;";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProductBeans ub = new ProductBeans();
                ub.setPdes(rs.getString("description"));
                ub.setPid(rs.getString("pid"));
                ub.setPname(rs.getString("pname"));
                ub.setPtype(rs.getString("ptype"));
                ub.setPrice(rs.getString("price"));
                al.add(ub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<ProductBeans> MobPro() {
        ArrayList<ProductBeans> al = new ArrayList<>();
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from product where ptype='mobile';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProductBeans ub = new ProductBeans();
                ub.setPdes(rs.getString("description"));
                ub.setPid(rs.getString("pid"));
                ub.setPname(rs.getString("pname"));
                ub.setPtype(rs.getString("ptype"));
                ub.setPrice(rs.getString("price"));
                al.add(ub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<ProductBeans> LapPro() {
        ArrayList<ProductBeans> al = new ArrayList<>();
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from product where ptype='laptop';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProductBeans ub = new ProductBeans();
                ub.setPdes(rs.getString("description"));
                ub.setPid(rs.getString("pid"));
                ub.setPname(rs.getString("pname"));
                ub.setPtype(rs.getString("ptype"));
                ub.setPrice(rs.getString("price"));
                al.add(ub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<ProductBeans> BooPro() {
        ArrayList<ProductBeans> al = new ArrayList<>();
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from product where ptype='books';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProductBeans ub = new ProductBeans();
                ub.setPdes(rs.getString("description"));
                ub.setPid(rs.getString("pid"));
                ub.setPname(rs.getString("pname"));
                ub.setPtype(rs.getString("ptype"));
                ub.setPrice(rs.getString("price"));
                al.add(ub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<ProductBeans> BikPro() {
        ArrayList<ProductBeans> al = new ArrayList<>();
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from product where ptype='bikes';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProductBeans ub = new ProductBeans();
                ub.setPdes(rs.getString("description"));
                ub.setPid(rs.getString("pid"));
                ub.setPname(rs.getString("pname"));
                ub.setPtype(rs.getString("ptype"));
                ub.setPrice(rs.getString("price"));
                al.add(ub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public UserBeans User(String id) {
        Connection conn = connectDb();
        UserBeans ub = new UserBeans();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from users where id = '" + id + "';";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                ub.setId(rs.getString("id"));
                ub.setName(rs.getString("name"));
                ub.setEmail(rs.getString("email"));
                ub.setPhone(rs.getString("phone"));
                ub.setPassword(rs.getString("password"));
                ub.setImage(rs.getString("image"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ub;
    }

    public UserBeans UserByEm(String em) {
        Connection conn = connectDb();
        UserBeans ub = new UserBeans();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from users where email = '" + em + "';";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                ub.setId(rs.getString("id"));
                ub.setName(rs.getString("name"));
                ub.setEmail(rs.getString("email"));
                ub.setPhone(rs.getString("phone"));
                ub.setPassword(rs.getString("password"));
                ub.setImage(rs.getString("image"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ub;
    }

    public ProductBeans Pro(String id) {
        Connection conn = connectDb();
        ProductBeans ub = new ProductBeans();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from Product where pid = '" + id + "';";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                ub.setPid(rs.getString("pid"));
                ub.setPname(rs.getString("pname"));
                ub.setPdes(rs.getString("description"));
                ub.setPrice(rs.getString("price"));
                ub.setPtype(rs.getString("ptype"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ub;
    }

    public int AddPro(ProductBeans pb) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "insert into product( pname, ptype, description, price) value( '" + pb.getPname() + "','" + pb.getPtype() + "',  '" + pb.getPdes() + "', '" + pb.getPrice() + "');";
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public int UpdPro(ProductBeans pb) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "update product set pname='" + pb.getPname() + "', description='" + pb.getPdes() + "', ptype='" + pb.getPtype() + "', price='" + pb.getPrice() + "' where pid='" + pb.getPid() + "';";
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public int DelPro(String id) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "Delete from product where pid='" + id + "';";
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public static void main(String[] args) {
        Admin a = new Admin();
//        System.out.println(a.login("nizam007", "1234"));
        ProductBeans pb = new ProductBeans();
        System.out.println(a.AllPro());
//pb.setPdes("The iPhone 16 Pro features a 6.3-inch Super Retina XDR OLED display, A18 Pro chip, 48MP main camera with 5x optical zoom, 5G and Wi-Fi 7, USB-C with DisplayPort, MagSafe, and a battery life of up to 27 hours. It runs on iOS 18 with Face ID, enhanced Siri, Ultra-Wideband chip, and water/dust resistance (IP68)");
//pb.setPname("iphone");
//pb.setPrice("142545");
//pb.setPtype("Mobile");
//        System.out.println(a.DelPro("1"));
    }
}
