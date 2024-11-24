/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nizam.Dao;

import com.nizam.beans.CartBeans;
import com.nizam.beans.OrderBeans;
import com.nizam.beans.ProductBeans;
import static com.nizam.connectionPool.connect.connectDb;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nizam
 */
public class User {

    public int login(String em, String pw) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from users where email='" + em + "' and password='" + pw + "';";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                r = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public int AddToCart(CartBeans cb) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "insert into cart( email, pid, pname, description, ptype, price, num) value( '" + cb.getEmail() + "', '" + cb.getPid() + "', '" + cb.getPname() + "', '" + cb.getPdes() + "', '" + cb.getPtype() + "', '" + cb.getPrice() + "', '" + cb.getNum() + "');";
            r = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public int AddOrder(OrderBeans cb, String cid) {
        int r1 = 0, r2=0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "insert into orders( email, pid, pname, description, ptype, price, num) value( '" + cb.getEmail() + "', '" + cb.getPid() + "', '" + cb.getPname() + "', '" + cb.getPdes() + "', '" + cb.getPtype() + "', '" + cb.getPrice() + "', '" + cb.getNum() + "');";
            r1 = stmt.executeUpdate(sql);
            sql = "delete from cart where cid='"+cid+"';";
            r2 = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r1+r2;
    }

    public int DelOrder(String em,String pid) {
        int r2=0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            User u = new User();
            String oid = u.Oid(em, pid);
            String sql = "delete from orders where oid='"+oid+"';";
            r2 = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r2;
    }

    public String Cid(String em, String pid) {
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select cid from cart where email='" + em + "' and pid = '" + pid + "';";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String r = rs.getString("cid");
                return r;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String Oid(String em, String pid) {
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select oid from orders where email='" + em + "' and pid = '" + pid + "';";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String r = rs.getString("oid");
                return r;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public int aNum(String cid) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select num from cart where cid = '" + cid + "';";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                int n = Integer.parseInt(rs.getString("num"));
                n++;
                sql = "update cart set num='" + n + "' where cid = '" + cid + "';";
                r = stmt.executeUpdate(sql);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public int sNum(String cid) {
        int r = 0;
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select num from cart where cid = '" + cid + "';";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                int n = Integer.parseInt(rs.getString("num"));
                n--;
                if (n == 0) {
                    sql = "delete from cart where cid = '" + cid + "';";
                    r = stmt.executeUpdate(sql);
                    return r;
                }
                sql = "update cart set num='" + n + "' where cid = '" + cid + "';";
                r = stmt.executeUpdate(sql);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public ArrayList<CartBeans> AllCart() {
        ArrayList<CartBeans> al = new ArrayList<>();
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from cart;";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                CartBeans ub = new CartBeans();
                ub.setPdes(rs.getString("description"));
                ub.setPid(rs.getString("pid"));
                ub.setPname(rs.getString("pname"));
                ub.setPtype(rs.getString("ptype"));
                ub.setPrice(rs.getString("price"));
                ub.setEmail(rs.getString("email"));
                ub.setNum(rs.getString("num"));
                al.add(ub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<OrderBeans> AllOrder() {
        ArrayList<OrderBeans> al = new ArrayList<>();
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from orders;";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                OrderBeans ub = new OrderBeans();
                ub.setPdes(rs.getString("description"));
                ub.setPid(rs.getString("pid"));
                ub.setPname(rs.getString("pname"));
                ub.setPtype(rs.getString("ptype"));
                ub.setPrice(rs.getString("price"));
                ub.setEmail(rs.getString("email"));
                ub.setNum(rs.getString("num"));
                ub.setStatus(rs.getString("status"));
                al.add(ub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    
    public OrderBeans AOrder(String oid) {
        Connection conn = connectDb();
                OrderBeans ub = new OrderBeans();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from orders where oid = '"+oid+"';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ub.setPdes(rs.getString("description"));
                ub.setPid(rs.getString("pid"));
                ub.setOid(rs.getString("oid"));
                ub.setPname(rs.getString("pname"));
                ub.setPtype(rs.getString("ptype"));
                ub.setPrice(rs.getString("price"));
                ub.setEmail(rs.getString("email"));
                ub.setNum(rs.getString("num"));
                ub.setStatus(rs.getString("status"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ub;
    }

    public ArrayList<OrderBeans> AllUserOrder(String em) {
        ArrayList<OrderBeans> al = new ArrayList<>();
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from orders where email='"+em+"';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                OrderBeans ub = new OrderBeans();
                ub.setPdes(rs.getString("description"));
                ub.setPid(rs.getString("pid"));
                ub.setPname(rs.getString("pname"));
                ub.setPtype(rs.getString("ptype"));
                ub.setPrice(rs.getString("price"));
                ub.setEmail(rs.getString("email"));
                ub.setNum(rs.getString("num"));
                ub.setStatus(rs.getString("status"));
                al.add(ub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public CartBeans ACart(String cid) {
                CartBeans ub = new CartBeans();
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from cart where cid='"+cid+"';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ub.setPdes(rs.getString("description"));
                ub.setPid(rs.getString("pid"));
                ub.setPname(rs.getString("pname"));
                ub.setPtype(rs.getString("ptype"));
                ub.setPrice(rs.getString("price"));
                ub.setEmail(rs.getString("email"));
                ub.setNum(rs.getString("num"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ub;
    }

    public ArrayList<CartBeans> AllUserCart(String em) {
        ArrayList<CartBeans> al = new ArrayList<>();
        Connection conn = connectDb();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from cart where email='" + em + "';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                CartBeans ub = new CartBeans();
                ub.setPdes(rs.getString("description"));
                ub.setPid(rs.getString("pid"));
                ub.setPname(rs.getString("pname"));
                ub.setPtype(rs.getString("ptype"));
                ub.setPrice(rs.getString("price"));
                ub.setEmail(rs.getString("email"));
                ub.setNum(rs.getString("num"));
                al.add(ub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public static void main(String[] args) {
        User a = new User();
//        ArrayList<CartBeans> al = a.AllUserCart("m@22");
//        for(CartBeans cb : al) {
//            System.out.println(cb);
//        }
        System.out.println(a.Cid("m@22", "3"));
    }
}
